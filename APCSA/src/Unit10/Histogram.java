package Unit10;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
	}

	public Histogram(char[] values, String fName)
	{
		this();
		fileName = fName;
		for (int i = 0; i < values.length; i++) {
			letters.add(values[i]);
			count.add(0);
		}
		out.println("search letters = " + letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		String word = "";
		Scanner file = new Scanner(new File("/Users/fireguy/Documents/workspace/Unit 10/src/" + fileName));
		int myvar = file.nextInt();
		for (int i = 0; i < myvar; i++) 
		{
			while (file.hasNext()) 
			{
				word = file.next();
				for (int j = 0; j < letters.size(); j++) 
				{
					for (int m = 0; m < word.length(); m++) 
					{
						if (word.charAt(m) == letters.get(j))
							count.set(j, count.get(j) + 1);
					}
				}
			}

		}

	}

	public char mostFrequent()
	{

		return '#';
	}

	public char leastFrequent()
	{


		return '#';
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}