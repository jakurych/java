package com.javafee.myplanner.front.view;
import lombok.*;
import javax.swing.*;
import java.awt.*;

@Getter
@Setter
public class ActivitiesForm {
    private JFrame frame;
    private JButton btnAddNewActivity;
    private JPanel panel;
    private JLabel lblName;
    private JList activitiesList;
    private JButton btnAddNewType;

    public ActivitiesForm() {
        frame = new JFrame("ActivitiesForm");
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
    }

}
