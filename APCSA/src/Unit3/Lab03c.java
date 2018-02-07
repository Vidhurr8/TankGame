package Unit3;

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
		Scanner keyboard = new Scanner(in);
   		int i = 0;
   		while(i<=3)
   		{
   			System.out.println("Enter a: ");
   			int a = keyboard.nextInt();
   			
   			System.out.println("Enter b: ");
   			int b = keyboard.nextInt();
   			
   			System.out.println("Enter c: ");
   			int c = keyboard.nextInt();
   			
   			Quadratic test = new Quadratic(a,b,c);
   			test.calcRoots();
   			test.print();
   			i++;
   			
   		}
   		
   }
}
