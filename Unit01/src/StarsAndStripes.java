//© A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -



	import static java.lang.System.*;
public class StarsAndStripes
{

	public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {	
	   for ( int d = 0; d < 20; d++) {
	   		System.out.print("*");
   }
   }
   
   

   public void printTwentyDashes()
   {	for (int i = 0; i < 20; i++) {
	   System.out.print("-");
   }
   }

   public void printTwoBlankLines()
   {	System.out.println("\n\n");
	   
   }
   
   public void printASmallBox()
   {	System.out.print("************");
	   for (int i = 0; i < 10; i++) {
		   System.out.println("*        *");
	   }
   System.out.print("************");
   }
 
   public void printABigBox()
   { 	   {	System.out.print("**********************");
	   for (int i = 0; i < 20; i++) {
		   System.out.println("*                 *");
	   }
   System.out.print("**********************");
   }
 
   }   
}
