//© A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -



public class StarsRunner
{
	static StarsAndStripes reference = new StarsAndStripes(); 
   public static void main(String args[])
   {
    for( int i = 0; i < 3; i++) {
	   reference.printTwentyStars();
	   System.out.print("\n");
	   reference.printTwentyDashes();
	   System.out.print("\n");
    }
    reference.printTwoBlankLines();
    for( int i = 0; i < 3; i++) {
 	   reference.printTwentyStars();
 	   System.out.print("\n");
 	   reference.printTwentyDashes();
 	   System.out.print("\n");
     }
    reference.printTwentyDashes();
	   //instantiate a StarsAndStripes object
      
      //call the methods needed to make the patterns on the word document
      
   }
}