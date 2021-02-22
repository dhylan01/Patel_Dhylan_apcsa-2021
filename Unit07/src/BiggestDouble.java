//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;
	double array[];
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
		array[0] = a;
		array[1] = b;
		array[2] = c;
		array[3] = d;
	}

	public double getBiggest()
	{	double biggest = array[0];
		for( int i = 0; i < array.length; i++) {
			if ( biggest < array[i]) {
				biggest = array[i];
			}
		}
		
		return biggest;
	}

	public String toString()
	{
	   return one + "," + two + "," + three + "," + four;
	}
}