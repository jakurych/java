package com.javafee.myplanner.front.view;

import javax.swing.*;
import lombok.Builder;
import lombok.Getter;

@Getter
public class RegisterForm {
    private JFrame frame = new JFrame("RegisterForm");
    private JPanel RegisterForm;
    private JTextField textFieldRegisterLogin;
    private JPasswordField passwordField1;
    private JButton btnSubmit;
    private JPasswordField repeatPasswordPasswordField;
    private JLabel lblLoginError;
    private JLabel lblPasswordError;

    public RegisterForm() {
        frame.setContentPane(RegisterForm);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }
}
