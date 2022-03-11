package com.javafee.myplanner.front.view;

import lombok.Getter;

import javax.swing.*;

@Getter
public class AddActivityForm {
    private JFrame frame;
    private JLabel lblName;
    private JTextField textFieldName;
    private JComboBox boxWithTypes;
    private JLabel lblType;
    private JLabel lblColor;
    private JButton btnSubmit;
    private JLabel lblTime;
    private JPanel panel;
    private JSpinner spinner1;
    private JColorChooser colorChooser;
    private JTextField textFieldDescription;

    public AddActivityForm() {
        frame = new JFrame("ActivitiesForm");
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        spinner1 = new JSpinner();
        //SpinnerNumberModel model = new SpinnerNumberModel(1, 0, Double.MAX_VALUE, 0.25);
        //spinner1.setModel(model);
        //1
    }

}
