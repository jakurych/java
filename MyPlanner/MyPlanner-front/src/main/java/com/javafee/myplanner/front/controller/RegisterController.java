package com.javafee.myplanner.front.controller;

import com.javafee.myplanner.front.service.RegisterService;
import com.javafee.myplanner.front.view.LoginForm;
import com.javafee.myplanner.front.view.RegisterForm;

import java.awt.event.ActionListener;

public class RegisterController {
    private RegisterForm registerForm;
    private RegisterService registerService;
    private LoginForm loginForm;


    public void control(LoginForm loginForm){
        this.loginForm = loginForm;
        initialize();
        registerForm.getBtnSubmit().addActionListener(e -> onClickBtnSubmit() );

    }
    private void initialize(){
        registerForm = new RegisterForm();
        registerService = new RegisterService();
        registerForm.getFrame().setVisible(true);
    }
   private void onClickBtnSubmit(){
        String login = registerForm.getTextFieldRegisterLogin().getText();
        String password1;
       password1 = String.valueOf(registerForm.getPasswordField1().getPassword());
       String password2;
       password2 = String.valueOf(registerForm.getRepeatPasswordPasswordField().getPassword());
       if(registerService.registration(login, password1, password2)){
           registerForm.getFrame().setVisible(false);
           loginForm.getFrame().setVisible(true);
       }else{
           registerForm.getLblPasswordError().setText("Nieudana próba rejestracji");
       }
   }



}
