//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static int num = 0;
	public static void main ( String[] args )
	{
		//add in input
		Scanner keyboard = new Scanner(System.in);

		out.print("Enter a whole number :: ");
		num = keyboard.nextInt();

		System.out.println(num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println( num + " is even :: " + NumberVerify.isEven(num));
		
		out.print("Enter a whole number :: ");
		num = keyboard.nextInt();

		System.out.println(num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println( num + " is even :: " + NumberVerify.isEven(num));
		
		out.print("Enter a whole number :: ");
		num = keyboard.nextInt();

		System.out.println(num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println( num + " is even :: " + NumberVerify.isEven(num));
		
		out.print("Enter a whole number :: ");
		num = keyboard.nextInt();

		System.out.println(num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println( num + " is even :: " + NumberVerify.isEven(num));
		//add in more test cases
	}
}