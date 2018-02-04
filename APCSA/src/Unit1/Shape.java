package Unit1;

import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

   public Shape(int x, int y, int wid, int ht, Color col)
   {
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
		color = col;
		//finish this constructor
   }


   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(xPos, yPos, width, height);

      //draw whatever you want
      //    ^
      //  [ :: ]
      //    ()
	window.setColor(Color.red);
      window.fillRect(xPos+10, yPos+10, width-20, height-30);
      window.setColor(Color.green);
      window.fillOval(320, 420, 60, 60);
      window.setColor(Color.blue);
      window.drawLine(300, 400, 250, 350);
      window.setColor(Color.blue);
      window.drawLine(400, 400, 450, 350);
      window.setColor(Color.blue);
      window.drawLine(325, 500, 325, 525);
      window.setColor(Color.blue);
      window.drawLine(375, 500, 375, 525);
      
      
      window.setColor(Color.blue);
      window.drawLine(500, 200, 475, 175);
      window.setColor(Color.blue);
      window.drawLine(550, 200, 575, 175);
      window.setColor(Color.blue);
      window.drawLine(515, 250, 515, 270);
      window.setColor(Color.blue);
      window.drawLine(535, 250, 535, 270);

   }

   //BONUS
   //add in set and get methods for all instance variables

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}
