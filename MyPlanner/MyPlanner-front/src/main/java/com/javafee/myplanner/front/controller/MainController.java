package com.javafee.myplanner.front.controller;
import com.javafee.myplanner.front.service.ActivitiesService;
import com.javafee.myplanner.front.service.MainService;
import com.javafee.myplanner.front.view.ActivitiesForm;
import com.javafee.myplanner.front.view.MainForm;
import javax.swing.*;
import java.util.Date;

public class MainController {
    private MainForm mainForm;
    private MainService mainFormService;
    private ActivitiesForm activitiesForm;
    private ActivitiesService activitiesService;
    private ActivitiesController activitiesController;
    private Date date;
   // godzina rozpoczecia
    // godzina zakończenia


    public void control() {
        initialize();

      //  mainForm.getBtnTest().addActionListener(e -> onClickBtnTest());
        mainForm.getBtnAddEvent().addActionListener(e -> onClickBtnActivities());
    }

    private void initialize() {
        activitiesController = new ActivitiesController();
        activitiesService = new ActivitiesService();
        mainForm = new MainForm();
        mainFormService = new MainService();
        mainForm.getFrame().setVisible(true);
        boxWithTypes();
    }

    private void onClickBtnTest() {
      // mainForm.getLblInfo().setText(mainFormService.getFortune());
    }
    private void onClickBtnActivities(){
        activitiesForm = new ActivitiesForm();
        activitiesController.control();
       // mainForm.getFrame().setVisible(false);
    }
    private void saveDate(){
        this.date = new Date();
        date = mainForm.getDateChooser().getDate();

        activitiesController.getDate(date);
    }
    public void boxWithTypes(){

        for (String box: activitiesService.allActivitiesTypes()
        ) {
            mainForm.getBoxWithTypes().addItem(box);
        }

    }



}
