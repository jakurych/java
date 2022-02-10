package com.javafee.myplanner.back.repository;

import com.javafee.myplanner.back.domain.Fortune;

import java.util.List;

public interface FortuneRepository {
    List<Fortune> findAll();
}
