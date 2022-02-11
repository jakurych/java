package com.javafee.myplanner.front.controller;

import com.javafee.myplanner.front.view.LoginForm;
import com.sun.tools.javac.Main;

public class LoginController {
    private LoginForm loginForm;
    private MainController mainController;

    public void control() {
        initialize();

        loginForm.getBtnLogin().addActionListener(e -> onClickBtnLogin());
    }

    private void initialize(){
        loginForm = new LoginForm();
//        mainController = new MainController();
        loginForm.getFrame().setVisible(true);
    }

    private void onClickBtnLogin() {
        loginForm.getFrame().setVisible(false);
        mainController.control();
    }
}
