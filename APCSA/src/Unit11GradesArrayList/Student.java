package Unit11GradesArrayList;

public class Student 
{
	private String myName;
	private Grade myGrades;

	public Student() 
	{
		setName("");
		setGrades("");
	}

	public Student(String name, String gradeList) 
	{
		myGrades = new Grade(gradeList);
		setName(name);
		setGrades(gradeList);

	}

	public void setName(String name) 
	{
		myName = name;

	}

	public void setGrades(String gradeList) 
	{
		myGrades.setGrades(gradeList);
	}

	public void setGrade(int spot, double grade) 
	{
		myGrades.setGrade(spot, grade);

	}

	public String getName() 
	{
		return myName;
	}

	public int getNumGrades() 
	{
		return myGrades.getNumGrades();
	}

	public double getSum() 
	{
		return myGrades.getSum();
	}

	public double getAverage() 
	{
		double average = myGrades.getSum() / myGrades.getNumGrades();
		return average;
	}

	public double getAverageMinusLow() 
	{
		double y = (myGrades.getSum() - myGrades.getLowGrade()) / (myGrades.getNumGrades() - 1);
		return y;
	}

	public double getHighGrade() 
	{
		return myGrades.getHighGrade();
	}

	public double getLowGrade() 
	{
		return myGrades.getLowGrade();
	}

	public String toString() 
	{
		return myName + " " + myGrades;
	}
}