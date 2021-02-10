//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{

	Scanner keyboard = new Scanner(System.in);
	out.print("Enter a test string:: ");
	String input = keyboard.next();
	StringOddOrEven test = new StringOddOrEven(input);
	test.isEven();
	System.out.println(test);
	
	out.print("Enter a test string:: ");
	input = keyboard.next();
	test.setString(input);
	test.isEven();
	System.out.println(test);
	
	out.print("Enter a test string:: ");
	input = keyboard.next();
	test.setString(input);
	test.isEven();
	System.out.println(test);
	
	out.print("Enter a test string:: ");
	input = keyboard.next();
	test.setString(input);
	test.isEven();
	System.out.println(test);
	
	out.print("Enter a test string:: ");
	input = keyboard.next();
	test.setString(input);
	test.isEven();
	System.out.println(test);
	
	out.print("Enter a test string:: ");
	input = keyboard.next();
	test.setString(input);
	test.isEven();
	System.out.println(test);
	}
}