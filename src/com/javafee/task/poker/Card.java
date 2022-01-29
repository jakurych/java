package src.com.javafee.task.poker;// add your own banner here

public class Card implements Comparable<Card> {
	private int suit; // use integers 1-4 to encode the suit
	private int rank; // use integers 1-13 to encode the rank

	public Card(int s, int v) {
		//make a card with suit s and value v
		this.suit = s;
		this.rank = v;
	}


	public int getRank() {
		return rank;
	}

	public int getSuit() {
		return suit;
	}

	//@Override
	/*public String toString() {
		
		return "src.com.javafee.task.poker.Card{" +
				"suit=" + suit +
				", rank=" + rank +
				'}';
	}*/
	// add some more methods here if needed



	@Override
	public int compareTo(Card o) {
		return 0;
	}
}


