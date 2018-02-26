package Unit9Elevens;

public class DeckTester 
{

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	private static String[] ranks = { "jack", "queen", "king" };
	private static String[] suits = { "blue", "red" };
	private static int[] pointValues = { 11, 12, 13 };
	
	public static void main(String[] args) 
	{
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		Deck test = new Deck(ranks, suits, pointValues);
		test.size();
		test.deal();
		test.shuffle();
		System.out.println(test);
	}
}