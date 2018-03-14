package Unit12;

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	//write a default Constructor
	public Monster()
	{
		setHeight(myHeight);
		setWeight(myWeight);
		setAge(myAge);
	}

	//write an initialization constructor with an int parameter ht
	public Monster(int ht) 
	{
		myHeight = ht;
		myWeight = 0;
		myAge = 0;
	}

	//write an initialization constructor with int parameters ht and wt
	public Monster(int ht, int wt) 
	{
		myHeight = ht;
		myWeight = wt;
		myAge = 0;
	}

	//write an initialization constructor with int parameters ht, wt, and age
	public Monster(int ht, int wt, int age) 
	{
		myHeight = ht;
		myWeight = wt;
		myAge = age;
	}

	//modifiers - write set methods for height, weight, and age
	public void setHeight(int ht) 
	{
		myHeight = ht;
	}

	public void setWeight(int wt) 
	{
		myWeight = wt;
	}

	public void setAge(int age) 
	{
		myAge = age;
	}

	//accessors - write get methods for height, weight, and age
	public int getHeight() 
	{
		return myHeight;
	}

	public int getWeight() 
	{
		return myWeight;
	}

	public int getAge() 
	{
		return myAge;
	}
	
	//creates a new copy of this Object
	public Object clone()
	{
		Monster clone = this;
		return clone;
	}

	public boolean equals(Object obj)
	{
		Monster second = (Monster) obj;
		if (this.getHeight() == second.getHeight() && this.getWeight() == second.getWeight()
				&& this.getAge() == second.getAge())
		{
			return true;
		}
		return false;
	}

	public int compareTo(Object obj)
	{
		Monster rhs = (Monster) obj;
		if (this.getHeight() > rhs.getHeight() || this.getWeight() > rhs.getWeight() || this.getAge() > rhs.getAge())
		{
			return 1;
		}
		if (this.getHeight() < rhs.getHeight() || this.getWeight() < rhs.getWeight() || this.getAge() < rhs.getAge())
		{
			return -1;
		}
		return 0;
	}

	//write a toString() method
	public String toString() 
	{
		return myHeight + " " + myWeight + " " + myAge;
	}
	
}