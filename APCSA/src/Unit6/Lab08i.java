package Unit6;

import static java.lang.System.*;
import java.lang.Math;
import java.util.Scanner;

public class Lab08i
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int what = 0;
		for (int i = 1; i < 8; i++) 
		{
			System.out.println("Enter a number: ");
			what = keyboard.nextInt();
			Prime test = new Prime(what);
			test.isPrime();
			out.println(test);
			// add test cases
		}
	}
}
