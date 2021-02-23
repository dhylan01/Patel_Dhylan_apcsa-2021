//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;
   public int a,b,c;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;

	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int gcd = 0;
		for (int count = 2; count < a; count++){
		   if (a % count == 0 && b % count == 0 && c % count == 0) gcd = count;
		}
		return gcd;
	}

	public String toString()
	{
		String output="";
		 for (a = 3; a < number; a++) {

	            for (b = 4; b < number; b++) {

	                for ( c = 5; c < number; c++){
	                    if( (Math.pow(a,2) + Math.pow(b, 2) == Math.pow(c, 2))) {
	                        if((a % 2 == 0 && b % 2 != 0) || (a % 2 !=0 && b % 2 == 0)) {
	                        	if (greatestCommonFactor(a,b,c) < 1) {
	                        		System.out.println( a + "" + b + "" + c);
	                        	}
	                        }
	                    }   
	                }
	            }
	      
		 }
		 return "";
	}
}