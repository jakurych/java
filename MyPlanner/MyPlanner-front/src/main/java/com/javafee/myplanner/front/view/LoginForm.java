package com.javafee.myplanner.front.view;

import lombok.Getter;

import javax.swing.*;

@Getter
public class LoginForm {
    private JFrame frame;
    private JPanel panel;
    private JPasswordField passwordField;
    private JTextField textFieldLogin;
    private JButton btnLogin;

    public LoginForm() {
        frame = new JFrame("LoginForm");
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }
}
