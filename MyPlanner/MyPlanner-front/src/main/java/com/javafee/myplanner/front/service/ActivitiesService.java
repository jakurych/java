package com.javafee.myplanner.front.service;

import com.javafee.myplanner.back.domain.ActivityType;
import com.javafee.myplanner.back.repository.impl.ActivityRepositoryImpl;
import com.javafee.myplanner.back.repository.impl.ActivityTypeRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class ActivitiesService {
    private ActivityRepositoryImpl activityRepository;
    private ActivityTypeRepositoryImpl activityTypeRepository;

    public ActivitiesService() {
        this.activityRepository = new ActivityRepositoryImpl();
        this.activityTypeRepository = new ActivityTypeRepositoryImpl();
        //test

        allActivitiesTypes();
    }

    public boolean doesExist() {
        return true;
    }

    public void addActivity() {

    }

    public void deleteActivity() {

    }

    public List<String> allActivitiesTypes(){

        List<ActivityType> activityTypeName = activityTypeRepository.findAll();
        List<String> result = new ArrayList<>();
        activityTypeName.forEach(e -> result.add(e.toString()));
        return result;

    }



}
