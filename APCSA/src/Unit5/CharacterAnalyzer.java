package Unit5;

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{


	}

	public CharacterAnalyzer(char c)
	{
		theChar = c;
	}

	public void setChar(char c)
	{
		theChar = c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		if ((int)theChar > 90)
		{
			return false;
		}
		else if ((int)theChar > 64 && (int)theChar < 91)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean isLower( )
	{
		if ((int)theChar > 122)
		{
			return false;
		}
		else if ((int)theChar > 96 && (int)theChar < 123)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isNumber( )
	{
		if ((int)theChar > 57)
		{
			return false;
		}
		else if ((int)theChar > 47 && (int)theChar < 58)
		{
			return true;
		}
		else
		{
			return false;
		}
	}	

	public int getASCII( )
	{
		return (int)theChar;
	}

	public String toString()
	{
		String s = "";
		if (isUpper()) 
		{
			s = "" + getChar() + " is a uppercase character. ASCII == " + getASCII() + "\n";
		} else if (isLower()) 
		{
			s = "" + getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";
		} else if (isNumber()) 
		{
			s = "" + getChar() + " is a number. ASCII == " + getASCII() + "\n";
		}
		return s;
	}
}