package com.javafee.myplanner.front;

import com.javafee.myplanner.front.controller.MainFormController;
import lombok.extern.java.Log;

import javax.swing.*;

@Log
public class MyPlanner {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new MainFormController().control();
        } catch (ClassNotFoundException | InstantiationException
                | IllegalAccessException | UnsupportedLookAndFeelException e) {
            log.severe(e.getMessage());
        }
    }
}
