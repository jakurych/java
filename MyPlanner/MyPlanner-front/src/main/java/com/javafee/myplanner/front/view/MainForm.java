package com.javafee.myplanner.front.view;

import lombok.Getter;

import javax.swing.*;

@Getter
public class MainForm {
    private JFrame frame;
    private JButton btnTest;
    private JLabel lblInfo;
    private JPanel panel;
    private JPasswordField passwordField1;

    public MainForm() {
        frame = new JFrame("MyPlanner v0.1");
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }
}
