package Unit13;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Search 
{
	public static void main(String[] args) 
	{
		int[] values = new int[100];
		Random rand = new Random();
        for (int i = 0; i < values.length; i++)
        {
        	values[i] = rand.nextInt(100) + 1;
        }
        for (int i = 0; i < values.length; i++)
        {
        	int count = 0;
        	for (int j = 0; j < values.length - 1; j++) 
        	{
                if (values[j] == i)
                {
                    count += 1;
                }
        	}
        }
	}

}
