package Unit8;

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	//instance variables
	private double grades[];
	public Grades()
	{
		setGrades("");
	}
	//constructor
	public Grades(String gradeList)
	{
		setGrades(gradeList);
	}
	//set method
	public void setGrades(String gradeList)
	{
		Scanner test = new Scanner(gradeList);
		grades =  new double[test.nextInt()];
		test.next();
		for (int i = 0; i < grades.length; i++) 
		{
			grades[i] = test.nextDouble();
		}
	}


	private double getSum()
	{
		double sum=0.0;
		for (int i = 0; i < grades.length; i++) 
		{
			sum += grades[i];
		}
		return sum;
	}

	public double getAverage()
	{
		double average = 0.0;
		average = getSum() / grades.length;
		return average;
	}


	//toString method
	public String toString() 
	{
		String output = "";
		for (int i = 0; i < grades.length; i++) 
		{
			output += "Grade " + i + " is: " + grades[i] + "\n";
		}
		output += "\nAverage: " + getAverage() + "\n";
		return output;
	}


}