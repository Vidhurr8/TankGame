package Unit11GradesArrayList;

import Unit11Grades.Student;

//import java.util.Arrays;
import java.util.ArrayList;

public class Class 
{
	private String className;
	private ArrayList<Student> studentList;

	public Class() 
	{
		className = "";
	}

	public Class(String name) 
	{
		className = name;
		studentList = new ArrayList<Student>();
	}

	public void addStudent(Student s) 
	{
		studentList.add(s);
	}

	public String getClassName() 
	{
		return className;
	}

	public double getClassAverage() 
	{
		double classAverage = 0.0;
		for (int i = 0; i < studentList.size(); i++) 
		{
			classAverage += studentList.get(i).getAverage();
		}
		classAverage = classAverage / studentList.size();

		return classAverage;
	}

	public double getStudentAverage(int stuNum) 
	{
		return studentList.get(stuNum).getAverage();
	}

	public double getStudentAverage(String stuName) 
	{
		int stuNum = 0;
		for (int i = 0; i < studentList.size(); i++) 
		{
			if (studentList.get(i).getName() == stuName)
				stuNum = i;
		}
		return studentList.get(stuNum).getAverage();
	}

	public String getStudentName(int stuNum) 
	{
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage() 
	{
		double high = Double.MIN_VALUE;
		String hName = "";
		for (int i = 0; i < studentList.size(); i++) 
		{
			if (studentList.get(i).getAverage() > high) 
			{
				high = studentList.get(i).getAverage();
				hName = studentList.get(i).getName();
			}
		}
		return hName;
	}

	public String getStudentWithLowestAverage() 
	{
		double low = Double.MAX_VALUE;
		String hName = "";
		for (int i = 0; i < studentList.size(); i++) 
		{
			if (studentList.get(i).getAverage() < low) 
			{
				low = studentList.get(i).getAverage();
				hName = studentList.get(i).getName();
			}
		}
		return hName;
	}

	public String getFailureList(double failingGrade) 
	{
		String output = "";
		for (int i = 0; i < studentList.size(); i++) 
		{
			if (studentList.get(i).getAverage() < failingGrade)
				output += studentList.get(i).getName() + " ";
		}
		return output;
	}

	public String toString() 
	{
		String output = getClassName() + "\n";
		for (int i = 0; i < studentList.size(); i++) 
		{
			output += studentList.get(i).toString() + "     " + String.format("%.4g", studentList.get(i).getAverage())
					+ "\n";
		}
		return output;
	}
}
