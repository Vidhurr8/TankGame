package TankGame;

import javax.swing.JFrame;
import java.awt.Component;

public class TankGame extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public TankGame()
	{
		super("TANK GAME");
		setSize(WIDTH,HEIGHT);

		Battlefield theGame = new Battlefield();
		((Component)theGame).setFocusable(true);

		getContentPane().add(theGame);

		setVisible(true);
	}

	public static void main( String args[] )
	{
		TankGame run = new TankGame();
	}
}