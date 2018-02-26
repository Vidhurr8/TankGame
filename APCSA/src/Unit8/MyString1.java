package Unit8;

public class MyString1 
{
	private char[] characters;

	/** Create a new Mystring1 object */
	public MyString1(char[] chars) 
	{
		characters = chars;
	}

	/** Returns an integer greater than 0, equal to 0, 
	*   or less than 0 to indicate whether this string  
	*   is greater than, equal to, or less than this s */
	public char charAt(int index)
	{
		return characters[index];
	}

	/** Return a new MyString1 object that is 
	*   a substring with a specified begin */
	public int length()
	{
		return characters.length;
	}

	/** Return a new MyString1 object in all Upper case */
	public void substring(int begin, int end)
	{
		char[] temp = new char[end-begin];
		
		for (int i = begin; i < end; i++)
		{
			temp[i-begin] = characters[i];
		}
	}

	/** Return string as a character array */
	//MyString1 newString = new MyString1(temp);
	public void toLowerCase()
	{
		char[] temp = new char[characters.length];
		
		for (int i = 0; i < temp.length; i++)
		{
			//if (characters[i]>)
		}
	}

	

}