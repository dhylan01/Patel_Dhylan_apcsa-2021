package activity9;
import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;


	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	 public ElevensBoard() {
	 	super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	 	System.out.println("Dhylan Patel, Period 3, 4/13/21");
	 }

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 11, and (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		System.out.println(selectedCards);
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		if (selectedCards.size() == 2) {
			int hKingP = 0;
			int hQueenP = 0;
			int hJackP = 0;
				for (Integer card: selectedCards) {
				
				Card here = cardAt(card);
				if (here.rank().equals("king"))
				{
					hKingP+= 1;
				}
				if (here.rank().equals("queen")) {
					hQueenP += 1;
				}
				if (here.rank().equals("jack")) {
	                hJackP += 1;
	            }
				}
				if ( (hKingP == 2) || (hJackP == 2) || (hQueenP == 2) ) {
					return true;
				}
		}
		if (selectedCards.size()==3) {
			int sum = 0;
			for (int card: selectedCards) {
				sum += cardAt(card).pointValue();
			}
			return sum==11;
		}
		else return false;
	
	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		// try and make a for loop where for eveyr value in card indexes you pass it through Cardat and put a new array in
		// if that does not work then try deal
		boolean possible=false;
		List<Integer> selection = new ArrayList<Integer>();
		for (int card1=0; card1<BOARD_SIZE; card1++) 
		{
			selection.add(card1);
			for (int card2=card1+1; card2<BOARD_SIZE; card2++)
			{
				selection.add(card2);
				possible=(containsJQK(selection));
				if (possible) break;
				selection.remove(1);
			}
			if (possible) break;
			for (int card2=card1+1; card2<BOARD_SIZE; card2++)
			{
				selection.add(card2);
				for (int card3=card2+1; card3<BOARD_SIZE; card3++)
				{
					selection.add(card3);
					possible=(containsPairSum11(selection));
					if (possible) break;
					selection.remove(2);
				}
				if (possible) break;
				selection.remove(1);
			}
			if (possible) break;
			selection.remove(0);
		}
		return possible;
	}

	

	/**
	 * Check for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-pair; false otherwise.
	 */
	private boolean containsPairSum11(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		if (selectedCards.size()==3) {
			int sum = 0;
			for (int card: selectedCards) {
				sum += cardAt(card).pointValue();
			}
			return sum==11;
		}
		else return false;
	}

	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	private boolean containsJQK(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		int hKingP = 0;
		int hQueenP = 0;
		int hJackP = 0;
			for (Integer card: selectedCards) {
			
			Card here = cardAt(card);
			if (here.rank().equals("king"))
			{
				hKingP+= 1;
			}
			if (here.rank().equals("queen")) {
				hQueenP += 1;
			}
			if (here.rank().equals("jack")) {
                hJackP += 1;
            }
			}
			if ( (hKingP == 2) || (hJackP == 2) || (hQueenP == 2) ) {
				return true;
			}
	
			else return false;
	}
}
