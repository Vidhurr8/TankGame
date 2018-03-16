package Unit11LabAssessment;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Car
{
	private int cars;
	
	public Car()
	{
		setCars("");
	}
	
	public Car(String carList)
	{
		setCars(carList);		
	}
	
	public void setCars(String carList)
	{
		Scanner chopper = new Scanner(carList);
		cars = chopper.nextInt();
	}
	
	public int getNumCars()
	{
		return cars;
	}
		
	public String toString()
	{
		String output = "";
		output += cars;
		/*
		 * output += "\n Sum is " + getSum() + "\n Number of grades : " +
		 * grades.length + "\n Low grade : " + getLowGrade() +
		 * "\n High grade : " + getHighGrade();
		 */

		return output;
	}	
}