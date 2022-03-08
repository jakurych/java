package com.javafee.myplanner.back.domain;

import lombok.Builder;

@Builder
public class ActivityType {
    private String name;
    private String description;
    private int defaultLenght;
    private int defaultDay;
}
