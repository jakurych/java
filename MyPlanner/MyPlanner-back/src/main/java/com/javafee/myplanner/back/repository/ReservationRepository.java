package com.javafee.myplanner.back.repository;

import com.javafee.myplanner.back.domain.Reservation;

import java.util.List;

public interface ReservationRepository {
    List<Reservation> findAll();
}
