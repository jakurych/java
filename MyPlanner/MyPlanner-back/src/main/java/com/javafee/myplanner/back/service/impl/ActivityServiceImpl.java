package com.javafee.myplanner.back.service.impl;

import com.javafee.myplanner.back.domain.Activity;
import com.javafee.myplanner.back.repository.impl.ActivityRepositoryImpl;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

public class ActivityServiceImpl {
    private ActivityRepositoryImpl activityRepository =new ActivityRepositoryImpl() ;

    //add activity
    public void addActivity(Activity activity){
        activityRepository.addActivity(activity);
    }
    //get user activities
    //
}
