package TankGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Tank extends MovingThing
{
	private int speed;
	private Image image;

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
			image = ImageIO.read(new File("\\Users\\raveendranv4629\\Desktop\\VidhurWorkspace\\tank.png"));
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
		window.drawImage(image,getX(),getY(),80,80,null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}