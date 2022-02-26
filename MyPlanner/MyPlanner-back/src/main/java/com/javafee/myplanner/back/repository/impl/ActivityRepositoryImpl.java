package com.javafee.myplanner.back.repository.impl;

import com.javafee.myplanner.back.domain.Activity;
import com.javafee.myplanner.back.domain.User;
import com.javafee.myplanner.back.repository.ActivityRepository;

import java.util.ArrayList;
import java.util.List;
import lombok.*;
//implementacja metod z interfejsu


public class ActivityRepositoryImpl implements ActivityRepository {
    private static List<Activity> activityDb = new ArrayList<>();


    public void addActivity(Activity activity) {
        activityDb.add(activity);
    }
}
