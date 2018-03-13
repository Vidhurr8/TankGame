package Unit11GradesArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Grade 
{
	private ArrayList<Double> grades = new ArrayList<Double>();

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
		gradeList = gradeList.substring(4);
		Scanner chopper2 = new Scanner(gradeList);
		for (int i = 0; i < len; i++) {
			grades.add(chopper2.nextDouble());
		}
	}

	public void setGrade(int spot, double grade) 
	{
		grades.set(spot, grade);
	}

	public double getSum() 
	{
		double sum = 0.0;
		for (int i = 0; i < grades.size(); i++) 
		{
			sum += grades.get(i);
		}
		return sum;
	}

	public double getLowGrade() 
	{
		double low = Double.MAX_VALUE;
		for (int i = 0; i < grades.size(); i++) 
		{
			if (grades.get(i) < low)
				low = grades.get(i);
		}
		return low;
	}

	public double getHighGrade() 
	{
		double high = Double.MIN_VALUE;
		for (int i = 0; i < grades.size(); i++) 
		{
			if (grades.get(i) > high)
				high = grades.get(i);
		}
		return high;
	}

	public int getNumGrades() 
	{
		return grades.size();
	}

	public String toString() 
	{
		String output = "";

		for (int i = 0; i < grades.size(); i++) 
		{
			output += grades.get(i) + " ";
		}
		/*
		 * output += "\n Sum is " + getSum() + "\n Number of grades : " +
		 * grades.length + "\n Low grade : " + getLowGrade() +
		 * "\n High grade : " + getHighGrade();
		 */

		return output;
	}
}