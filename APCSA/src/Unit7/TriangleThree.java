package Unit7;

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		this(0, "");
	}

	public TriangleThree(int count, String let)
	{
		setTriangle(let, count);
	}

	public void setTriangle( String let, int sz )
	{
		letter = let;
		size = sz;
	}

	public String getLetter()
	{
		return "#";
	}

	public String toString()
	{
		String output="";
		int t;
		for (int i = 1; i <= size; i++)
		{
			for (int m = 0; m < size - i; m++)
			{
				output += " ";
			}
			for (int j = 1; j <= i; j++)
			{
				output += letter;
			}
			output += "\n";
		}
		return output+"\n";
	}
}