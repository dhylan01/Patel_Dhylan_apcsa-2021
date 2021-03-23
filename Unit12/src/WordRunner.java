//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));
		
		int size = file.nextInt();
		ArrayList<String> output = new ArrayList<String>();
		
		output.add(file.nextLine());
		Word next = new Word();
		
		while(file.hasNextLine()) {
		next.setWord(file.nextLine());
		
			for (int j = 1; j < size; j++) {
				if(next.compareTo(new Word(output.get(j))) == 1) {
					output.add(j, next.getWord());
				}
			}
		}
		System.out.println(output);











	}
}