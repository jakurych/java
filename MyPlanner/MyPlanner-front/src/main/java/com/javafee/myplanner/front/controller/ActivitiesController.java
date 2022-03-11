package com.javafee.myplanner.front.controller;
import com.javafee.myplanner.back.domain.ActivityType;
import com.javafee.myplanner.front.service.ActivitiesService;
import com.javafee.myplanner.front.view.ActivitiesForm;
import com.javafee.myplanner.front.view.AddActivityForm;
import com.javafee.myplanner.front.view.AddTypeForm;

import java.awt.*;
import java.util.Date;

public class ActivitiesController {
    private ActivitiesController activitiesController;
    private ActivitiesForm activitiesForm;
    private ActivitiesService activitiesService;
    private AddTypeForm addTypeForm;
    private AddActivityForm addActivityForm;
    private Date date;


    public void control(){
        initialize();
        activitiesForm.getBtnAddNewActivity().addActionListener(e -> onClickBtnAddActivity());
        activitiesForm.getBtnAddNewType().addActionListener(e -> onClickBtnAddNewType());
        addActivityForm.getBtnSubmit().addActionListener(e -> submitActivity());

        //TODO: for testing
        //addActivityForm.getColorChooser();
        addActivityForm.getColorChooser().setColor(Color.BLACK);

    }

    private void initialize() {
        addActivityForm = new AddActivityForm();
        addTypeForm = new AddTypeForm();
        activitiesForm = new ActivitiesForm();
        activitiesService = new ActivitiesService();
        activitiesForm.getFrame().setVisible(true);

    }
    public void onClickBtnAddActivity(){
        addActivityForm.getFrame().setVisible(true);
    }
    public void onClickBtnAddNewType(){
        addTypeForm.getFrame().setVisible(true);
            }
    public void submitActivity(){
        String name = addActivityForm.getTextFieldName().getText();
        String description = addActivityForm.getTextFieldDescription().getText();
        Color color = addActivityForm.getColorChooser().getColor();
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();
        ActivityType type = (ActivityType) addActivityForm.getBoxWithTypes().getSelectedItem();
        int defaultDuration = (Integer) addActivityForm.getSpinner1().getValue();
        //addActivityForm.getColorChooser().setColor(Color.BLACK);
        /*
         private String name;
    private Date dateFrom;
    private Date dateTo;
    private String color;
    private ActivityType activityType;
         */
    }
    public void submitType(){
        String name = addTypeForm.getTextFieldName().getText();
        Color color = addActivityForm.getColorChooser().getColor();
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();
    }


    public Date getDate(Date date){
        this.date = date;
        return date;
    }


}
