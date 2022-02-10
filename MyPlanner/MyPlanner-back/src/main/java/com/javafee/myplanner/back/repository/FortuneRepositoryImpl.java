package com.javafee.myplanner.back.repository;

import com.javafee.myplanner.back.domain.Fortune;

import java.util.ArrayList;
import java.util.List;

public class FortuneRepositoryImpl implements FortuneRepository {
    private List<Fortune> fortunesDb = new ArrayList<>(List.of(Fortune.builder().name("Good fortune!").build(),
            Fortune.builder().name("Very good fortune!").build(),
            Fortune.builder().name("Bad fortune!").build(),
            Fortune.builder().name("Normal fortune!").build()));

    @Override
    public List<Fortune> findAll() {
        return fortunesDb;
    }
}
