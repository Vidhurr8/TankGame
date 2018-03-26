package Unit15;

public abstract class Animal 
{
	private int legs = 0;
	private int bloodTemp = 0;
	private String name = "";
	public Animal(String n)
	{
		name = n;
	}
	
	public int numLegs(int l)
	{
		legs = l;
		return legs;
	}
	
	public boolean isMammal(int bt)
	{
		bloodTemp = bt;
		if (bloodTemp >= 97)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
