package com.javafee.myplanner.back.domain;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class User {
    private String login;
    private String password;
}
