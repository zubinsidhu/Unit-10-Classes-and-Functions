
public class PlayCards {

	public static final int NUMBER_OF_CARDS = 5;
	private Card[] cards = new Card[NUMBER_OF_CARDS];
	private int changes;
	private int score;
	private String history;
	
	public PlayCards() {
		changes = 0;
		score = 0;
		history = "";
		//Generate 5 random cards
		for (int i = 0; i < NUMBER_OF_CARDS; i++) {
			cards[i] = Card.pickACard();
		}
		for (int i = 0; i < NUMBER_OF_CARDS; i++) {
			for (int j = 0; j != i && j < NUMBER_OF_CARDS; j++) {
				while (cards[i].equals(cards[j])) cards[j] = Card.pickACard();
			}
		}
	}
	public void changeOne(int pos) {
		cards[pos] = Card.pickACard();
		for (int j = 0; j != pos && j < NUMBER_OF_CARDS; j++) {
			while (cards[pos].equals(cards[j])) {
				cards[j] = Card.pickACard();
			}
		}
		changes++;
	}
	public int countPairs(int r) {
		int count = 0;
		for (int i = 0; i < NUMBER_OF_CARDS; i++) {
			if (cards[i].getRank() == r) count++;
		}
		return count;
	}
	public void computeScore() {
		int count, pairs = 0, triples = 0;
		for (int r = 1; r <= 13; r++) {
			count = countPairs(r);
			if (count == 2) pairs++;
			else if (count == 3) triples++;
		}
		if (pairs == 0) {
			if (triples == 0) score = 0;
			else if (triples == 1) score = 3;
		}
		else if (pairs == 1) {
			if (triples == 0) score = 1;
			else if (triples == 1) score = 4;
		}
		else if (pairs == 2) {
			if (triples == 0) score = 2;
		}
	}
	public String toString() {
		String str = "[ ";
		for (int i = 0; i < NUMBER_OF_CARDS - 1; i++) {
			str += cards[i] + ", ";
		}
		str += cards[NUMBER_OF_CARDS - 1] + "]";
		return str;
	}
	public String getHistory() {
		history += "\n" + toString() + "\nScore: " + score + "\tChanges: " + changes;
		return history;
	}
	
	public static void main(String[] args) {
		PlayCards p1 = new PlayCards();
		
		p1.computeScore();
		System.out.println(p1.getHistory());
		
		p1.changeOne(0);
		p1.computeScore();
		System.out.println(p1.getHistory());
		
		p1 = new PlayCards();
		System.out.println(p1.getHistory());
	}
}
