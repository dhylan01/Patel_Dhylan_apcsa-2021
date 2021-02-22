//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;
	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a,b,c,d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		double biggest = one;
		if (two > one && two > three && two > four) {
			biggest = two;
		}
		if (three > one && three > two && three > four) {
			biggest = three;
		}
		if (one > two && one > three && one > four) {
			biggest = one;
		}
		if (four > one && four > three && four > two) {
			biggest = four;
		}
		return biggest;
	}

	public String toString()
	{
	   return one + "," + two + "," + three + "," + four;
	}
}