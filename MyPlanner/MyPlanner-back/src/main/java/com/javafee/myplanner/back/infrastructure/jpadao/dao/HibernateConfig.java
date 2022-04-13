package com.javafee.myplanner.back.infrastructure.jpadao.dao;

import com.javafee.myplanner.back.infrastructure.jpadao.domain.Employee;
import jakarta.persistence.Entity;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.reflections.Reflections;

import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import java.util.function.Consumer;

@UtilityClass
@Slf4j
public class HibernateConfig {
    private static SessionFactory sessionFactory;
    private static Session session;

    static {
        try {
            Properties properties = new Properties();
            properties.put(Environment.DRIVER, "org.postgresql.Driver");
            properties.put(Environment.URL, "jdbc:postgresql://localhost:5432/your-planner");
            properties.put(Environment.USER, "postgres");
            properties.put(Environment.PASS, "admin123");
            properties.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQL95Dialect");
            properties.put(Environment.HBM2DDL_AUTO, "update");

            Configuration configuration = new Configuration();
            configuration.setProperties(properties);

//            Reflections reflections = new Reflections("com.javafee.myplanner.back.infrastructure.jpadao.domain");
//            Set<Class<?>> classes = reflections.getTypesAnnotatedWith(Entity.class);

//            MetadataSources sources = new MetadataSources(registry);
//            classes.forEach(sources::addAnnotatedClass);

//            Metadata metadata = sources.getMetadataBuilder().build();

            //tmp
            configuration.addAnnotatedClass(Employee.class);
            // classes.forEach(configuration::addAnnotatedClass);
            StandardServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

            sessionFactory = configuration.buildSessionFactory(registry); //metadata.getSessionFactoryBuilder().build();
            session = sessionFactory.openSession();
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }

    public void save(Employee employee) {
        transactional(e -> e.persist(employee));
    }

    private void transactional(Consumer<Session> action) {
        Transaction transaction = session.getTransaction();
        try {
            if (!transaction.isActive()) {
                transaction.begin();
                action.accept(session);
                transaction.commit();
            }
        } catch (Exception e) {
            if (!Objects.isNull(transaction))
                transaction.rollback();
            log.error(e.getMessage());
        }
    }
}
