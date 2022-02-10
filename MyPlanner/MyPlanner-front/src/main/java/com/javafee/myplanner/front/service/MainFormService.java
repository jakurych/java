package com.javafee.myplanner.front.service;

import com.javafee.myplanner.back.domain.Fortune;
import com.javafee.myplanner.back.repository.FortuneRepository;
import com.javafee.myplanner.back.repository.FortuneRepositoryImpl;

import java.util.List;
import java.util.Random;

public class MainFormService {
    private FortuneRepository fortuneRepository;

    public MainFormService() {
        fortuneRepository = new FortuneRepositoryImpl();
    }

    public String getFortune() {
        List<Fortune> fortunes = fortuneRepository.findAll();
        return fortunes.get(new Random().nextInt(fortunes.size() + 1)).getName();
    }
}
