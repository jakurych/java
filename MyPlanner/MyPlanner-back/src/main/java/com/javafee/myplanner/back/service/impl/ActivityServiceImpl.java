package com.javafee.myplanner.back.service.impl;
import com.javafee.myplanner.back.domain.Activity;
import com.javafee.myplanner.back.domain.ActivityType;
import com.javafee.myplanner.back.repository.impl.ActivityTypeRepositoryImpl;
import com.javafee.myplanner.back.repository.ActivityRepository;
import com.javafee.myplanner.back.repository.impl.ActivityRepositoryImpl;
import com.javafee.myplanner.back.service.ActivityService;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

public class ActivityServiceImpl implements ActivityService {

    private ActivityRepository activityRepository;

    public ActivityServiceImpl(){
        this.activityRepository =new ActivityRepositoryImpl();

    }


    //add activity
    public void addActivity(Activity activity){
        activityRepository.addActivity(activity);
    }

    @Override
    public void showActivityTypes() {

    }


    //get user activities

    public void findAll(){
        activityRepository.findAll();
    }



    //
}
