package Unit14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Maze test;
		Scanner file = new Scanner(new File("/Users/raveendranv4629/Desktop/VidhurWorkspace/lab21i.dat"));
		while (file.hasNextLine()) 
		{
			int size = file.nextInt();
			file.nextLine();
			String line = file.nextLine();
			test = new Maze(size, line);
			out.println(test);
		}
	}
}