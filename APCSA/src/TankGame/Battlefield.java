package TankGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Timer;
import java.util.Random;

public class Battlefield extends Canvas implements KeyListener, Runnable
{
	private Tank tank;
	private Building buildingOne;
	private Building buildingTwo;

	// uncomment once you are ready for this part
	
	private ArrayList<Building> buildings;
	private ArrayList<Ammo> shots;
	
	private int TIMER; // 1 second
	private Timer addTimer;
	private double score;
	private double kills;
	private int speed;
	private double time;
	private double start;
	private double end;
	private int count = 0;
	private String direction = "UP";
	private String shotDirection = "UP";
	private Random rand = new Random();

	private boolean[] keys;
	private BufferedImage back;

	public Battlefield()
	{
		setBackground(Color.GRAY);

		keys = new boolean[5];

		//instantiate other stuff
		score = 0;
		kills = 0;
		tank = new Tank(800, 750, 1);
		buildings = new ArrayList<Building>();
		shots = new ArrayList<Ammo>();
		speed = 1;
		TIMER = 1000;
		time = 1;
		setBackground(Color.WHITE);
		setVisible(true);

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
		
		startAttack();
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
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
		graphToBack.setColor(Color.GRAY);
		graphToBack.fillRect(0, 0, 1600, 900);
		graphToBack.setColor(Color.WHITE);
		graphToBack.setFont(new Font("TimesRoman", Font.PLAIN, 50));
		graphToBack.drawString("Tank Game", 675, 200);
		graphToBack.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		graphToBack.drawString("By Vidhur Raveendran", 703, 250);
		graphToBack.setFont(new Font("TimesRoman", Font.PLAIN, 15));
		graphToBack.drawString("Instructions: Destroy all buildings as quickly as possible", 630, 300);
		graphToBack.drawString("Controls: Arrow Keys for movement, space to shoot", 635, 315);
		graphToBack.drawString("Score is determined by the amount of time taken to destroy all buildings", 590, 330);
		graphToBack.setFont(new Font("TimesRoman", Font.PLAIN, 35));
		graphToBack.drawString("Press Space to Begin!", 635, 450);

		if(keys[0] == true)
		{
			if (tank.getX() > 0) 
			{
				tank.move("LEFT");
				tank.setDirection("LEFT");
				direction = "LEFT";
			}
		}

		//add code to move stuff
		if (keys[1] == true) 
		{
			if (tank.getX() < 1550) 
			{
				tank.move("RIGHT");
				tank.setDirection("RIGHT");
				direction = "RIGHT";
			}
		}
		if (keys[2] == true) 
		{
			if (tank.getY() > 10) 
			{
				tank.move("DOWN");
				tank.setDirection("UP");
				direction = "DOWN";
			}
		}
		if (keys[3] == true) 
		{
			if (tank.getY() < 850) 
			{
				tank.move("UP");
				tank.setDirection("DOWN");
				direction = "UP";
			}
		}
		if (keys[4] == true) 
		{
			if (buildings.size() == 0 && count == 0)
			{
				count++;
				addTimer.start();
				tank.setDirection("UP");
				buildings.add(new Building(rand.nextInt(1450) + 80, rand.nextInt(650) + 100, 0));
				buildings.add(new Building(rand.nextInt(1450) + 80, rand.nextInt(650) + 100, 0));
				buildings.add(new Building(rand.nextInt(1450) + 80, rand.nextInt(650) + 100, 0));
				buildings.add(new Building(rand.nextInt(1450) + 80, rand.nextInt(650) + 100, 0));
				buildings.add(new Building(rand.nextInt(1450) + 80, rand.nextInt(650) + 100, 0));
				buildings.add(new Building(rand.nextInt(1450) + 80, rand.nextInt(650) + 100, 0));
				buildings.add(new Building(rand.nextInt(1450) + 80, rand.nextInt(650) + 100, 0));
				buildings.add(new Building(rand.nextInt(1450) + 80, rand.nextInt(650) + 100, 0));
			}
			
			Ammo shot = new Ammo(tank.getX() + 41, tank.getY(), 5);
			if (tank.getDirection() == "UP")
			{
				shot.setPos(tank.getX() + 41, tank.getY());
				shotDirection = "DOWN";
			}
			
			else if (tank.getDirection() == "DOWN")
			{
				shot.setPos(tank.getX() + 34, tank.getY() + 75);
				shotDirection = "UP";
			}
			
			else if (tank.getDirection() == "LEFT")
			{
				shot.setPos(tank.getX(), tank.getY() + 34);
				shotDirection = "LEFT";
			}
			
			else if (tank.getDirection() == "RIGHT")
			{
				shot.setPos(tank.getX() + 75, tank.getY() + 41);
				shotDirection = "RIGHT";
			}
			else
			{
				shot.setPos(tank.getX() + 41, tank.getY());
			}
			shots.add(shot);
			keys[4] = false;
		}
		
		if (count > 0)
		{
			graphToBack.setColor(Color.GRAY);
			graphToBack.fillRect(0, 0, 1600, 900);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Kills: " + kills, 25, 100);
			tank.draw(graphToBack);
		}
		
		if (kills == 8) 
		{
			addTimer.stop();
			tank.setSpeed(0);
			graphToBack.setColor(Color.RED);
			score = (int) ((kills / time) * 100);
			graphToBack.drawString("Score: " + score, 25, 150);
			graphToBack.setColor(Color.WHITE);
			tank.setPos(1700, 0);
		}

		//add in collision detection
		for (int j = 0; j < buildings.size(); j++) 
		{
			Building a = buildings.get(j);
			a.draw(graphToBack);
			if (a.getX() <= 1600) 
			{
				if ((a.getX() + 80 >= tank.getX() && a.getX() <= tank.getX() && a.getY() + 80 >= tank.getY()
						&& a.getY() <= tank.getY()) || a.getX() + 80 >= tank.getX() + 80 && a.getX() <= tank.getX() + 80 && a.getY() + 80 >= tank.getY() + 80
						&& a.getY() <= tank.getY() + 80) 
				{
					buildings.remove(a);
					kills++;
				}
			}
			for (int i = 0; i < shots.size(); i++) 
			{
				Ammo s = shots.get(i);
				if (a.getX() <= s.getX() && a.getX() + 80 >= s.getX() && a.getY() <= s.getY()
						&& a.getY() + 80 >= s.getY()) 
				{
					buildings.remove(a);
					shots.remove(s);
					kills++;
				}
			}
		}
		
		for (int i = 0; i < shots.size(); i++) 
		{
			Ammo s = shots.get(i);
			s.draw(graphToBack);
			s.move(shotDirection);
		}
		
		for (int i = 0; i < shots.size(); i++) 
		{
			Ammo s = shots.get(i);
			if (s.getY() <= 1 || s.getY() >= 899 || s.getX() <= 1 || s.getX() >= 1599) 
			{
				shots.remove(s);
			}
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{

	}
	
	public void startAttack() 
	{
		if (addTimer == null) 
		{
			addTimer = new Timer(TIMER, new Battlefield.TimerHandler());
		} 
	}
	
	private class TimerHandler implements ActionListener 
	{
		public void actionPerformed(ActionEvent actionEvent) 
		{
			time++;
		}
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
           repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}