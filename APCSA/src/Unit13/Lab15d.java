package Unit13;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Lab15d
{
	public static void main(String args[]) throws IOException 
	{
		Scanner file = new Scanner(new File("/Users/raveendranv4629/Desktop/VidhurWorkspace/lab15d.dat"));
		int size = file.nextInt();
		file.nextLine();
		for (int i = 0; i < size; i++) 
		{
			FancyWords fu = new FancyWords(file.nextLine());
			System.out.println(fu);
		}

	}
}