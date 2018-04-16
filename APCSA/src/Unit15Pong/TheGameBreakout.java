package Unit15Pong;

import javax.swing.JFrame;
import java.awt.Component;

public class TheGameBreakout extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public TheGameBreakout()
	{
		super("BREAKOUT");
		setSize(WIDTH,HEIGHT);
		
		Breakout game = new Breakout();
		
		((Component)game).setFocusable(true);		
		getContentPane().add(game);
						
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		TheGameBreakout run = new TheGameBreakout();
	}
}