package com.javafee.myplanner.back.infrastructure.jpadao;

import com.javafee.myplanner.back.infrastructure.jpadao.dao.HibernateConfig;
import com.javafee.myplanner.back.infrastructure.jpadao.domain.Employee;

public class TestMain {
    public static void main(String[] args) {
        HibernateConfig.save(Employee.builder().id(14).name("Jan").surname("Kowalski").salary(15000).build());
    }
}
