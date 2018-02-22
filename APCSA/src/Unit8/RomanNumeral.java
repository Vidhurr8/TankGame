package Unit8;

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		setRoman(str);
	}

	public RomanNumeral(Integer orig)
	{
		setNumber(orig);
	}

	public void setNumber(Integer num)
	{
		number = num;
	}

	public void setRoman(String rom)
	{
		roman = rom;
	}

	public Integer getNumber()
	{
		int output = 0;
		for (int i = 0; i < LETTERS.length; i++) 
		{
			while (roman.indexOf(LETTERS[i]) == 0) 
			{
				output += NUMBERS[i];
				roman = roman.substring(LETTERS[i].length());
			}
		}
		return output;
	}

	public String toString()
	{
		String output = "";
		int value = number;
		for (int i = 0; i < NUMBERS.length; i++) 
		{
			while (value >= NUMBERS[i]) 
			{
				output += LETTERS[i];
				value -= NUMBERS[i];
			}
		}
		return output + "\n";
	}
}