//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{setLetter('a');
	setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{ setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{ letter = c;
	}

	public void setAmount(int amt)
	{ amount = amt;
	}

	public String toString()
	{
		for (int i = amount; i > 0; i--) {
			for ( int count = amount; count > 0; count--) {
				int calc = (int) letter + (amount-count);
				if (calc == 91) {
					calc = 65;
				}
				char print = (char) calc;
				for (int b = calc- ((int) letter); b < amount; b++) {
					System.out.print(print);
				}
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		String output="";
		return output;
	}
}
/*
for (int a = 0; a < amount; a ++) {
				System.out.print(letter);
			}
			for (int b = 1; b < amount; b ++) {
				System.out.print(letter);
			}
			for (int c = 2; c < amount; c ++) {
				System.out.print(letter);
			}


*/