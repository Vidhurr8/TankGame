package Unit6;

import static java.lang.System.*;

public class Lab09f
{
	public static void main( String args[] )
	{
		LetterRemover test = new LetterRemover("I am Sam I am", 'a');
		out.println(test);

		test = new LetterRemover("ssssssssxssssesssssesss", 's');
		out.println(test);

		test = new LetterRemover("qwertyqwertyqwerty", 'a');
		out.println(test);

		test = new LetterRemover("abababababa", 'b');
		out.println(test);

		test = new LetterRemover("abaababababa", 'x');
		out.println(test);
		// add test cases

	}
}