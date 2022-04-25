package com.javafee.myplanner.front.elibrary.front;

import com.javafee.myplanner.back.domain.Reservation;

import java.util.List;

public class Controller {

    private Service service;
    private View view;

    public void control(){
        initialize();
        view.getButton().addActionListener(e -> onClickBtn());
    }
    public void initialize(){
        this.view = new View();
        this.service = new Service();
        view.getFrame().setVisible(true);
    }

    public void onClickBtn(){
        insertData();
    }
    public void insertData(){
        List<Reservation> reservationList = service.result();
        String text = "";
        for(Reservation r : reservationList) {
            text += r.toString() + "\n";
        }
        view.getListReservations().setText(text);
    }




}
