package com.javafee.myplanner.back.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.Duration;
import java.util.Date;

@Builder
@Getter
public class Activity {
    private String name;
    private Date dateFrom;
    private Date dateTo;
    private Color color;
    private ActivityType activityType;
    private boolean isRepeatable;

}
