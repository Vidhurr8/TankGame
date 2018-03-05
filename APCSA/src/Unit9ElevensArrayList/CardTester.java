package Unit9ElevensArrayList;

public class CardTester 
{
	/**
	 * The main method in this class checks the Card operations for consistency.
	 * 
	 * @param args
	 *            is not used.
	 */
	public static void main(String[] args) 
	{
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card aceClubs1 = new Card("Ace", "Clubs", 1);
		System.out.println(aceClubs1);
		Card sixHearts = new Card("Six", "Hearts", 6);
		System.out.println(sixHearts);
		Card kingSpades = new Card("King", "Spades", 13);
		System.out.println(kingSpades);
		Card tenDiamonds = new Card("Ten", "Diamonds", 10);
		System.out.println(tenDiamonds);
	}
}