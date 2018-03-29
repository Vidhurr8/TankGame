package Unit15Pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int leftScore;
	private int rightScore;



	public Pong()
	{
		//set up all variables related to the game
		ball = new Ball(250, 250, 25, 25, Color.BLUE);
		leftPaddle = new Paddle(0, 20, 10, 100, Color.RED, 10);
		rightPaddle = new Paddle(790, 20, 10, 100, Color.RED, 10);



		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		
		ball.moveAndDraw(window);
		leftPaddle.draw(window);
		rightPaddle.draw(window);
		graphToBack.drawString("Right score : " + rightScore, 460, 540);
		graphToBack.drawString("Left score : " + leftScore, 460, 560);

		if (!(ball.getX() >= 0)) 
		{
			ball.setX(250);
			ball.setY(250);
			rightScore++;
		}
		if (!(ball.getX() <= 780)) 
		{
			ball.setX(250);
			ball.setY(250);
			leftScore++;
		}

		if ((ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() + Math.abs(ball.getXSpeed()))
				&& (ball.getY() >= leftPaddle.getY() && ball.getY() <= leftPaddle.getY() + leftPaddle.getHeight()
						|| ball.getY() + ball.getHeight() >= leftPaddle.getY()
								&& ball.getY() + ball.getHeight() < leftPaddle.getY() + leftPaddle.getHeight())) 
		{
			if (ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() - Math.abs(ball.getXSpeed()))
			{
				ball.setYSpeed(-ball.getYSpeed());
			}
			else
			{
				ball.setXSpeed(-ball.getXSpeed());
			}
		}
		if ((ball.getX() + ball.getWidth() >= rightPaddle.getX() - rightPaddle.getWidth() - Math.abs(ball.getXSpeed()))
				&& (ball.getY() >= rightPaddle.getY() && ball.getY() <= rightPaddle.getY() + rightPaddle.getHeight()
						|| ball.getY() + ball.getHeight() >= rightPaddle.getY()
								&& ball.getY() + ball.getHeight() < rightPaddle.getY() + rightPaddle.getHeight())) 
		{
			if (ball.getX() + ball.getWidth() <= rightPaddle.getX() - rightPaddle.getWidth()
					+ Math.abs(ball.getXSpeed()))
			{
				ball.setYSpeed(-ball.getYSpeed());
			}
			else
			{
				ball.setXSpeed(-ball.getXSpeed());
			}
		}

		if (ball.getY() <= 0) 
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
		if (ball.getY() >= 560) 
		{
			ball.setYSpeed(-ball.getYSpeed());
		}

		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10 && ball.getX()<=780))
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
		}

		
		//see if the ball hits the top or bottom wall 
		if(!(ball.getY()>=10 && ball.getY()<=560))
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
		}



		//see if the ball hits the left paddle
		if (ball.getX() >= 7 && ball.getX() < 17 && ball.getY() < leftPaddle.getY() + 25
				&& ball.getY() > (leftPaddle.getY() + 125)) 
		{
			ball.setXSpeed(0);
		}
		
		
		//see if the ball hits the right paddle
		if (ball.getX() >= 771 && ball.getX() < 781 && ball.getY() <= rightPaddle.getY() + 25
				&& ball.getY() >= (rightPaddle.getY() + 125)) 
		{
			ball.setXSpeed(0);
		}
		
		//see if the paddles need to be moved
		if (keys[0] == true)
		{
			// move left paddle up and draw it on the window
			leftPaddle.moveUpAndDraw(window);
		}
		if (keys[1] == true)
		{
			// move left paddle down and draw it on the window
			leftPaddle.moveDownAndDraw(window);
		}
		if (keys[2] == true)
		{
			rightPaddle.moveUpAndDraw(window);
		}
		if (keys[3] == true)
		{
			rightPaddle.moveDownAndDraw(window);
		}

		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}