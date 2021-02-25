//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{ int firstOdd = 0;
	int nextEven = 1;
		int starter = 0;
		int difference = 0;
		for (int i = 0; i < ray.length; i++) {
			if (ray[i]%2 != 0) {
				firstOdd = ray[i];
				starter = i;
				break;
			}
		}
		if (firstOdd == 0) {
			return -1;
		}
		else {
			for(int j = starter + 1; j < ray.length; j++) {
				if (ray[j]%2 == 0) {
					nextEven = ray[j];
					difference = j - starter;
					break;
				}
			}
			if (nextEven == 1) {
				return -1;
			}
		}
		return difference;
		
	}
}