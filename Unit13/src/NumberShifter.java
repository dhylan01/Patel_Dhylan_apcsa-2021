//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{	
	public static int[] makeLucky7Array( int size)
	{	int[] test = new int[size];
	int rando = 0;
		for(int i = 0; i < size; i++) {
			rando = (int) (Math.random()*10) + 1;
			test[i] = rando;
		}
		return test;
	}
	public static void shiftEm(int[] array)
	{	
		int counter = 0;
		while(array[counter] == 7) {
			counter++;
		}
		int temp = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[j]== 7) {
					temp = array[j];
					array[j] = array[counter];
					array[counter] = temp;
					counter = counter + 1;
				}
			}
	
	}
}