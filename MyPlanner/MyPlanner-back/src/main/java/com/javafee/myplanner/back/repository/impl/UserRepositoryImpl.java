package com.javafee.myplanner.back.repository.impl;

import com.javafee.myplanner.back.domain.User;
import com.javafee.myplanner.back.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepositoryImpl implements UserRepository {
    private List<User> usersDb = new ArrayList<>(List.of(
            User.builder().login("admin").password("admin123").build(),
            User.builder().login("test").password("test123").build()));


    @Override
    public Optional<User> findByLoginAndPassword(String login, String password) {
        return usersDb.stream().filter(e -> login.equals(e.getLogin()) && password.equals(e.getPassword()))
                .findFirst();
    }
}
