package Unit13;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSort
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		return count;
	}
	
	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = null;
		ArrayList<Integer> sortedList = new ArrayList<Integer>();
		while (number > 0) 
		{
			sortedList.add(number % 10);
			number = number / 10;
		}
		sorted = new int[sortedList.size()];
		
		for (int i = 0; i < sortedList.size(); i++) 
		{
			sorted[i] = sortedList.get(i);
		}
		Arrays.sort(sorted);
		return sorted;
	}
}