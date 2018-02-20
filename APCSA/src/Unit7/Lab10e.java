package Unit7;

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String response;
		do 
		{
			System.out.print("Guessing Game - how many numbers? ");
			int guess = keyboard.nextInt();
			GuessingGame test = new GuessingGame(guess);
			test.playGame();
			System.out.println("Do you want to play again? ");
			response = keyboard.next();
		} 
		while (response.equals("Y") || response.equals("y"));
	}
}