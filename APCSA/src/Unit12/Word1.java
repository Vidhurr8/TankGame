package Unit12;

import static java.lang.System.*;

public class Word1 implements Comparable<Word1>
{
	private String word;

	public Word1( String s)
	{
		word = s;
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount = 0;
		for (int i = 0; i < word.length(); i++)
			for (int j = 0; j < vowels.length(); j++) 
			{
				if (word.charAt(i) == vowels.charAt(j)) 
				{
					vowelCount++;
				}
			}
		return vowelCount;
	}

	public int compareTo(Word1 rhs)
	{
		if (word.equals(rhs))
		{
			return 0;
		}
		if (numVowels() < rhs.numVowels())
		{
			return 1;
		}
		if (numVowels() == rhs.numVowels()) 
		{
			int minLength = Math.min(word.length(), rhs.getWord().length());
			for (int i = 0; i < minLength; i++) {
				if (word.charAt(i) != rhs.getWord().charAt(i)) 
				{
					if (word.charAt(i) < rhs.getWord().charAt(i)) 
					{
						return 1;
					}
					return -1;
				}
			}
		}
		return -1;
	}
	
	public String getWord() 
	{
		return word;
	}

	public void setWord(String word) 
	{
		this.word = word;
	}
	
	public String toString()
	{
		return word;
	}
}