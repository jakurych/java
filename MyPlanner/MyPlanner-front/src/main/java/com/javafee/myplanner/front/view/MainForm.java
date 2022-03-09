package com.javafee.myplanner.front.view;
import lombok.Getter;

import javax.swing.*;
import java.awt.*;

@Getter
public class MainForm {
    private JFrame frame;
    private JPanel panel;
    private JButton btnTest;
    private JLabel lblInfo;
    private JButton btnAddEvent;

    public MainForm() {
        frame = new JFrame("MainForm");
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }

}
