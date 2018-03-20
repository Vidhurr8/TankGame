package Unit14;

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{


	}

	public TicTacToe(String game)
	{
		mat = new char[3][3];
		int k = 0;
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				mat[i][j] = game.charAt(k++);
			}
		}
	}

	public String getWinner()
	{
		String winner = "cats game nobody wins";
		for (int i = 0; i < 3; i++) 
		{
			if (mat[i][0] == mat[i][1] && mat[i][0] == mat[i][2])
			{
				winner = mat[i][0] + " won horizontally!";
			}
			else if (mat[0][i] == mat[1][i] && mat[0][i] == mat[2][i])
			{
				winner = mat[0][i] + " won vertically!";
			}
		}
		if (mat[0][0] == mat[1][1] && mat[0][0] == mat[2][2])
		{
			winner = mat[0][0] + " won diagonally!";
		}
		else if (mat[0][2] == mat[1][1] && mat[0][2] == mat[2][0])
		{
			winner = mat[0][2] + " won diagonally!";
		}
		return winner;
	}

	public String toString()
	{
		String output = "";
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				output += mat[i][j] + " ";
			}
			output += "\n";
		}
		output += getWinner();
		return output + "\n\n";
	}
}