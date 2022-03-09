package com.javafee.myplanner.back.service;

public interface RegisterService  {

    public boolean checkLogin(String rLogin);
    public boolean checkPassword(String rPassword1, String rPassword2);


}
