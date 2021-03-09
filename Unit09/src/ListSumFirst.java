//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{

	public static int go(List<Integer> ray)
	{
		int first = ray.get(0);
		int sum = 0;
		for (int num: ray) {
			if (first < num) {
				sum += ray.get(num);
			}
		}
		if (sum == 0) return -1;
		else return sum;
	}
}