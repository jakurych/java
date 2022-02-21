package com.javafee.myplanner.front.service;

import com.javafee.myplanner.back.service.FortuneService;
import com.javafee.myplanner.back.service.impl.FortuneServiceImpl;

public class MainService {
    private FortuneService fortuneService;

    public MainService() {
        fortuneService = new FortuneServiceImpl();
    }

    public String getFortune() {
        return fortuneService.getRandomFortune();
    }



}
