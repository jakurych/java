package com.javafee.task.poker;

import java.util.Comparator;

public class CardComperator implements Comparator<Card> {

    @Override
    public int compare(Card c1, Card c2) {


        if(c1.getRank()==c2.getRank()) {
            return Integer.compare(c1.getSuit(),c2.getSuit());
        }
        return Integer.compare(c1.getRank(),c2.getRank());
        }
}
