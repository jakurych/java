package com.javafee.myplanner.back.repository.impl;

import com.javafee.myplanner.back.domain.User;
import com.javafee.myplanner.back.repository.UserRepository;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
public class UserRepositoryImpl implements UserRepository {
    private static List<User> usersDb = new ArrayList<>(List.of(User.builder().login("admin").password("admin123").build(),
            User.builder().login("test").password("test123").build()));



    public Optional<User> findByLoginAndPassword(String login, String password) {
        return usersDb.stream().filter(e -> login.equals(e.getLogin()) && password.equals(e.getPassword())).findFirst();
    }


    public Optional<User> findByLogin(String rLogin) {
        return usersDb.stream().filter(e -> rLogin.equals(e.getLogin())).findFirst();
    }

    public void addUser(String login, String password){
        usersDb.add(User.builder().login(login).password(password).build());

    }

    @Override
    public List<User> findAll() {
        return usersDb;
    }



}
