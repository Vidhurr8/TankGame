package Unit11LabAssessment;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class NeighborhoodRunner
{
   public static void main(String args[])
   {
		out.println("What is the name of this neighborhood?");
		Scanner keyboard = new Scanner(System.in);
		String neighborhood1 = keyboard.nextLine();
		out.println("How many houses are in this neighborhood?");
		int num = keyboard.nextInt();
		keyboard.nextLine();
		//String[] students = new String[num];
		ArrayList<String> houses = new ArrayList<String>();
		String[] houseCars = new String[num];
		for (int i = 0; i < num; i++)
		{
			out.println("Enter the name of house " + (i + 1) + ": ");
			houses.add(keyboard.nextLine());
		}
		
		for (int i = 0; i < num; i++)
		{
			out.println("Enter the number of cars for " + (String) houses.get(i));
			houseCars[i] = keyboard.next();
			keyboard.nextLine();
		}
		
		Neighborhood test = new Neighborhood(neighborhood1,num);
		for (int i = 0; i < num; i++)
		{
			test.addHouse(i,new House((String) houses.get(i),houseCars[i]));
		}	
		out.print(test);
		
		/*for (int i = 0; i < num; i++)
		{
			out.println(String.format(test.getHouseName(i)));	
		}*/

	}		
}