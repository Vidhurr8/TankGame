package Unit10;

public class MyInteger 
{
	private int integer;
	
	public MyInteger(int i)
	{
		integer = i;
	}
	
	public int value(int i)
	{
		integer = i;
		return integer;
	}

	public int getValue()
	{
		return integer;
	}
	
	public boolean isEven()
	{
		if (integer % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isOdd()
	{
		if (integer % 2 == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isPrime()
	{
		for(int i=2;i<integer;i++) 
		{
	        if(integer % i==0)
	        {
	           return false;
	        }
	    }
	    return true;
	}
	
	public static boolean isEven(int i)
	{
		if (i % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isOdd(int i)
	{
		if (i % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isPrime(int n)
	{
		for(int i=2;i<n;i++) 
		{
	        if(n % i==0)
	        {
	           return false;
	        }
	    }
	    return true;
	}
	
	public static void isEven(MyInteger test)
	{
		test.isEven();
	}
	
	public static void isOdd(MyInteger test)
	{
		test.isOdd();
	}
	
	public static void isPrime(MyInteger test)
	{
		test.isPrime();
	}
	
	public boolean equals(int i)
	{
		MyInteger test = new MyInteger(i);
		if (i == test.getValue())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean equals(MyInteger test)
	{
		int i = 0;
		if (test.getValue() == i)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static int parseInt(char[] values) 
	{
        int sum = 0;
        for (char i : values) 
        {
            sum += Character.getNumericValue(i);
        }
        return sum;
    }
	public static int parseInt(String value) 
	{
        return Integer.parseInt(value);
    }
	
	public static void main(String[] args) 
	{

	}

}
