package com.javafee.myplanner.back.repository.impl;

import com.javafee.myplanner.back.domain.ActivityType;
import com.javafee.myplanner.back.repository.ActivityTypeRepository;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@Getter
public class ActivityTypeRepositoryImpl implements ActivityTypeRepository {

    private static List<ActivityType> activityTypesDb = new ArrayList<>(List.of(ActivityType.builder().name("Sport").defaultDay(1).defaultLenght(1).build(),
            ActivityType.builder().name("Mindfulness").defaultDay(1).defaultLenght(1).build())
    );

    @Override
    public void addActivityType(ActivityType activityType) {

    }
    public List<ActivityType> findAll(){
        return activityTypesDb;
    }

}
