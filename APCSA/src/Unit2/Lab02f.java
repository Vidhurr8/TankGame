package Unit2;

public class Lab02f 
{

	public static void main(String[] args) 
	{
		Line test = new Line(1, 9, 14, 2);
		test.calculateSlope();
		test.print();
		
		Line test2 = new Line(1, 7, 18, 3);
		test2.calculateSlope();
		test2.print();
		
		Line test3 = new Line(6, 4, 2, 2);
		test3.calculateSlope();
		test3.print();
		
		Line test4 = new Line(4, 4, 5, 3);
		test4.calculateSlope();
		test4.print();
		
		Line test5 = new Line(1, 1, 2, 9);
		test5.calculateSlope();
		test5.print();
	}

}
