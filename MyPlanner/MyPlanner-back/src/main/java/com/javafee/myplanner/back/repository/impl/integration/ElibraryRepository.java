package com.javafee.myplanner.back.repository.impl.integration;

import com.javafee.myplanner.back.domain.Reservation;
import com.javafee.myplanner.back.infrastructure.jdbcdao.elibintegration.DaoELibrary;
import com.javafee.myplanner.back.repository.ReservationRepository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ElibraryRepository implements ReservationRepository {
    private DaoELibrary daoELibrary;

    public ElibraryRepository() {
    }

    public void initDao() {
        this.daoELibrary = new DaoELibrary();
    }

    @Override
    public List<Reservation> findAll() {
        //TODO: use daoElibrary to fetch the data, map the ResultSet into the List of reservation
        return daoELibrary.findAll();
    }
}
