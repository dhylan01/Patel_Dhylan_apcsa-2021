//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

public class Variables
{
	public static void main ( String[] args )
	{
		//define 1 variable of each of the
		//following data types
		//byte		short		int 		long
		//float		double
		//char      boolean		String

		//integer variables
		byte byteOne = 127;
		short shortOne = 32767;
		int intOne = 2147483647;
		long longOne = 922337203;//could not put any more numbers for some reason

		//decimal variables
		float floatOne = (float) 2.134567;
		double doubleOne = .2147483647;
		//other integer types


		//other types
		char charOne = 'a';
		boolean booleanOne = true;
		String stringOne = "Hello! World!" ;

		//output your information here
		System.out.println("/////////////////////////////////");
		System.out.println("*                               *");
		System.out.println("*        integer types          *");
		System.out.println("*                               *");
		System.out.println("*8 bit - byteOne = "+byteOne+"\t\t*");
		System.out.println("*16 bit - Short = "+shortOne+"\t\t*");
		System.out.println("*32 bit - Int = "+intOne+"\t\t*");
		System.out.println("*16 bit - Long = "+longOne+"\t\t*");
		System.out.println("/////////////////////////////////");
		System.out.println("*                               *");
		System.out.println("*        decimal types          *");
		System.out.println("*32 bit - Float = "+floatOne+"\t\t*");
		System.out.println("*64 bit - Double = "+doubleOne+"\t\t*");
		System.out.println("*                               *");
		System.out.println("/////////////////////////////////");
		System.out.println("*                               *");
		System.out.println("*        otherer types          *");
		System.out.println("*                               *");
		System.out.println("*16 bit - Char = "+charOne+"\t\t*");
		System.out.println("*1 bit - Boolean = "+booleanOne+"\t\t*");
		System.out.println("*16 bit - String = "+stringOne+"\t\t*");
	}
}