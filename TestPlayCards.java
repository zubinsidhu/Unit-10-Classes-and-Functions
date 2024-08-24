import java.util.*;
public class TestPlayCards {

	public static void main(String[] args) {
		final char d = 'd';
		final char n = 'n';
		final char c = 'c';
		final char q = 'q';
		PlayCards cards = new PlayCards();
		System.out.println("Play 5 cards!\nScores for One-pair:\t1\n\t   Two-pair:\t2\n\t   Triple:\t3\n\t   Full House:\t4");
		char choice;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("------------------------\n\tMain Menu\n------------------------");
			System.out.println("d: Display 5 new cards\nn: New set of 5 cards\nc: Change one card\nq: Quit");
			System.out.print("Enter d, n, c, or q: ");
			choice = input.next().charAt(0);
			switch(choice) {
			case d:
				System.out.println("Display 5 cards");
				cards.computeScore();
				System.out.println(cards);
				break;
			case n:
				cards = new PlayCards();
				System.out.println("New set of 5 cards");
				cards.computeScore();
				System.out.println(cards.getHistory());
				break;
			case c:
				System.out.print("Which position? Choose 0 - 4: ");
				int pos = input.nextInt();
				cards.changeOne(pos);
				System.out.println("\nChange one card at " + pos + ": ");
				cards.computeScore();
				System.out.println(cards.getHistory());
				break;
			case q:
				System.out.println("End of Program!");
				break;
			}
		}while (choice != q);
		input.close();
	}

}
