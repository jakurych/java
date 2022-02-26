package com.javafee.myplanner.front.controller;
import com.javafee.myplanner.front.service.ActivitiesService;
import com.javafee.myplanner.front.service.MainService;
import com.javafee.myplanner.front.view.ActivitiesForm;
import com.javafee.myplanner.front.view.AddActivityForm;
import com.javafee.myplanner.front.view.MainForm;

public class ActivitiesController {
    private ActivitiesController activitiesController;
    private ActivitiesForm activitiesForm;
    private AddActivityForm addActivityForm;

    public void control(){
        initialize();
        activitiesForm.getBtnAddNewActivity().addActionListener(e -> onClickBtnAddActivity());
    }

    private void initialize() {
        activitiesForm = new ActivitiesForm();
        activitiesForm.getFrame().setVisible(true);
    }
    public void onClickBtnAddActivity(){
        addActivityForm = new AddActivityForm();
        addActivityForm.getFrame().setVisible(true);
    }


}
