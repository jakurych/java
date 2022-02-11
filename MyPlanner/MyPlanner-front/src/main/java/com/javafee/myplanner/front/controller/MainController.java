package com.javafee.myplanner.front.controller;
import com.javafee.myplanner.front.service.MainService;
import com.javafee.myplanner.front.view.MainForm;

public class MainController {
    private MainForm mainForm;
    private MainService mainFormService;

    public void control() {
        initialize();

        mainForm.getBtnTest().addActionListener(e -> onClickBtnTest());
    }

    private void initialize() {
        mainForm = new MainForm();
        mainFormService = new MainService();
        mainForm.getFrame().setVisible(true);
    }

    private void onClickBtnTest() {
        mainForm.getLblInfo().setText(mainFormService.getFortune());
    }
}
