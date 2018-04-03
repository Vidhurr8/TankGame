package Unit15Pong;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball
{

   //instance variables
	private int xSpeed;
	private int ySpeed;

   public SpeedUpBall()
   {
	   super();
   }

   public SpeedUpBall(int x, int y)
   {
	   super(x, y);
   }


   public SpeedUpBall(int x, int y, int xSpd, int ySpd)
   {
	   super(x, y, xSpd, ySpd);
   }

   public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super(x, y, wid, ht, xSpd, ySpd);
   }


   public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
	   super(x, y, wid, ht, col, xSpd, ySpd);
   }

   public void setXSpeed( int xSpd )
   {
	   Object obj = new Object();
	   if (didCollideLeft(obj))
	   {
		   xSpeed = xSpd + 1;
	   }
	   
	   if (didCollideRight(obj))
	   {
		   xSpeed = xSpd + 1;
	   }
	   
	   if (didCollideTop(obj))
	   {
		   xSpeed = xSpd + 1;
	   }
	   
	   if (didCollideBottom(obj))
	   {
		   xSpeed = xSpd + 1;
	   }
   }

   public void setYSpeed( int ySpd )
   {
	   Object obj = new Object();
	   if (didCollideLeft(obj))
	   {
		   ySpeed = ySpd + 1;
	   }
	   
	   if (didCollideRight(obj))
	   {
		   ySpeed = ySpd + 1;
	   }
	   
	   if (didCollideTop(obj))
	   {
		   ySpeed = ySpd + 1;
	   }
	   
	   if (didCollideBottom(obj))
	   {
		   ySpeed = ySpd + 1;
	   }
   }
}
