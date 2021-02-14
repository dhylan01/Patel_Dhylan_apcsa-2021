//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
	}

	//add in second constructor
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{	String cleaned = sentence;	
		int indexer = 0;
		int loc = 0;
		while ( cleaned.indexOf(lookFor) > -1) {
			if (cleaned.charAt(indexer) == (lookFor)) {
				loc = indexer;
				cleaned = cleaned.substring(0, loc) + cleaned.substring(loc + 1, cleaned.length());
			}
			indexer = indexer + 1;
		}

		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n new String " + removeLetters();
	}
}