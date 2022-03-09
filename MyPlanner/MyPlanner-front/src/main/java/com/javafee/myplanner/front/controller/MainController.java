package com.javafee.myplanner.front.controller;
import com.javafee.myplanner.front.service.ActivitiesService;
import com.javafee.myplanner.front.service.MainService;
import com.javafee.myplanner.front.view.ActivitiesForm;
import com.javafee.myplanner.front.view.MainForm;

public class MainController {
    private MainForm mainForm;
    private MainService mainFormService;
    private ActivitiesForm activitiesForm;
    private ActivitiesService activitiesService;
    private ActivitiesController activitiesController;

    public void control() {
        initialize();

        mainForm.getBtnTest().addActionListener(e -> onClickBtnTest());
        mainForm.getBtnAddEvent().addActionListener(e -> onClickBtnActivities());
    }

    private void initialize() {
        activitiesController = new ActivitiesController();

        mainForm = new MainForm();
        mainFormService = new MainService();
        mainForm.getFrame().setVisible(true);
    }

    private void onClickBtnTest() {
        mainForm.getLblInfo().setText(mainFormService.getFortune());
    }
    private void onClickBtnActivities(){
        activitiesForm = new ActivitiesForm();
        activitiesController.control();
        mainForm.getFrame().setVisible(false);
    }
}
