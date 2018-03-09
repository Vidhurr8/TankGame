package Unit11Grades;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grade
{
	private double[] grades;
	
	public Grade()
	{
		setGrades("");
	}
	
	public Grade(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{
		Scanner chopper = new Scanner(gradeList);
		int len = chopper.nextInt();
		grades = new double[len];
		gradeList = gradeList.substring(4);
		Scanner chopper2 = new Scanner(gradeList);
		for (int i = 0; i < len; i++) 
		{
			grades[i] = chopper2.nextDouble();
		}
	}
	
	public void setGrade(int spot, double grade)
	{
		grades[spot] = grade;
	}
	
	public double getSum()
	{
		double sum = 0.0;
		for (int i = 0; i < grades.length; i++) 
		{
			sum += grades[i];
		}
		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		for (int i = 0; i < grades.length; i++) 
		{
			if (grades[i] < low)
				low = grades[i];
		}
		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		for (int i = 0; i < grades.length; i++) 
		{
			if (grades[i] > high)
				high = grades[i];
		}
		return high;
	}
	
	public int getNumGrades()
	{
		return grades.length;
	}
	
	public String toString()
	{
		String output = "";

		for (int i = 0; i < grades.length; i++) 
		{
			output += grades[i] + " ";
		}
		/*
		 * output += "\n Sum is " + getSum() + "\n Number of grades : " +
		 * grades.length + "\n Low grade : " + getLowGrade() +
		 * "\n High grade : " + getHighGrade();
		 */

		return output;
	}	
}