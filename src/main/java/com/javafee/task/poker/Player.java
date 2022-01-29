package com.javafee.task.poker;// add your own banner here

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Player {
	private ArrayList<Card> hand; // the player's cards
	private int bankroll; // bank tokenow
	private int bet;
	public Game game;

	// you may choose to use more instance variables

	public Player() {
		// create a player here
		int startTokens = ThreadLocalRandom.current().nextInt(10, 50);
		bankroll += startTokens;
		System.out.println("com.javafee.poker.Player tokens: " + startTokens);
		hand = new ArrayList<>(5);
		// zasilenie banku tokenow nowymi tokenami
	}


	public void addCard(Card c) {
		// add the card c to the player's hand
		// overloading is allowed
		this.hand.add(c);
	}

	public void removeCard(Card c) {
		// remove the card c from the player's hand
		// overloading is allowed
	}

	public ArrayList<Card> getHand() {
		// returns the hand
		return hand;
	}

	public void winnings(int odds) {
		// adjust bankroll if player wins
		int win = odds*bet;
		System.out.println("Your win: "+win);
		setBankroll(win);
		//game.play();


	}

	public int getBetsForGame() {
		System.out.println("Your balance: "+bankroll);
		System.out.println("How many tokens do u want to spent?");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input bet:");
		int bet = scanner.nextInt();
		setBet(bet);
		//System.out.println("Your bet: "+bet);
		this.bankroll -= bet;
		return bet;
	}
	public int getBankroll() {
		// return current balance of bankroll

		return 0;
	}

	public void setBankroll(int bankroll) {
		// set the bankroll balance
		this.bankroll+=bankroll;


	}

	public void setBet(int bet) {
		this.bet = bet;
	}

	public int getBet() {
		return bet;
	}
	// you may wish to use more methods here
}