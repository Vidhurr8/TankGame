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

public class Breakout extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle Brick1;
	private Paddle Brick2;
	private Paddle Brick3;
	private Paddle Brick4;
	private Paddle Brick5;
	private Paddle Brick6;
	private Paddle Brick7;
	private Paddle Brick8;
	private Paddle Brick9;
	private Paddle Brick10;
	private Paddle Brick11;
	private Paddle Brick12;
	private boolean[] keys;
	private BufferedImage back;
	private int score;
	//private int rightScore;



	public Breakout()
	{
		//set up all variables related to the game
		ball = new Ball(250, 250, 10, 10, Color.BLUE);
		leftPaddle = new Paddle(0, 20, 10, 100, Color.GREEN, 10);
		Brick1 = new Paddle(775, 20, 10, 120, Color.RED, 0);
		Brick2 = new Paddle(775, 150, 10, 120, Color.RED, 0);
		Brick3 = new Paddle(775, 280, 10, 120, Color.RED, 0);
		Brick4 = new Paddle(775, 410, 10, 120, Color.RED, 0);
		Brick5 = new Paddle(755, 20, 10, 120, Color.RED, 0);
		Brick6 = new Paddle(755, 150, 10, 120, Color.RED, 0);
		Brick7 = new Paddle(755, 280, 10, 120, Color.RED, 0);
		Brick8 = new Paddle(755, 410, 10, 120, Color.RED, 0);
		Brick9 = new Paddle(735, 20, 10, 120, Color.RED, 0);
		Brick10 = new Paddle(735, 150, 10, 120, Color.RED, 0);
		Brick11 = new Paddle(735, 280, 10, 120, Color.RED, 0);
		Brick12 = new Paddle(735, 410, 10, 120, Color.RED, 0);



		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
		System.out.println("Vidhur Raveendran, Period 4, 4-4-18, Computer 33");
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
		//if(back==null)
		back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		//rightPaddle.draw(graphToBack);
		Brick1.draw(graphToBack);
		Brick2.draw(graphToBack);
		Brick3.draw(graphToBack);
		Brick4.draw(graphToBack);
		Brick5.draw(graphToBack);
		Brick6.draw(graphToBack);
		Brick7.draw(graphToBack);
		Brick8.draw(graphToBack);
		Brick9.draw(graphToBack);
		Brick10.draw(graphToBack);
		Brick11.draw(graphToBack);
		Brick12.draw(graphToBack);
		
		ball.moveAndDraw(window);
		leftPaddle.draw(window);
		//rightPaddle.draw(window);
		Brick1.draw(window);
		Brick2.draw(window);
		Brick3.draw(window);
		Brick4.draw(window);
		Brick5.draw(window);
		Brick6.draw(window);
		Brick7.draw(window);
		Brick8.draw(window);
		Brick9.draw(window);
		Brick10.draw(window);
		Brick11.draw(window);
		Brick12.draw(window);
		graphToBack.drawString("Score : " + score, 460, 540);
		//graphToBack.drawString("Left score : " + leftScore, 460, 560);

		if (!(ball.getX() >= 10)) 
		{
			ball.setX(250);
			ball.setY(250);
			ball.setYSpeed(-ball.getYSpeed());
			ball.setXSpeed(-ball.getXSpeed());
			score = 0;
			Brick1.setColor(Color.RED);
			Brick2.setColor(Color.RED);
			Brick3.setColor(Color.RED);
			Brick4.setColor(Color.RED);
			Brick5.setColor(Color.RED);
			Brick6.setColor(Color.RED);
			Brick7.setColor(Color.RED);
			Brick8.setColor(Color.RED);
			Brick9.setColor(Color.RED);
			Brick10.setColor(Color.RED);
			Brick11.setColor(Color.RED);
			Brick12.setColor(Color.RED);
		}
		/*if (!(ball.getX() <= 760)) 
		{
			ball.setX(250);
			ball.setY(250);
			leftScore++;
		}*/

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
		
		if (((ball.getX() + ball.getWidth() >= Brick1.getX() - Brick1.getWidth() - Math.abs(ball.getXSpeed())) && (ball.getY() >= Brick1.getY() && ball.getY() <= Brick1.getY() + Brick1.getHeight() || ball.getY() + ball.getHeight() >= Brick1.getY() && ball.getY() + ball.getHeight() < Brick1.getY() + Brick1.getHeight()) || 
				(ball.getX() + ball.getWidth() >= Brick2.getX() - Brick2.getWidth() - Math.abs(ball.getXSpeed())) && (ball.getY() >= Brick2.getY() && ball.getY() <= Brick2.getY() + Brick2.getHeight() || ball.getY() + ball.getHeight() >= Brick2.getY() && ball.getY() + ball.getHeight() < Brick2.getY() + Brick2.getHeight()) || 
				(ball.getX() + ball.getWidth() >= Brick3.getX() - Brick3.getWidth() - Math.abs(ball.getXSpeed())) && (ball.getY() >= Brick3.getY() && ball.getY() <= Brick3.getY() + Brick3.getHeight() || ball.getY() + ball.getHeight() >= Brick3.getY() && ball.getY() + ball.getHeight() < Brick3.getY() + Brick3.getHeight()) || 
				(ball.getX() + ball.getWidth() >= Brick4.getX() - Brick4.getWidth() - Math.abs(ball.getXSpeed())) && (ball.getY() >= Brick4.getY() && ball.getY() <= Brick4.getY() + Brick4.getHeight() || ball.getY() + ball.getHeight() >= Brick4.getY() && ball.getY() + ball.getHeight() < Brick4.getY() + Brick4.getHeight()) || 
				(ball.getX() + ball.getWidth() >= Brick5.getX() - Brick5.getWidth() - Math.abs(ball.getXSpeed())) && (ball.getY() >= Brick5.getY() && ball.getY() <= Brick5.getY() + Brick5.getHeight() || ball.getY() + ball.getHeight() >= Brick5.getY() && ball.getY() + ball.getHeight() < Brick5.getY() + Brick5.getHeight()) || 
				(ball.getX() + ball.getWidth() >= Brick6.getX() - Brick6.getWidth() - Math.abs(ball.getXSpeed())) && (ball.getY() >= Brick6.getY() && ball.getY() <= Brick6.getY() + Brick6.getHeight() || ball.getY() + ball.getHeight() >= Brick6.getY() && ball.getY() + ball.getHeight() < Brick6.getY() + Brick6.getHeight()) || 
				(ball.getX() + ball.getWidth() >= Brick7.getX() - Brick7.getWidth() - Math.abs(ball.getXSpeed())) && (ball.getY() >= Brick7.getY() && ball.getY() <= Brick7.getY() + Brick7.getHeight() || ball.getY() + ball.getHeight() >= Brick7.getY() && ball.getY() + ball.getHeight() < Brick7.getY() + Brick7.getHeight()) || 
				(ball.getX() + ball.getWidth() >= Brick8.getX() - Brick8.getWidth() - Math.abs(ball.getXSpeed())) && (ball.getY() >= Brick8.getY() && ball.getY() <= Brick8.getY() + Brick8.getHeight() || ball.getY() + ball.getHeight() >= Brick8.getY() && ball.getY() + ball.getHeight() < Brick8.getY() + Brick8.getHeight()) || 
				(ball.getX() + ball.getWidth() >= Brick9.getX() - Brick9.getWidth() - Math.abs(ball.getXSpeed())) && (ball.getY() >= Brick9.getY() && ball.getY() <= Brick9.getY() + Brick9.getHeight() || ball.getY() + ball.getHeight() >= Brick9.getY() && ball.getY() + ball.getHeight() < Brick9.getY() + Brick9.getHeight()) || 
				(ball.getX() + ball.getWidth() >= Brick10.getX() - Brick10.getWidth() - Math.abs(ball.getXSpeed())) && (ball.getY() >= Brick10.getY() && ball.getY() <= Brick10.getY() + Brick10.getHeight() || ball.getY() + ball.getHeight() >= Brick10.getY() && ball.getY() + ball.getHeight() < Brick10.getY() + Brick10.getHeight()) || 
				(ball.getX() + ball.getWidth() >= Brick11.getX() - Brick11.getWidth() - Math.abs(ball.getXSpeed())) && (ball.getY() >= Brick11.getY() && ball.getY() <= Brick11.getY() + Brick11.getHeight() || ball.getY() + ball.getHeight() >= Brick11.getY() && ball.getY() + ball.getHeight() < Brick11.getY() + Brick11.getHeight()) || 
				(ball.getX() + ball.getWidth() >= Brick12.getX() - Brick12.getWidth() - Math.abs(ball.getXSpeed())) && (ball.getY() >= Brick12.getY() && ball.getY() <= Brick12.getY() + Brick12.getHeight() || ball.getY() + ball.getHeight() >= Brick12.getY() && ball.getY() + ball.getHeight() < Brick12.getY() + Brick12.getHeight()))) 
		{
			if (ball.getX() + ball.getWidth() <= Brick1.getX() - Brick1.getWidth() + Math.abs(ball.getXSpeed()) && Brick1.getColor() == Color.RED)
			{
				ball.setYSpeed(-ball.getYSpeed());
				Brick1.setColor(Color.WHITE);
			}
			else if (ball.getX() + ball.getWidth() <= Brick2.getX() - Brick2.getWidth() + Math.abs(ball.getXSpeed()) && Brick2.getColor() == Color.RED)
			{
				ball.setYSpeed(-ball.getYSpeed());
				Brick2.setColor(Color.WHITE);
			}
			else if (ball.getX() + ball.getWidth() <= Brick3.getX() - Brick3.getWidth() + Math.abs(ball.getXSpeed()) && Brick3.getColor() == Color.RED)
			{
				ball.setYSpeed(-ball.getYSpeed());
				Brick3.setColor(Color.WHITE);
			}
			else if (ball.getX() + ball.getWidth() <= Brick4.getX() - Brick4.getWidth() + Math.abs(ball.getXSpeed()) && Brick4.getColor() == Color.RED)
			{
				ball.setYSpeed(-ball.getYSpeed());
				Brick4.setColor(Color.WHITE);
			}
			else if (ball.getX() + ball.getWidth() <= Brick5.getX() - Brick5.getWidth() + Math.abs(ball.getXSpeed()) && Brick5.getColor() == Color.RED)
			{
				ball.setYSpeed(-ball.getYSpeed());
				Brick5.setColor(Color.WHITE);
			}
			else if (ball.getX() + ball.getWidth() <= Brick6.getX() - Brick6.getWidth() + Math.abs(ball.getXSpeed()) && Brick6.getColor() == Color.RED)
			{
				ball.setYSpeed(-ball.getYSpeed());
				Brick6.setColor(Color.WHITE);
			}
			else if (ball.getX() + ball.getWidth() <= Brick7.getX() - Brick7.getWidth() + Math.abs(ball.getXSpeed()) && Brick7.getColor() == Color.RED)
			{
				ball.setYSpeed(-ball.getYSpeed());
				Brick7.setColor(Color.WHITE);
			}
			else if (ball.getX() + ball.getWidth() <= Brick8.getX() - Brick8.getWidth() + Math.abs(ball.getXSpeed()) && Brick8.getColor() == Color.RED)
			{
				ball.setYSpeed(-ball.getYSpeed());
				Brick8.setColor(Color.WHITE);
			}
			else if (ball.getX() + ball.getWidth() <= Brick9.getX() - Brick9.getWidth() + Math.abs(ball.getXSpeed()) && Brick9.getColor() == Color.RED)
			{
				ball.setYSpeed(-ball.getYSpeed());
				Brick9.setColor(Color.WHITE);
			}
			else if (ball.getX() + ball.getWidth() <= Brick10.getX() - Brick10.getWidth() + Math.abs(ball.getXSpeed()) && Brick10.getColor() == Color.RED)
			{
				ball.setYSpeed(-ball.getYSpeed());
				Brick10.setColor(Color.WHITE);
			}
			else if (ball.getX() + ball.getWidth() <= Brick11.getX() - Brick11.getWidth() + Math.abs(ball.getXSpeed()) && Brick11.getColor() == Color.RED)
			{
				ball.setYSpeed(-ball.getYSpeed());
				Brick11.setColor(Color.WHITE);
			}
			else if (ball.getX() + ball.getWidth() <= Brick12.getX() - Brick12.getWidth() + Math.abs(ball.getXSpeed()) && Brick12.getColor() == Color.RED)
			{
				ball.setYSpeed(-ball.getYSpeed());
				Brick12.setColor(Color.WHITE);
			}
			else
			{
				ball.setXSpeed(-ball.getXSpeed());
				score++;
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
		if(!(ball.getX()>=10))
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
		}

		
		//see if the ball hits the top or bottom wall 
		if(!(ball.getY()>=10 && ball.getY()<=560))
		{
			ball.setXSpeed(ball.getXSpeed());
			ball.setYSpeed(-ball.getYSpeed());
		}



		//see if the ball hits the left paddle
		if (ball.getX() >= 7 && ball.getX() < 17 && ball.getY() < leftPaddle.getY() + 25
				&& ball.getY() > (leftPaddle.getY() + 125)) 
		{
			ball.setXSpeed(0);
		}
		
		
		//see if the ball hits a brick
		if ((ball.getX() >= 771 && ball.getX() < 781 && ball.getY() <= Brick1.getY() + 25 && ball.getY() >= (Brick1.getY() + 125)) || (ball.getX() >= 771 && ball.getX() < 781 && ball.getY() <= Brick2.getY() + 25 && ball.getY() >= (Brick2.getY() + 125)) || (ball.getX() >= 771 && ball.getX() < 781 && ball.getY() <= Brick3.getY() + 25 && ball.getY() >= (Brick3.getY() + 125)) || (ball.getX() >= 771 && ball.getX() < 781 && ball.getY() <= Brick4.getY() + 25 && ball.getY() >= (Brick4.getY() + 125)) || (ball.getX() >= 751 && ball.getX() < 761 && ball.getY() <= Brick5.getY() + 25 && ball.getY() >= (Brick5.getY() + 125)) || (ball.getX() >= 751 && ball.getX() < 761 && ball.getY() <= Brick6.getY() + 25 && ball.getY() >= (Brick6.getY() + 125)) || (ball.getX() >= 751 && ball.getX() < 761 && ball.getY() <= Brick7.getY() + 25 && ball.getY() >= (Brick7.getY() + 125)) || (ball.getX() >= 751 && ball.getX() < 761 && ball.getY() <= Brick8.getY() + 25 && ball.getY() >= (Brick8.getY() + 125)) || (ball.getX() >= 731 && ball.getX() < 741 && ball.getY() <= Brick9.getY() + 25 && ball.getY() >= (Brick9.getY() + 125)) || (ball.getX() >= 731 && ball.getX() < 741 && ball.getY() <= Brick10.getY() + 25 && ball.getY() >= (Brick10.getY() + 125)) || (ball.getX() >= 731 && ball.getX() < 741 && ball.getY() <= Brick11.getY() + 25 && ball.getY() >= (Brick11.getY() + 125)) || (ball.getX() >= 731 && ball.getX() < 741 && ball.getY() <= Brick12.getY() + 25 && ball.getY() >= (Brick12.getY() + 125))) 
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
		/*if (keys[2] == true)
		{
			rightPaddle.moveUpAndDraw(window);
		}
		if (keys[3] == true)
		{
			rightPaddle.moveDownAndDraw(window);
		}*/

		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			//case 'I' : keys[2]=true; break;
			//case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			//case 'I' : keys[2]=false; break;
			//case 'M' : keys[3]=false; break;
			case 'R' : ball = new Ball(250, 250, 25, 25, Color.BLUE); break;
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