package com.javafee.myplanner.back.repository;

import com.javafee.myplanner.back.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    Optional<User> findByLoginAndPassword(String login, String password);

    Optional<User> findByLogin(String rLogin);

    void addUser(String login, String password);

    List<User> findAll();
    }
