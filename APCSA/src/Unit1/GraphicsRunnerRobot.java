package Unit1;

import javax.swing.JFrame;

public class GraphicsRunnerRobot extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunnerRobot()
	{
		super("Graphics Runner");
		
		setSize(WIDTH,HEIGHT);

		//getContentPane().add(new SmileyFace());
		
		//getContentPane().add(new BigHouse());		
		
		getContentPane().add(new Robot());
		
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		GraphicsRunnerRobot run = new GraphicsRunnerRobot();
	}
}