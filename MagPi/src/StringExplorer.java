/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		int pos = sample.indexOf("slow");
		String counterWord = "over";
		int occurance = 0;
		if(pos != -1)
		   System.out.println("slow is found at position " + pos);
		else
		   System.out.println("slow is not found");

		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
		if (sample.indexOf(counterWord) > 0) {
			for (int i =0; i< sample.length(); i++) {
				if (counterWord.equalsIgnoreCase(sample.substring(i, (i + counterWord.length())))) {
					occurance += occurance;
				}
			}
		}

	}

}