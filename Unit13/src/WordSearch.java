//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {	

    	int counter = 0;
    	m = new String[size][size];
    	for (int i = 0; i < size; i++) {
    		for (int j = 0; j < size; j++) {
    			m[i][j] = str.substring(counter, counter + 1);
    			counter++;
    		}
    	}
    	
    }

    public boolean isFound( String word )
    {
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
	   return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		return false;
	}

    public String toString()
    {	String output = "";
    for (String[] row: m) {
		for(String letter: row) {
			output += letter;
		}
		output += "\n";
	}
 		return output;
    }
}
