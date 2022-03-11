package com.javafee.myplanner.front.service;

import com.javafee.myplanner.back.service.FortuneService;
import com.javafee.myplanner.back.service.impl.FortuneServiceImpl;
import com.javafee.myplanner.front.controller.MainController;

import java.util.Date;

public class MainService {
    private FortuneService fortuneService;

    public MainService() {
        fortuneService = new FortuneServiceImpl();
    }

    public String getFortune() {
        return fortuneService.getRandomFortune();
    }




}
