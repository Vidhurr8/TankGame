package Unit13;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class FancyWords
{
	private String[] wordRay;

	public FancyWords(String sentence)
	{
		setWords(sentence);
	}

	public void setWords(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public String toString()
	{
		String output = "";
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < wordRay.length; i++) 
		{
			if (wordRay[i].length() > max) 
			{
				max = wordRay[i].length();
			}
			StringBuffer rev = new StringBuffer(wordRay[i]);
			rev.reverse();
			wordRay[i] = rev.toString();
		}
		Collections.reverse(Arrays.asList(wordRay));
		for (int i = 0; i < max; i++) 
		{
			for (int j = 0; j < wordRay.length; j++) 
			{
				if (i < wordRay[j].length()) 
				{
					output += wordRay[j].charAt(i);
				} else
					output += " ";
			}
			output += "\n";
		}

		return output + "\n\n";
	}
}