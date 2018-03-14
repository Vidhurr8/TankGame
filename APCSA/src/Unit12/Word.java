package Unit12;

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word(String s)
	{
		word = s;
	}

	public int compareTo( Word rhs )
	{
		if (word.equals(rhs.getWord()))
		{
			return 0;
		}
		if (word.length() < rhs.getWord().length()) 
		{
			return 1;
		}
		if (word.length() == rhs.getWord().length()) 
		{
			int minSize = word.length();
			for (int i = 0; i < minSize; i++) 
			{
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