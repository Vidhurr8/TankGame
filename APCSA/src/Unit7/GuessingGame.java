package Unit7;

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;

	public GuessingGame(int stop)
	{
		upperBound = stop;
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		int compguess = (int) (upperBound * Math.random()) + 1;
		System.out.print("Enter a number between 1 and " + upperBound + " ");
		int guess = keyboard.nextInt();
		int counter = 1;
		while (guess != compguess) 
		{
			if (guess < upperBound) 
			{
				if (guess < compguess)
					System.out.println("The guess is too low");
				else if (guess > compguess)
					System.out.println("The Guess is too high");
				System.out.print("Enter a number between 1 and " + upperBound + " ");
				guess = keyboard.nextInt();
				counter++;
			} 
			else 
			{
				System.out.println("Out of Range");
				System.out.print("Enter a number between 1 and " + upperBound + " ");
				guess = keyboard.nextInt();
				counter++;
			}
		}
		System.out.println("\nIt took " + counter + " guesses to guess " + compguess + ".");
		System.out.println("You were wrong " + (((counter - 1) * 100) / upperBound) + "% of the time.\n");
	}

	public String toString()
	{
		String output="";
		return output;
	}
}