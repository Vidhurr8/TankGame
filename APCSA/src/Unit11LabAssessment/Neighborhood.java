package Unit11LabAssessment;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Neighborhood
{
	private String name;
	private House[] houseList;
	
	public Neighborhood()
	{
		name="";
		houseList=new House[0];
	}
	
	public Neighborhood(String neighborhoodName, int houseCount)
	{
		name = neighborhoodName;
		houseList=new House[houseCount];
	}
	
	public void addHouse(int houseNum, House h)
	{
		houseList[houseNum] = h;
	}
	
	public String getNeighborhoodName()
	{
	   return name;	
	}
	
	public String getHouseName(int houseNum)
	{
		return houseList[houseNum].getName();
	}

	public String getHouseWithHighestNumOfCars()
	{
		double high = Double.MIN_VALUE;
		String hName = "";
		for (int i = 0; i < houseList.length; i++) 
		{
			if (houseList[i].getNumCars() > high) 
			{
				high = houseList[i].getNumCars();
				hName = houseList[i].getName();
			}
		}
		return hName;
	}
	
	public String getHouseWithLowestNumOfCars()
	{
		double low = Double.MAX_VALUE;
		String hName = "";
		for (int i = 0; i < houseList.length; i++) 
		{
			if (houseList[i].getNumCars() < low) 
			{
				low = houseList[i].getNumCars();
				hName = houseList[i].getName();
			}
		}
		return hName;
	}
	
	public String toString()
	{
		String output = getNeighborhoodName() + "\n";
		for (int i = 0; i < houseList.length; i++) 
		{
			output += houseList[i].toString() + "\n";
		}
		return output;	
	}  	
}
