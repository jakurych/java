package com.javafee.myplanner.back.repository.impl.integration;

import com.javafee.myplanner.back.domain.Reservation;
import com.javafee.myplanner.back.infrastructure.jdbcdao.elibintegration.DaoELibrary;
import com.javafee.myplanner.back.repository.ReservationRepository;

import java.util.List;

public class ElibraryRepository implements ReservationRepository {
    private DaoELibrary daoELibrary;

    public ElibraryRepository() {
        this.daoELibrary = new DaoELibrary();
    }

    @Override
    public List<Reservation> findAll() {
        //TODO: use daoElibrary to fetch the data, map the ResultSet into the List of reservation
        return null;
    }
}
