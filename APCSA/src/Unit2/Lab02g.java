package Unit2;

public class Lab02g 
{

	public static void main(String[] args) 
	{
		Fahrenheit test = new Fahrenheit();
		test.setFahrenheit(98.6);
		test.getCelsius();
		test.print();
		
		test.setFahrenheit(52.30);
		test.getCelsius();
		test.print();

		test.setFahrenheit(82.45);
		test.getCelsius();
		test.print();

		test.setFahrenheit(75.00);
		test.getCelsius();
		test.print();

		test.setFahrenheit(100.00);
		test.getCelsius();
		test.print();
	}

}
