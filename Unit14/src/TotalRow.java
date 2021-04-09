//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	ArrayList test = new ArrayList();
    	for (int[] row: m) {
    		int count = 0;
    		for (int num: row) {
    			count += num;
    		}
    		test.add(count);
    	}
    	return test;
    }
}
