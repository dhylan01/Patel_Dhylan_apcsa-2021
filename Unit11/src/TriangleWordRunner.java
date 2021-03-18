//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{	String choice = "Y";
		while(choice.equalsIgnoreCase("Y")) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = keyboard.next();
		System.out.print(word);
		TriangleWord.printTriangle(word);
		System.out.println("Do you want to enter more sample input?");
		choice = keyboard.next();
		}
	}
}