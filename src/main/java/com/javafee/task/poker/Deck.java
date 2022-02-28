package com.javafee.task.poker;// add your own banner here

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class  Deck {

    final static int NUMBERS_OF_SIUTS = 4;
    final static int NUMBERS_OF_VALUE = 13;
    final static int NUMBER_OF_CARDS = 52;
    private Card[] cards = new Card[NUMBER_OF_CARDS];
    private int top; // the index of the top of the deck

    // add more instance variables if needd

    public Deck() {
        // make a 52 card deck here

        //generating 52 cards
        int cardIndex = 0;
        for (int suits = 1; suits <= NUMBERS_OF_SIUTS; suits++) {
            for (int value = 1; value <= NUMBERS_OF_VALUE; value++) {
                cards[cardIndex] = new Card(suits, value);
                cardIndex++;
            }
        }
        top = 51;
        //card generator test
        /*for(int i =0; i< cards.length;i++){
            System.out.println(cards[i]);
        }*/
    }

    public void shuffle() {
        // shuffle the deck here

        //https://stackoverflow.com/questions/1519736/random-shuffling-of-an-array
        Random rnd = ThreadLocalRandom.current();
        for (int i = cards.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            Card temp = cards[index];
            cards[index] = cards[i];
            cards[i] = temp;
        }


    }


    public Card deal() {
        // deal the top card in the deck
        if(top == -1){
            System.out.println("End of cards!");
            shuffle();
            top = 51;
        }
        return cards[top--];
    }

    // add more methods here if needed
}