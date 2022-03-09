package com.javafee.myplanner.front.controller;
import com.javafee.myplanner.back.domain.ActivityType;
import com.javafee.myplanner.front.service.ActivitiesService;
import com.javafee.myplanner.front.view.ActivitiesForm;
import com.javafee.myplanner.front.view.AddActivityForm;

import java.awt.*;

public class ActivitiesController {
    private ActivitiesController activitiesController;
    private ActivitiesForm activitiesForm;
    private AddActivityForm addActivityForm;
    private ActivitiesService activitiesService;

    public void control(){
        initialize();
        activitiesForm.getBtnAddNewActivity().addActionListener(e -> onClickBtnAddActivity());
        addActivityForm.getBtnSubmit().addActionListener(e -> submitActivity());
        //TODO: for testing
        //addActivityForm.getColorChooser();
        addActivityForm.getColorChooser().setColor(Color.BLACK);

    }

    private void initialize() {
        addActivityForm = new AddActivityForm();
        activitiesForm = new ActivitiesForm();
        activitiesService = new ActivitiesService();
        activitiesForm.getFrame().setVisible(true);
        boxWithTypes();
    }
    public void onClickBtnAddActivity(){
        addActivityForm.getFrame().setVisible(true);
    }
    public void submitActivity(){
        String name = addActivityForm.getTextFieldName().getText();
        // String color = addActivityForm.getBoxWithColor().getSelectedItem().toString();
        Color color = addActivityForm.getColorChooser().getColor();

        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();
        ActivityType type = (ActivityType) addActivityForm.getBoxWithTypes().getSelectedItem();
        //addActivityForm.getColorChooser().setColor(Color.BLACK);


        /*
         private String name;
    private Date dateFrom;
    private Date dateTo;
    private String color;
    private ActivityType activityType;
         */
    }
    public void boxWithTypes(){


        for (String box: activitiesService.allActivitiesTypes()
             ) {
            addActivityForm.getBoxWithTypes().addItem(box);
        }

    }




}
