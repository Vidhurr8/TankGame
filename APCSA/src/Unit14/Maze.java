package Unit14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;

	public Maze()
	{

	}

	public Maze(int size, String line)
	{
		Scanner reader = new Scanner(line);
		maze = new int[size][size];
		for (int i = 0; i < size; i++) 
		{
			for (int j = 0; j < size; j++) 
			{
				maze[i][j] = reader.nextInt();
			}
		}
	}

	public boolean hasExitPath(int r, int c)
	{
		if (r < maze.length && r >= 0 && c < maze[r].length && c >= 0 && maze[r][c] == 1) 
		{
			if (c == maze.length - 1) 
			{
				return true;
			}
			maze[r][c] = 2;

			if (hasExitPath(r + 1, c))
			{
				return true;
			}
			else if (hasExitPath(r, c + 1))
			{
				return true;
			}
			else if (hasExitPath(r - 1, c))
			{
				return true;
			}
			else if (hasExitPath(r, c - 1))
			{
				return true;
			}
			maze[r][c] = 1;
		}
		return false;
	}

	public String toString()
	{
		String output = "";
		for (int i = 0; i < maze.length; i++) 
		{
			for (int j = 0; j < maze[i].length; j++) 
			{
				output += maze[i][j] + " ";
			}
			output += "\n";
		}
		if (hasExitPath(0, 0))
		{
			output += "Exit was found\n";
		}
		else
		{
			output += "Exit was not found\n";
		}
		return output;
	}
}