package com.javafee.myplanner.back.repository;
import com.javafee.myplanner.back.domain.Activity;


//metody interfejsu z których korzysta frontend

public interface ActivityRepository {
    void addActivity(Activity activity);
}
