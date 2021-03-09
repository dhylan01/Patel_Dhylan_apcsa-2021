//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int odd = 0;
		int oddcount = 0;
		int evencount = 1;
		for (int num: ray) {
			while (odd%2 != 0) {
				if (!(num%2==0)) {
					odd = num;
					
				}
			}
			oddcount++;
		}
		for (int i = ray.size() - 1; i > 0; i--) {
			if (ray.get(i)%2 ==0) {
				evencount = ray.size()- i;
				break;
			}
		}
		

		if ((evencount != 1 && oddcount !=0)) {
			return oddcount - evencount;
		}

		return -1;
	}
}