package com.javafee.myplanner.front.view;
import com.toedter.calendar.JDateChooser;
import lombok.Getter;

import javax.swing.*;

@Getter
public class MainForm {
    private JFrame frame;
    private JPanel panel;
    private JButton btnAddEvent;
    private JComboBox boxWithTypes;
    private JDateChooser dateChooser;

    public MainForm() {
        frame = new JFrame("MainForm");
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        dateChooser = new JDateChooser();
        dateChooser.setDateFormatString("dd.MM.yyyy");
    }
}
