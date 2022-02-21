package com.javafee.myplanner.front;

import com.javafee.myplanner.front.controller.LoginController;
import lombok.extern.java.Log;

import javax.swing.*;

@Log
public class MyPlanner {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new LoginController().control();
        } catch (ClassNotFoundException | InstantiationException
                | IllegalAccessException | UnsupportedLookAndFeelException e) {
            log.severe(e.getMessage());
        }
    }
}
