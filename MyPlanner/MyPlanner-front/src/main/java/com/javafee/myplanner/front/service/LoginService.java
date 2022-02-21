package com.javafee.myplanner.front.service;

import com.javafee.myplanner.back.repository.UserRepository;
import com.javafee.myplanner.back.repository.impl.UserRepositoryImpl;

public class LoginService {

    private UserRepository repository;

    public LoginService() {
        this.repository = new UserRepositoryImpl();
    }

    public boolean check(String login, String password) {
        return repository.findByLoginAndPassword(login, password).isPresent();
    }


}
