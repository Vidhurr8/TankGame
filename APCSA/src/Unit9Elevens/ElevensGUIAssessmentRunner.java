package Unit9Elevens;

public class ElevensGUIAssessmentRunner 
{

	/**
	 * Plays the GUI version of Elevens.
	 * @param args is not used.
	 */
	public static void main(String[] args) 
	{
		Board board = new ElevensBoardAssessment();
		CardGameGUI gui = new CardGameGUI(board);
		gui.displayGame();
	}
}