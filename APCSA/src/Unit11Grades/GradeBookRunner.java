package Unit11Grades;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class GradeBookRunner
{
   public static void main(String args[])
   {
		out.println("Welcome to the Class Stats program!");
		out.println("What is the name of this class?");
		Scanner keyboard = new Scanner(System.in);
		String class1 = keyboard.nextLine();
		out.println("How many students are in this class?");
		int num = keyboard.nextInt();
		keyboard.nextLine();
		//String[] students = new String[num];
		ArrayList<String> students = new ArrayList<String>();
		String[] studentGrades = new String[num];
		for (int i = 0; i < num; i++)
		{
			out.println("Enter the name of Student " + (i + 1) + ": ");
			students.add(keyboard.nextLine());
		}
		
		for (int i = 0; i < num; i++)
		{
			out.println("Enter the grades for " + (String) students.get(i) + " (Use the format x - grades (2 - 100 100)): ");
			studentGrades[i] = keyboard.nextLine();
		}
		
		Class test = new Class(class1,num);
		for (int i = 0; i < num; i++)
		{
			test.addStudent(i,new Student((String) students.get(i),studentGrades[i]));
		}	
		out.print(test);
		
		for (int i = 0; i < num; i++)
		{
			out.println(String.format(test.getStudentName(i) + "\'s average = %.2f",test.getStudentAverage(i)));	
		}

		out.println("Failure List = " + test.getFailureList(70));	
		out.println("Highest Average = " + test.getStudentWithHighestAverage());
		out.println("Lowest Average = " + test.getStudentWithLowestAverage());
								
		out.println(String.format("Class Average = %.2f",test.getClassAverage()));									

	}		
}