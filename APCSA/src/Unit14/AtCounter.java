package Unit14;

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount, myr, myc;

	public AtCounter()
	{
		atCount=0;
		atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
							 {'@','@','@','-','@','@','-','@','-','@'},
							 {'-','-','-','-','-','-','-','@','@','@'},
							 {'-','@','@','@','@','@','-','@','-','@'},
							 {'-','@','-','@','-','@','-','@','-','@'},
							 {'@','@','@','@','@','@','-','@','@','@'},
							 {'-','@','-','@','-','@','-','-','-','@'},
							 {'-','@','@','@','-','@','-','-','-','-'},
							 {'-','@','-','@','-','@','-','@','@','@'},
							 {'-','@','@','@','@','@','-','@','@','@'}};
	}

	public int countAts(int r, int c)
	{
		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]
		if (r >= 0 && c >= 0 && r < 10 && c < 10 && atMat[r][c] == '@') 
		{
			atMat[r][c] = '!';
			atCount++;
			countAts(r + 1, c);
			countAts(r - 1, c);
			countAts(r, c + 1);
			countAts(r, c - 1);
		}
		myr = r;
		myc = c;

		return atCount;
	}

	public int getAtCount()
	{
		return atCount;
	}

	public String toString()
	{
		String output="";
		output += myr + " " + myc + " has " + getAtCount() + " @s connected.";
		return output;
	}
}