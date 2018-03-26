package Unit15;

public class Dog extends Animal
{
	public Dog(String n) 
	{
		super(n);
	}

	public static void main(String[] args) 
	{
		Dog test = new Dog("Sparky");
		test.numLegs(4);
		test.isMammal(101);
	}

}
