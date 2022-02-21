package com.javafee.myplanner.front.view;
import lombok.Getter;

import javax.swing.*;

@Getter
    public class MainForm{
    private JFrame frame;
    private JPanel panel;
    private JButton btnTest;
    private JLabel lblInfo;
    private JButton btnAddEvent;
    private JTextArea textAreaEventsList;

    public MainForm(){
        frame = new JFrame("MainForm");
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }
}
