package com.javafee.myplanner.front.controller;

import com.javafee.myplanner.back.repository.UserRepository;
import com.javafee.myplanner.front.service.LoginService;
import com.javafee.myplanner.front.view.LoginForm;
import com.javafee.myplanner.front.view.RegisterForm;

import javax.management.StringValueExp;

public class LoginController {
    private LoginForm loginForm;
    private MainController mainController;
    private LoginService loginService;
    private RegisterController registerController;

    public void control() {
        initialize();
        loginForm.getBtnLogin().addActionListener(e -> onClickBtnLogin());
        loginForm.getBtnRegister().addActionListener(e->onClickBtnRegister());
    }

    private void initialize(){ //wszystko co do GUI
        loginForm = new LoginForm();
        mainController = new MainController();
        loginService = new LoginService();

        loginForm.getFrame().setVisible(true);
    }

    private void onClickBtnLogin() {
        String login = loginForm.getTextFieldLogin().getText();
        String password = String.valueOf(loginForm.getPasswordField().getPassword());

        boolean access = loginService.check(login, password);
        if(access) {
            loginForm.getFrame().setVisible(false);
            mainController.control();
        }else
        {
            loginForm.getLblLoginError().setText("Wpisano błędne hasło");
        }
    }
    private void onClickBtnRegister(){
        registerController = new RegisterController();
        registerController.control(loginForm);
        loginForm.getFrame().setVisible(false);
        System.out.println("console message");

    }


}