package Unit13;

import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

class InsertionSort
{
	private ArrayList<String> list;

	public InsertionSort()
	{
		list = new ArrayList<String>();
	}

	//modifiers
	public void add(String  word)
	{
		int loc = Collections.binarySearch(list, word);
		if (loc < 0) 
		{
			int loc2 = findInsertLocation(word);
			if (loc2 > list.size() - 1)
			{
				list.add(word);
			}
			else if (list.size() == 0)
			{
				list.add(word);
			}
			else
			{
				list.add(loc2 + 1, word);
			}
		}
	}
	
	public int findInsertLocation(String word) 
	{
		int loc = 0;
		for (int i = 0; i < list.size(); i++) 
		{
			if (list.get(i).compareTo(word) > 0)
			{
				loc = i - 1;
			}
			else if (list.get(i).compareTo(word) < 0)
			{
				loc = i + 1;
			}
			else if (list.get(i).compareTo(word) == 0)
			{
				loc = i;
			}
		}
		return loc;
	}

	public void remove(String word)
	{
		int index = list.indexOf(word);
		if (index >= 0) 
		{
			list.remove(index);
		}
	}

	public String toString()
	{
		return list.toString().replaceAll("[\\[\\]]", "").replaceAll(", ", " ");
	}
}