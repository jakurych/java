package com.javafee.myplanner.back.domain;

import java.util.Date;
import lombok.*;

@Builder
@Getter
public class Activity {
    private String name;
    private Date dateFrom;
    private Date dateTo;
    private int color;

}
