package Unit11Grades;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class GradeTester
{
   public static void main( String args[] )
   {
		Grade test = new Grade("5 - 90 85 95.5 77.5 88");
		out.println(test);
		out.println("sum = " + test.getSum());	
		out.println("num grades = " + test.getNumGrades());											
		out.println("low grade = " + test.getLowGrade());		
		out.println("high grade = " + test.getHighGrade());
	}		
}