package com.javafee.myplanner.front.view;
import lombok.*;
import javax.swing.*;
@Getter
@Setter
public class ActivitiesForm {
    private JFrame frame;
    private JButton btnAddNewActivity;
    private JPanel panel;
    private JLabel lblName;
    private JLabel lblActivities;

    public ActivitiesForm(){
        frame = new JFrame("ActivitiesForm");
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }
}
