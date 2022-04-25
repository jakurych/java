package com.javafee.myplanner.front.elibrary.front;

import com.javafee.myplanner.back.domain.Reservation;
import com.javafee.myplanner.back.repository.impl.integration.ElibraryRepository;
import lombok.Getter;

import java.util.List;
@Getter
public class Service {

    private ElibraryRepository elibraryRepository;

    public Service(){
        this.elibraryRepository = new ElibraryRepository();
        elibraryRepository.initDao();
    }
    public List<Reservation> result(){
        return elibraryRepository.findAll();

    }


}
