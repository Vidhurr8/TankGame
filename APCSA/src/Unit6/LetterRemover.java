package Unit6;

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

   public LetterRemover() 
   	{
		setRemover("", 'r');
		// call set
	}

	public LetterRemover(String s, char rem) 
	{
		setRemover(s, rem);
	}

	public void setRemover(String s, char rem) 
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters() 
	{
		StringBuffer cleaned = new StringBuffer(sentence.length());
		cleaned.setLength(sentence.length());
		int current = 0;
		for (int i = 0; i < sentence.length(); i++) 
		{
			char cur = sentence.charAt(i);
			if (cur != lookFor)
			{
				cleaned.setCharAt(current++, cur);
			}
		}
		return cleaned.toString();
	}

	public String toString() 
	{
		return sentence + " - letter to remove: " + lookFor + "\n" + removeLetters() + "\n";
	}
}