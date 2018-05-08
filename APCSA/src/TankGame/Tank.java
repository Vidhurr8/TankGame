package TankGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Tank extends MovingThing
{
	private int speed;
	private Image imageUp;
	private Image imageDown;
	private Image imageLeft;
	private Image imageRight;

	public Tank()
	{
		this(0,0,0);
	}

	public Tank(int x, int y)
	{
		this(x,y,0);
	}

	public Tank(int x, int y, int s)
	{
		super(x, y);
		speed=s;
		try
		{
			imageUp = ImageIO.read(new File("\\Users\\raveendranv4629\\Desktop\\VidhurWorkspace\\tankUp.png"));
			imageDown = ImageIO.read(new File("\\Users\\raveendranv4629\\Desktop\\VidhurWorkspace\\tankDown.png"));
			imageLeft = ImageIO.read(new File("\\Users\\raveendranv4629\\Desktop\\VidhurWorkspace\\tankLeft.png"));
			imageRight = ImageIO.read(new File("\\Users\\raveendranv4629\\Desktop\\VidhurWorkspace\\tankRight.png"));
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("Tank doesn't work!");
		}
	}


	public void setSpeed(int s)
	{
	   //add more code
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		window.drawImage(imageUp,getX(),getY(),80,80,null);
	}
	
	public void draw2( Image i )
	{
		Graphics window = null;
		window.drawImage(i,getX(),getY(),80,80,null);
	}
	
	public void setDirection(String s)
	{
		if (s == "LEFT")
		{
			draw2(imageLeft);
		}
		
		else if (s == "RIGHT")
		{
			draw2(imageRight);
		}
		
		else if (s == "UP")
		{
			draw2(imageUp);
		}
		
		else if (s == "DOWN")
		{
			draw2(imageDown);
		}
	}
	
	public String toString()
	{
		return super.toString() + getSpeed();
	}
}