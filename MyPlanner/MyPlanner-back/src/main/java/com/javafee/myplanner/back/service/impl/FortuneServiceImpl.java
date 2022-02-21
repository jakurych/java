package com.javafee.myplanner.back.service.impl;

import com.javafee.myplanner.back.domain.Fortune;
import com.javafee.myplanner.back.repository.FortuneRepository;
import com.javafee.myplanner.back.repository.impl.FortuneRepositoryImpl;
import com.javafee.myplanner.back.service.FortuneService;

import java.util.List;
import java.util.Random;

public class FortuneServiceImpl implements FortuneService {
    private FortuneRepository fortuneRepository;

    public FortuneServiceImpl() {
        this.fortuneRepository = new FortuneRepositoryImpl();
    }

    public String getRandomFortune() {
        List<Fortune> fortunes = fortuneRepository.findAll();
        return fortunes.get(new Random().nextInt(fortunes.size())).getName();
    }
}
