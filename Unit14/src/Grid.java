  
import java.util.Arrays;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid= new String[rows][cols];
		for (int row=0; row<grid.length; row++) 
		{
			for (int col=0; col<grid[row].length; col++)
			{
				grid[row][col]=vals[(int)(Math.random()*vals.length)];
			}
		}
	
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int[] counter = new int[vals.length];
		for (int i = 0; i < vals.length; i++) {
			counter[i]= countVals(vals[i]);
		}
		int maxInt = 0;
		for (int i = 0; i < vals.length; i++) {
			if(counter[i] > maxInt) maxInt = i;
		}
		return vals[maxInt] + " Occurs the most";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{ int count = 0;
		for (String[] row: grid) {
			for (String in: row) {
				if (val.equals(in)) count++;
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for (int row=0; row<grid.length; row++)
		{
			output=output+"\n"+Arrays.deepToString(grid[row]);
		}
		return output;
	}
}