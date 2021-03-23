//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		String tempN;
		int tempI;
		//ask for name and size
		System.out.println("Please type a name");
		tempN = keyboard.next();
		System.out.println("Please type a size");
		tempI = keyboard.nextInt();
		//instantiate monster one
		Skeleton test1 = new Skeleton(tempN, tempI);
		//ask for name and size
		System.out.println("Please type a name");
		tempN = keyboard.next();
		System.out.println("Please type a size");
		tempI = keyboard.nextInt();
		//instantiate monster two
		Skeleton test2 = new Skeleton(tempN, tempI);
		
		System.out.println(test1);
		System.out.println(test2);
		test1.isBigger(test2);
		test1.namesTheSame(test2);
	}
}