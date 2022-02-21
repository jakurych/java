package com.javafee.myplanner.back.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class User {
    private String login;
    private String password;
}
