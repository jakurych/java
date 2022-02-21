package com.javafee.myplanner.back.service;

import com.javafee.myplanner.back.service.impl.RegisterServiceImpl;


public interface RegisterService  {

    public boolean checkLogin(String rLogin);
    public boolean checkPassword(String rPassword1, String rPassword2);


}
