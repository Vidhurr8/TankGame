package Unit14;

import static java.lang.System.*;

public class Lab21g
{
	public static void main(String args[])
	{
		//instantiate an AtCounter
		AtCounter test = new AtCounter();
		//test the code
		test.countAts(0, 0);
		out.println(test);
		AtCounter test2 = new AtCounter();
		test2.countAts(2, 5);
		out.println(test2);
		AtCounter test3 = new AtCounter();
		test3.countAts(5, 0);
		out.println(test3);
		AtCounter test4 = new AtCounter();
		test4.countAts(9, 9);
		out.println(test4);
		AtCounter test5 = new AtCounter();
		test5.countAts(3, 9);
		out.println(test5);
	}
}