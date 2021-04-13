//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{	wordRay = sentence.split(" ");
	
	}

	public void sort()
	{	
		String holder = "";
		for (int i = 0; i < wordRay.length; i++) {
			for(int j = 0; j < wordRay.length; j++) {
				if (wordRay[i].equals(wordRay[j])) {
					holder = wordRay[i + 1];
					wordRay[i + 1] = wordRay[j];
					wordRay[j] = holder;
				}
				if (wordRay[i].compareTo(wordRay[j]) > 0) {
					holder = wordRay[j];
					wordRay[j] = wordRay[i];
					wordRay[i] = holder;
				}
			}
		}
	}

	public String toString()
	{	String output="";
		for (String seg: wordRay) {
			output += seg;
		}
		
		return output+"\n\n";
	}
}