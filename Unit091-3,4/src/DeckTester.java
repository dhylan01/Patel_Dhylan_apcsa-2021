/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] rat = {"jack", "queen", "king"};
		String[] beta = {"blue", "red"};
		int[] alpha = {11,12,13};
		Deck test = new Deck(rat, beta, alpha);
		System.out.println(test);
		test.deal();
		test.shuffle();
		
	}
}
