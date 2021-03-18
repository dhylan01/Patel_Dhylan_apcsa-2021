//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		ToyStore test = new ToyStore();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the toys :: ");
		String toys = keyboard.nextLine();
		test.loadToys(toys);
		System.out.println(test);
		System.out.println(test.getMostFrequentToy());
		System.out.println(test.getThatToy("train"));
	}
}