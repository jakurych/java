package com.javafee.myplanner.front.service;

import com.javafee.myplanner.back.repository.impl.ActivityRepositoryImpl;

public class ActivitiesService {
    private ActivityRepositoryImpl activityRepository;

    public ActivitiesService() {
        this.activityRepository = new ActivityRepositoryImpl();
    }

    public boolean doesExist() {
        return true;
    }

    public void addActivity() {

    }

    public void deleteActivity() {

    }


}
