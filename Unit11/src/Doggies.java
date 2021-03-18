//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new array of Dog
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		pups[spot] = new Dog(age, name);
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
	}

	public String getNameOfOldest()
	{
		int age = 0;
		int counter = 0;
		for (int i = 0; i < pups.length; i++) {
			if (pups[i].getAge() > age) {
				age = pups[i].getAge();
				counter = i;
			}
		}
		return pups[counter].getName();
	}

	public String getNameOfYoungest()
	{
		int age = 100;
		int counter = 0;
		for (int i = 0; i < pups.length; i++) {
			if (pups[i].getAge() < age) {
				age = pups[i].getAge();
				counter = i;
			}
		}
		return pups[counter].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}