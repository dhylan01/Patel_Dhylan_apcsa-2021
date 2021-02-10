//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public  String go( String a )
	{ 
	   String lastv = a.substring(a.length()-1, a.length());
	   if (lastv.equalsIgnoreCase("a") || lastv.equalsIgnoreCase("e")|| lastv.equalsIgnoreCase("i")|| lastv.equalsIgnoreCase("o")|| lastv.equalsIgnoreCase("u")) {
		return "yes";
	}
	else {
		return "no";
	}
	}
}