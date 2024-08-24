
public class Card {

	private int rank;
	private String suit;
	private static String[] rankList = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	private static String[] suitList = {"Spades", "Clubs", "Hearts", "Diamonds"};
	
	public Card() {
		this(1, "Spades");
	}
	public Card(int rank, String suit) {
		this.rank = rank;
		this.suit = suit;
	}
	public Card(Card other) {
		rank = other.rank;
		suit = other.suit;
	}
	
	public int getRank() { return rank; }
	public String getSuit() { return suit; }
	public static Card pickACard() {
		return new Card((int)(Math.random() * 13) + 1, suitList[(int)(Math.random() * 4)]);
	}
	public boolean beats(Card other) {
		return suit.equals(other.suit) && rank > other.rank;
	}
	public boolean equals(Card other) {
		return suit == other.suit && rank == other.rank;
	}
	public String toString() {
		return rankList[rank - 1] + " of " + suit;
	}
	
	public static void main(String[] args) {
		Card card1 = new Card();
		Card card2 = new Card(11, "Spades");
		Card card3 = new Card(card1);
		Card card4 = pickACard();
		
		System.out.println(card1 + " beats " + card2 + ": " + card1.beats(card2));
		System.out.println(card3 + " equals " + card1 + ": " + card3.equals(card1));
		System.out.println(card4 + " beats " + card1 + ": " + card4.beats(card1));
	}
}