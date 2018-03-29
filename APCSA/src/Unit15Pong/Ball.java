package Unit15Pong;

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	public Ball(int x, int y) 
	{
		super(200, 200);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y, int width, int height) 
	{
		super(x, y, width, height);
		xSpeed = 2;
		ySpeed = 1;
	}

	public Ball(int x, int y, int width, int height, int xSpd, int ySpd) 
	{
		super(x, y, width, height);
		xSpeed = xSpd;
		ySpeed = ySpd;
	}

	public Ball(int x, int y, int width, int height, Color col) 
	{
		super(x, y, width, height, col);
		xSpeed = 2;
		ySpeed = 1;
	}

	public Ball(int x, int y, int width, int height, Color col, int xSpd, int ySpd) 
	{
		super(x, y, width, height, col);
		xSpeed = xSpd;
		ySpeed = ySpd;
	}

   //add the set methods
	public void setX(int x) 
	{
		super.setX(x);
	}

	public void setY(int y) 
	{
		super.setY(y);
	}

	public void setWidth(int width) 
	{
		super.setY(width);
	}

	public void setHeight(int height) 
	{
		super.setY(height);
	}

	public void setXSpeed(int xSpeedr) 
	{
		xSpeed = xSpeedr;
	}

	public void setYSpeed(int ySpeedr) 
	{
		ySpeed = ySpeedr;
	}

	public void moveAndDraw(Graphics window)
	{
   	//draw a white ball at old ball location
	  super.draw(window, Color.white);
	  setX(getX() + xSpeed);
	  setY(getY() + ySpeed);
	  super.draw(window);
	}
   
	public boolean equals(Object obj)
	{
		if (this == obj) 
		{
			return true;
		} 
		else
		{
			return false;
		}
	}   

   //add the get methods
	public int getX() 
	{
		return super.getX();
	}

	public int getY() 
	{
		return super.getY();
	}

	public int getXSpeed() 
	{
		return xSpeed;
	}

	public int getYSpeed() 
	{
		return ySpeed;
	}

	public int getWidth() 
	{
		return super.getWidth();
	}

	public int getHeight() 
	{
		return super.getHeight();
	}

	public Color getColor() 
	{
		return super.getColor();
	}
   //add a toString() method
	public String toString() 
	{
		return "x - " + getX() + " y - " + getY() + " width - " + getWidth() + " height - " + getHeight() + " Color - "
				+ getColor() + " xSpeed - " + getXSpeed() + " ySpeed - " + getYSpeed();
	}

@Override
public boolean didCollideLeft(Object obj) 
{
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean didCollideRight(Object obj) 
{
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean didCollideTop(Object obj) 
{
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean didCollideBottom(Object obj) 
{
	// TODO Auto-generated method stub
	return false;
}
}