package com.javafee.myplanner.front.service;

import com.javafee.myplanner.back.repository.UserRepository;
import com.javafee.myplanner.back.repository.impl.UserRepositoryImpl;
import com.javafee.myplanner.back.service.impl.RegisterServiceImpl;
import com.javafee.myplanner.front.view.RegisterForm;

public class RegisterService {

private RegisterServiceImpl registerService;
private UserRepositoryImpl userRepository;

    public RegisterService() {
        this.registerService = new RegisterServiceImpl();
        this.userRepository = new UserRepositoryImpl();
    }

    public boolean registration(String login, String password1, String password2){
        boolean isRegister = registerService.registration(login, password1, password2);
        System.out.println(userRepository.findAll());
        return isRegister;
    }
}
