package Unit3;

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		a = 0;
		b = 0;
		c = 0;
		rootOne = 0;
		rootTwo = 0;
	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		setEquation(quadA, quadB, quadC);
		rootOne = 0;
		rootTwo = 0;
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
 	}

	public void calcRoots( )
	{
		rootOne = (-1 * b + Math.sqrt(b * b - 4 * a * c)) / (2*a);
		rootTwo = (-1 * b - Math.sqrt(b * b - 4 * a * c)) / (2*a);
	}

	public void print( )
	{
		System.out.printf("Root one is %.2f\n", rootOne);
		System.out.printf("Root two is %.2f\n\n", rootTwo);
	}
}