package com.javafee.myplanner.front.view;

import lombok.Getter;

import javax.swing.*;

@Getter
public class AddTypeForm {
    private JFrame frame;
    private JPanel panel;
    private JList listOfTypes;
    private JTextField textFieldName;
    private JTextField textFieldDescription;
    private JButton btnSubmit;
    private JColorChooser colorChooser;

    public AddTypeForm() {
        frame = new JFrame("AddTypeForm");
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
    }

}
