package com.javafee.myplanner.back.service.impl;

import com.javafee.myplanner.back.domain.User;
import com.javafee.myplanner.back.repository.UserRepository;
import com.javafee.myplanner.back.repository.impl.UserRepositoryImpl;
import com.javafee.myplanner.back.service.RegisterService;

import java.util.List;

public class RegisterServiceImpl implements RegisterService {

    private UserRepository repository;

    public RegisterServiceImpl() {
        this.repository = new UserRepositoryImpl();

    }
    public boolean registration(String rLogin, String rPassword1, String rPassword2){

        if(!this.checkLogin(rLogin)) {
            if (this.checkPassword(rPassword1, rPassword2)) {

                repository.addUser(rLogin,rPassword1);
                return true;


            }
            return false;
        }
        return false;

    }


    public boolean checkLogin(String rLogin){

        return repository.findByLogin(rLogin).isPresent();
    }
    public boolean checkPassword(String rPassword1, String rPassword2){

        return rPassword1.equals(rPassword2);

    }

}
