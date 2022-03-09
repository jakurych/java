package com.javafee.myplanner.back.repository;
import com.javafee.myplanner.back.domain.Activity;
import com.javafee.myplanner.back.domain.ActivityType;

import java.util.List;


//metody interfejsu z których korzysta frontend

public interface ActivityRepository {
    void addActivity(Activity activity);
    List<ActivityType> findAll();

}
