package Unit5;

import static java.lang.System.*;
import java.util.Scanner;

public class Lab05d
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		for (int i = 1; i <= 7; i++) 
		{
			out.print("Enter a letter :: ");
			char letter = keyboard.next().charAt(0);
			CharacterAnalyzer test = new CharacterAnalyzer(letter);
			out.println(test); // A
		}
		// add more test cases
	}
}
