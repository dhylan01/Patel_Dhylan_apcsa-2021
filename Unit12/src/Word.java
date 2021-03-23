//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;
	public Word() {
		
	}
	public Word( String s )
	{
		word = s;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String s) {
		word = s;
	}
	public int compareTo( Word rhs )
	{		
	
		if (word.length() > rhs.getWord().length()) return 1;
		if (word.length() == (rhs.getWord().length()))return 0;
		else return -1;
	}

	public String toString()
	{
		return "";
	}
}