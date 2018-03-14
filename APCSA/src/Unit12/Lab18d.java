package Unit12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;
import java.util.ArrayList;

public class Lab18d
{
	public static void main(String args[]) throws IOException
	{
		ArrayList<Word> words = new ArrayList<>();

		Scanner file = new Scanner(new File("/Users/raveendranv4629/Desktop/VidhurWorkspace/lab18d.dat"));
		int size = file.nextInt();
		file.nextLine();

		while (size >= 1) 
		{
			words.add(new Word(file.nextLine()));
			size--;
		}
		file.close();

		for (int n = 0; n < words.size(); n++)
			for (int i = 0; i < words.size() - 1; i++)
				if (words.get(i).compareTo(words.get(i + 1)) == -1) 
				{
					Word temp = words.get(i);
					words.set(i, words.get(i + 1));
					words.set(i + 1, temp);
				}

		for (int i = 0; i < words.size(); i++) 
		{
			System.out.println(words.get(i));
		}
	}
}