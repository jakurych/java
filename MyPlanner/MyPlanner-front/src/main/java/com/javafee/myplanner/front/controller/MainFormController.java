package com.javafee.myplanner.front.controller;
import com.javafee.myplanner.front.service.MainFormService;
import com.javafee.myplanner.front.view.MainForm;

import java.util.Random;

public class MainFormController {
    private MainForm mainForm;
    private MainFormService mainFormService;

    public void control() {
        initialize();

        mainForm.getBtnTest().addActionListener(e -> onClickBtnTest());
    }

    private void initialize() {
        mainForm = new MainForm();
        mainFormService = new MainFormService();
        mainForm.getFrame().setVisible(true);
    }

    private void onClickBtnTest() {
        mainForm.getLblInfo().setText(mainFormService.getFortune());
    }
}
