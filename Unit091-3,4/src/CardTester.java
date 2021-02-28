/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("King", "Hearts", 13);
		Card card2 = new Card("Joker", "Hearts", 13);
		Card card3 = new Card("King", "Hearts", 13);
		card1.matches(card2);
		card3.toString();
	}
}
