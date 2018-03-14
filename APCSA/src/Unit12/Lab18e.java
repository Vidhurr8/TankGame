package Unit12;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		ArrayList<Word1> words = new ArrayList<>();
		Scanner file = new Scanner(new File("/Users/raveendranv4629/Desktop/VidhurWorkspace/lab18e.dat"));
		int length = file.nextInt();
		file.nextLine();
		for (int i = 0; i < length; i++) 
		{
			words.add(new Word1(file.nextLine()));
		}
		for (int n = 0; n < words.size(); n++) 
		{
			for (int i = 0; i < words.size() - 1; i++)
				if (words.get(i).compareTo(words.get(i + 1)) == -1) 
				{
					Word1 temp = words.get(i);
					words.set(i, words.get(i + 1));
					words.set(i + 1, temp);
				}
		}
		for (int i = 0; i < words.size(); i++) 
		{
			System.out.println(words.get(i));
		}
	}
}