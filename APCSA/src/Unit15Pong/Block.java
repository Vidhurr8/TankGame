package Unit15Pong;

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		xPos = 100;
		yPos = 150;
		width = 10;
		height = 10;
		color = Color.black;
	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y) 
	{
		xPos = x;
		yPos = y;
		width = 10;
		height = 10;
		color = Color.black;
	}

	// add other Block constructors - x , y , width, height, color
	public Block(int x, int y, int widthr, int heightr) 
	{
		xPos = x;
		yPos = y;
		width = widthr;
		height = heightr;
		color = Color.black;
	}

	public Block(int x, int y, int widthr, int heightr, Color col) 
	{
		xPos = x;
		yPos = y;
		width = widthr;
		height = heightr;
		color = col;
	}
	
   //add the other set methods
   

   public void setColor(Color col)
   {
	   color = col;
   }
   
   public void setPos(int x, int y) 
   {
		xPos = x;
		yPos = y;
	}

	public void setX(int x) 
	{
		xPos = x;
	}

	public void setY(int y) 
	{
		yPos = y;
	}

	public void setSize(int widthr, int heightr) 
	{
		width = widthr;
		height = heightr;
	}

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
   public boolean equals(Object obj)
   {
	   if (this == obj) 
	   {
		   return true;
	   }

	   return false;
   }   

   //add the other get methods
   public int getX() 
   {
	   return xPos;
   }

   public int getY() 
   {
	   return yPos;
   }

   public int getWidth() 
   {
	   return width;
   }

   public int getHeight() 
   {
	   return height;
   }

   public Color getColor() 
   {
	   return color;
   }
   //add a toString() method  - x , y , width, height, color
   public String toString() 
   {
	   return "x - " + xPos + " || y - " + yPos + " || width - " + width + " || height - " + height + " || Color - "
			   + color;
   }
}