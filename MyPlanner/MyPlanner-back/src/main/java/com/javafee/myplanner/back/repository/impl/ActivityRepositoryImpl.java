package com.javafee.myplanner.back.repository.impl;

import com.javafee.myplanner.back.domain.Activity;
import com.javafee.myplanner.back.domain.ActivityType;
import com.javafee.myplanner.back.domain.User;
import com.javafee.myplanner.back.repository.ActivityRepository;

import java.awt.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import lombok.*;
//implementacja metod z interfejsu

@Builder
@Getter
public class ActivityRepositoryImpl implements ActivityRepository {
    private static List<Color> colorsDb = new ArrayList<>();
    private static List<Activity> activityDb = new ArrayList<>();
    private static List<ActivityType> activityTypesDb = new ArrayList<>(List.of(ActivityType.builder().name("Sport").defaultDay(1).defaultLenght(1).build())

    );





    public void addActivity(Activity activity) {
        activityDb.add(activity);
    }
}
