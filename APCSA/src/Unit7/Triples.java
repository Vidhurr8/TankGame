package Unit7;

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		number = num;
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		if (a > b && a > c)
		{
			max = a;
		}
		else if (b > a && b > c)
		{
			max = b;
		}
		else
		{
			max = c;
		}
		for (int i = 2; i <= max; i++)
		{
			if (a % i == 0 && b % i == 0 && c % i == 0)
			{
				return i;
			}
		}
		return 1;
	}

	public String toString()
	{
		String output="";
		for (int a = 1; a <= number; a++) 
		{
			for (int b = a + 1; b <= number; b++) 
			{
				for (int c = a; c <= number; c++) 
				{
					if ((a * a) + (b * b) == (c * c)) 
					{
						if (a % 2 == 0 && b % 2 == 1 || a % 2 == 1 && b % 2 == 0) 
						{
							if (greatestCommonFactor(a, b, c) == 1) 
							{
								System.out.println(a + " " + b + " " + c);
							}
						}

					}
				}

			}
		}

		return output + "\n";
	}
}