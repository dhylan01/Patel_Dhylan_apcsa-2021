//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	
	RaySumLast(){
			}
	public int go(int[] ray)
	{ int comp = ray[ray.length - 1];
	int sum = 0;
		if(ray.length >= 1) { 
			for (int i = 0; i < (ray.length - 1); i++) {
				if (ray[i] > comp) {
					sum = sum + ray[i];
				}
			}
			return sum;
		}
		else {
			return -1;
		}
	}
}