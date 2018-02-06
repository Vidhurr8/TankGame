package Unit2;

public class Fahrenheit
{
	private double fahrenheit;

	public void setFahrenheit(double fahren)
	{
		fahrenheit = fahren;
	}

	public double getCelsius()
	{
		double celsius = 0.0;
		celsius = (fahrenheit-(32))/1.8;
	
		//add code to convert fahrenheit to celsius
		return celsius;
	}

	public void print()
	{
		//this is part of the solution
		System.out.printf("%.2f degrees Fahrenheit = %.2f degrees Celcius\n\n", fahrenheit, getCelsius());
	}
}
