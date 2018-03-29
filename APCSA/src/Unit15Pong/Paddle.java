package Unit15Pong;

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	  super(10,10);
      speed =5;
   }

   //add the other Paddle constructors
   public Paddle(int nx, int ny) 
   {
		super(nx, ny);
		speed = 5;
	}

	public Paddle(int nx, int ny, int widthr, int heightr, int speedr) 
	{
		super(nx, ny, widthr, heightr);
		speed = speedr;
	}

	public Paddle(int nx, int ny, int widthr, int heightr, Color col, int speedr) 
	{
		super(nx, ny, widthr, heightr, col);
		speed = speedr;
	}

	public Paddle(int nx, int ny, int speedr) 
	{
		super(nx, ny);
		speed = speedr;
	}

   public void moveUpAndDraw(Graphics window)
   {
	   super.draw(window, Color.white);
	   setY(getY() - speed);
	   super.draw(window);
   }

   public void moveDownAndDraw(Graphics window)
   {
	   super.draw(window, Color.white);
	   setY(getY() + speed);
	   super.draw(window);
   }

   //add get methods
   	public int getX() 
   	{
		return super.getX();
	}

	public int getY() 
	{
		return super.getY();
	}

	public int getSpeed() 
	{
		return speed;
	}
   
   //add a toString() method
	public String toString() 
	{
		return "x - " + getX() + " y - " + getY() + " width - " + getWidth() + " height - " + getHeight() + " Color - "
				+ getColor() + " Speed - " + getSpeed();
	}
}