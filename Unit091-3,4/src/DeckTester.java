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
		Deck test = new Deck(new String[] {"jack", "queen", "king"}, new String[] {"blue", "red"}, new int[] {11, 12, 13});
		System.out.println(test);
		test.deal();
		
	}
}
