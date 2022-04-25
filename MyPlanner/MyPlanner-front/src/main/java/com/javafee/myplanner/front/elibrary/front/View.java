package com.javafee.myplanner.front.elibrary.front;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
@Setter
@Getter
public class View {
    private JPanel panel1;
    private JButton button;
    private JTextPane listReservations;
    private JFrame frame;


    public View() {
        frame = new JFrame("View");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }
}
