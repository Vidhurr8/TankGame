package Unit11LabAssessment;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class House
{
	private String houseName;
	private Car myCars;
	
	public House()
	{
		setName("");
		setCars("");
	}
	
	public House(String name, String carList)
	{
		myCars = new Car(carList);
		setName(name);
		setCars(carList);
	}
	
	public void setName(String name)
	{
		houseName = name;
	}	
	
	public void setCars(String carList)
	{
		myCars.setCars(carList);
	}

	public String getName()
	{
		return houseName;
	}
	
	public int getNumCars()
	{
		return myCars.getNumCars();
	}
	
	public String toString()
	{
		return houseName + " " + myCars;
	}	
}
