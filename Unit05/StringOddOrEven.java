//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;
	private String output;

	public StringOddOrEven()
	{
	}

	public StringOddOrEven(String input)
	{ word = input;
	}

	public void setString(String s)
	{ word = s;
	}

 	public void isEven()
 	{
		if (word.length()%2 == 0) {
			output = "even" ;
		}
		else {
			output = "odd";
		}
		
	}

 	public String toString()
 	{
 		return output;
	}
}