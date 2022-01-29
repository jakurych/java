package com.javafee.task.poker;

public class PokerTest {
    //this class must remain unchanged
    //your code must work with this test class
                            //argumenty wywołania programu
    public static void main(String[] args) {
        if (args.length < 1) { // tryb normalny gry
            Game g = new Game();         // klasa game
            g.play();                   //metoda play
        } else { // tryb testowy
            Game g = new Game(args);
            g.play();
        }
    }
}