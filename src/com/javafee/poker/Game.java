package com.javafee.poker;// add your own banner here

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Game {
    public double startTokens; //= 5;//ThreadLocalRandom.current().nextInt(1, 5);
    private Player p;
    private Deck cards; //card(suit,value)
    public int gameCounter =0;

    // you'll probably need some more here

    public Game(String[] testHand) {
        // This constructor is to help test your code.
        // use the contents of testHand to
        // make a hand for the player
        // use the following encoding for cards
        // c = clubs
        // d = diamonds
        // h = hearts
        // s = spades
        // 1-13 correspond to ace-king
        // example: s1 = ace of spades
        // example: testhand = {s1, s13, s12, s11, s10} = royal flush
    }

    public Game() {
        // This no-argument constructor is to actually play a normal game
        //TODO: inicjalizacja pol (com.javafee.poker.Deck i com.javafee.poker.Player)
        this.cards = new Deck();
        this.p = new Player();
    }

    public void play() {
        // this method should play the game
        // get bets from the player
        p.getBetsForGame();

        // cards shuffling

            cards.shuffle();

        // player hand population
        checkHand(p.getHand());

        //get hand
        for (int i = 0; i < 5; i++) {
            p.addCard(cards.deal());
        }
        //sort hand
        sort(p.getHand());

        // display cards
        displayCards(p.getHand());

        System.out.println("Your bet: " + p.getBet());

        int pointsBefore = points(p.getHand());
        displayPoints(pointsBefore);

        // rejections
        performRejections(p.getHand());

        // points calculations and assignment
        int pointsAfter = points(p.getHand());
        displayPoints(pointsAfter);

        wins(pointsBefore, pointsAfter);
    }


    public void displayCards(ArrayList<Card> hand) {
        for (int i = 4; i >= 0; i--) {
            int suit = hand.get(i).getSuit();
            int value = hand.get(i).getRank();

            switch (value) {
                case 1:
                    System.out.print("2 ");
                    break;
                case 2:
                    System.out.print("3 ");
                    break;
                case 3:
                    System.out.print("4 ");
                    break;
                case 4:
                    System.out.print("5 ");
                    break;
                case 5:
                    System.out.print("6 ");
                    break;
                case 6:
                    System.out.print("7 ");
                    break;
                case 7:
                    System.out.print("8 ");
                    break;
                case 8:
                    System.out.print("9 ");
                    break;
                case 9:
                    System.out.print("10 ");
                    break;
                case 10:
                    System.out.print("J ");
                    break;
                case 11:
                    System.out.print("Q ");
                    break;
                case 12:
                    System.out.print("K ");
                    break;
                case 13:
                    System.out.print("A ");
                    break;
            }
            switch (suit) {
                case 1:
                    System.out.print("♦ (karo)\n");
                    break;
                case 2:
                    System.out.print("♥ (kier)\n");
                    break;
                case 3:
                    System.out.print("♤ (pik)\n");
                    break;
                case 4:
                    System.out.print("♧ (trefl)\n");
                    break;
            }
        }
    }

    public void displayPoints(int points){

        if (points == 100 ){
            System.out.println("Royal Flush!");
            System.out.println("Points for this hand: 100");
        }
        if (points == 75){
            System.out.println("Straight Flush!");
            System.out.println("Points for this hand: 75");
        }
        if (points == 50){
            System.out.println("Four of kind!");
            System.out.println("Points for this hand: 50");
        }
        if (points == 25){
            System.out.println("Full house!");
            System.out.println("Points for this hand: 25");
        }
        if (points ==20){
            System.out.println("Flush!");
            System.out.println("Points for this hand: 20");
        }
        if (points ==15){
            System.out.println("Straight!");
            System.out.println("Points for this hand: 15");
        }
        if (points == 10){
            System.out.println("Three of kind!");
            System.out.println("Points for this hand: 10");
        }
        if (points == 5){
            System.out.println("Two pairs!");
            System.out.println("Points for this hand: 5");


        }
        if (points ==2){
            System.out.println("One pair!");
            System.out.println("Points for this hand: 2");
        }
    }

    public void sort(ArrayList<Card> hand) {
        // use this method to compare cards so they
        // may be easily sorted


        Collections.sort(hand, new CardComperator());


    }

    public boolean royalFlush(ArrayList<Card> hand) {
        //array list zawierajacy obikty cards które mają swój <suit i value>
        //rank od 8-13
        //suit ten sam

        if (flush(hand)) {
            ArrayList<Integer> temp = new ArrayList<Integer>();// lista

            for (int i = 0; i < hand.size(); i++) {
                int toSet = hand.get(i).getSuit();
                temp.add(toSet);
            }
            for (int j = 10; j <= 13; j++) { // .contains 10,11,12,13,1

                if (!temp.contains(j)) return false;
            }
            return temp.contains(1);
        } else return false;
    }

    public boolean straightFlush(ArrayList<Card> hand) {
        return straight(hand) && flush(hand);
    }

    public boolean four(int[] table) {
        return table[0] == 0 && table[1] == 0 && table[2] == 1;
    }

    public boolean fullHouse(int[] table) {
        //trójka i para
        // {para 0/1, trójka 0/1, czwórka}
        return table[0] == 1 && table[1] == 1;

    }

    public boolean flush(ArrayList<Card> hand) {
        //ten sam suit
        int suitToCheck = hand.get(0).getSuit();
        for (int i = 0; i < hand.size(); i++) {
            if (hand.get(i).getSuit() != suitToCheck) {
                return false;
            }
        }
        return true;
    }

    public boolean straight(ArrayList<Card> hand) {

        // po prostu po kolei
        //muszą być po kolei
        int lowestRank = hand.get(0).getRank();
        for (int i = 1; i < hand.size(); i++) {
            if (hand.get(i).getSuit() != lowestRank + 1) return false;
        }
        return true;

    }

  /*  public boolean pairAndThree(int[] table) {
        return table[0] == 1 && table[1] == 1 && table[2] == 0;
    }*/

    public boolean three(int[] table) {
        return table[0] == 0 && table[1] == 1 && table[2] == 0;
    }

    public boolean twoPair(int[] table) {
        return table[0] == 2 && table[1] == 0 && table[2] == 0;
    }

    public boolean pair(int[] table) {
        return table[0] == 1 && table[1] == 0 && table[2] == 0;
    }

    public int pairThreeFour(ArrayList<Card> hand) { //list - interface arrayList

        int[] counter = {0, 0, 0, 0, 0};
        int[] ranks = {0, 0, 0, 0, 0};
        //te same rangi
        //ile razy występuje dana ranga
        for (int i = 0; i < 5;i++) {
            ranks[i] = hand.get(i).getRank();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(hand.get(i).getRank()==ranks[j]){
                    counter[i]++;
                }
            }
        }


        int numberOfPairs = 0;
        int numberOfThree = 0;
        int numberOfFour = 0;
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] == 2) {
                numberOfPairs++;
            }
            if (counter[i] == 3) {
                numberOfThree++;
            }
            if (counter[i] == 4) {
                numberOfFour++;
            }

        }

        int[] pairThreeFourTable = {numberOfPairs / 2, numberOfThree / 3, numberOfFour / 4};
        if (four(pairThreeFourTable)) return 50;
        else if (fullHouse(pairThreeFourTable)) return 25;
        else if (three(pairThreeFourTable)) return 10;
        //if (pairAndThree(pairThreeFourTable)) return 7;
        else if (twoPair(pairThreeFourTable)) return 5;
        else if (pair(pairThreeFourTable)) return 2;

        return 0;
        //return List.of(numberOfPairs / 2, numberOfThree / 3, numberOfFour / 4);

    }

    public boolean highCard(ArrayList<Card> hand) {


        return true;

    }

    public int checkHand(ArrayList<Card> hand) {
        // this method should take an ArrayList of cards
        // as input and then determine what evaluates to and
        // return that as a int

        return 0;


        // One pair / Two pairs
        // Three of a kind
        // Full House
        // Four of a Kind
        // Flush
        // Royal Flush

        //checkFlushRoyalFlush(hand);


    }


    private void performRejections(ArrayList<Card> hand) {
        // this method should make the rejections
        System.out.println("How many card You wanna to reject?");
        Scanner scanner = new Scanner(System.in);

        int numCardsToReject = scanner.nextInt();
        if(numCardsToReject==5){
            for(int i=0;i<5;i++){
                hand.set(i, cards.deal());
            }
        }else {

            if (numCardsToReject == 0) {
                wins(-1, points(hand));
                play();

            } else if (numCardsToReject < 0) {
                while (numCardsToReject < 0) {
                    System.out.println("Number can't be negative!");
                    System.out.println("How many card You wanna to reject?");

                    numCardsToReject = scanner.nextInt();
                }
            } else if (numCardsToReject > 0) {
                while (numCardsToReject > 5) {
                    System.out.println("Wrong number of cards!");
                    System.out.println("Please input index 1-5.");
                    numCardsToReject = scanner.nextInt();
                }
            }
            for (int i = numCardsToReject; i > 0; i--) {
                System.out.println("Which card do u want to reject?");

                int cardIndex = scanner.nextInt();
                while (cardIndex > 5) {
                    System.out.println("Wrong card index!");
                    System.out.println("Please input index 1-5.");
                    cardIndex = scanner.nextInt();
                }
                hand.set(5 - cardIndex, cards.deal());

            }
        }
        System.out.println("Your cards after rejection:");
        sort(hand);
        displayCards(hand);
    }


    public void printHand(ArrayList<Card> hand) {
        for (int i = 0; i < hand.size(); i++) {
            System.out.println(hand.get(i));
        }
    }

    private int getBets() {
        // this method should take the bets
        return 0;
    }

    public int points(ArrayList<Card> hand) {

        if (royalFlush(hand)){
            return 100;
        }
        if (straightFlush(hand)){
            return 75;
        }
        if (pairThreeFour(hand) == 50){

            return 50;
        }
        if (pairThreeFour(hand) == 25){
            return 25;
        }
        if (flush(hand)){
            return 20;
        }
        if (straight(hand)){
            return 15;
        }
        if (pairThreeFour(hand) == 10){
            return 10;
        }
        if (pairThreeFour(hand) == 5){
            return 5;
        }
        if (pairThreeFour(hand) == 2){
            return 2;
        }
        if (pairThreeFour(hand) > 0) {

            return pairThreeFour(hand);
        }

        return 0;

    }






    public void wins(int before, int after) {
        if(before==-1){
            System.out.println("U didn't change any card. Instant win/lose.");
            p.winnings(after);
            play();
        }else if (before < after) {
            System.out.println("U won!");
            p.winnings(after);
            play();
        } else if (before > after) {
            System.out.println("U lost!");
            play();
        }else {
            System.out.println("Same points for hand.");
            System.out.println("U lost!");
            play();
        }
    } //przerywa gre jak przegra :(


    // you will likely want many more methods here
}

