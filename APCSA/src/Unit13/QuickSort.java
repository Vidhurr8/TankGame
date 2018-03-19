package Unit13;

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class QuickSort
{
	private static int passCount;

	public static void quickSort(Comparable[] list)
	{
		passCount = 0;
		int high = list.length - 1;
		int low = 0;
		if (low < high) 
		{
			int split = partition(list, low, high);
			quickSort(list, low, split);
			quickSort(list, split + 1, high);
		}
		System.out.println();	
	}


	private static void quickSort(Comparable[] list, int low, int high)
	{
		int i = 0;
		if (low < high)
		{
			int ren = partition(list, low, high);
			quickSort(list, low, ren);
			quickSort(list, ren + 1, high);
		}
	}

	private static int partition(Comparable[] list, int low, int high)
	{
		Comparable stuff = list[low];
		int bottom = low - 1;
		int top = high + 1;
		while (bottom < top) 
		{
			while (list[--top].compareTo(stuff) > 0)
				;
			while (list[++bottom].compareTo(stuff) < 0)
				;
			if (bottom >= top) 
			{
				return top;
			}
			Comparable tmp = list[bottom];
			list[bottom] = list[top];
			list[top] = tmp;
			String output = "";
			for (int i = 0; i < list.length; i++) 
			{
				output += (int) list[i] + " ";
			}
			System.out.println("pass" + " " + passCount + ": " + output + "\n");
			passCount++;
		}
		return 0;
	}
}