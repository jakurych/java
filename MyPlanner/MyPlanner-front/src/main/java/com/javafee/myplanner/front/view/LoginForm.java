package com.javafee.myplanner.front.view;

import lombok.Getter;

import javax.swing.*;
import java.awt.*;

@Getter
public class LoginForm {
    private JFrame frame;
    private JPanel panel;
    private JPasswordField passwordField;
    private JTextField textFieldLogin;
    private JButton btnLogin;
    private JLabel lblLoginError;
    private JButton btnRegister;

    public LoginForm() {
        frame = new JFrame("LoginForm");
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }

}
