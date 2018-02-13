package Unit6;

import static java.lang.System.*;

public class LoopStats
{
	private int start, stop;

	public LoopStats()
	{
		
	}

	public LoopStats(int beg, int end)
	{
		start = beg;
		stop = end;
	}

	public void setNums(int beg, int end)
	{
		start = beg;
		stop = end;
	}

	public int getEvenCount()
	{
		int evenCount=0;
		for (int i = 0; i < (stop - start + 1); i++) 
		{
			if ((start + i) % 2 == 0) 
			{
				evenCount++;
			}
		}

		return evenCount;
	}

	public int getOddCount()
	{
		int oddCount=0;
		for (int i = 0; i < (stop - start + 1); i++) 
		{
			if ((start + i) % 2 == 1) 
			{
				oddCount++;
			}
		}
		return oddCount;
	}

	public int getTotal()
	{
		int total=0;
		for (int i = 0; i < (stop - start + 1); i++) 
		{
			total = total + start + i;
		}
		return total;
	}
	
	public String toString()
	{
		return start + " " + stop + "\ntotal: " + getTotal() + "\nodd count: " + getOddCount() + "\neven count: "
				+ getEvenCount() + "\n\n";
	}
}