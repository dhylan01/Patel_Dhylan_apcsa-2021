//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   public Perfect() {
	   SetPerfect(0);
   }
	//add a set method
   public void SetPerfect(int a) {
	   number = a;
   }
	public String isPerfect()
	{	int tracker = 1;
		int sum = 0;
		while(tracker < number) {
			if ((number % tracker) == 0) {
				sum = sum + tracker;
			}
			tracker = tracker + 1;
		}
		if (sum == number) {
			return " is Perfect";
		}
		else {
			return " is not Perfect";
		}
	}

	//add a toString	
	public String toString() {
		return number + isPerfect();
	}
}