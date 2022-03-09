package com.javafee.myplanner.back.repository;

import com.javafee.myplanner.back.domain.ActivityType;

import java.util.List;

public interface ActivityTypeRepository {
    void addActivityType(ActivityType activityType);
     List<ActivityType> findAll();
}
