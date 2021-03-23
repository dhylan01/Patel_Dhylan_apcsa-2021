//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables	
	private String name;
	private int size;
	
	//add a constructor
	public Skeleton(String name1, int num1) {
		setNums(name1,num1);
	}
	//add code to implement the Monster interface
	public void setNums(String name1, int num1) {
		name = name1;
		size = num1;
	}
	public int getHowBig() {
		return size;
	}
	public String getName() {
		return name;
	}
	public boolean isBigger(Monster other) {
		if (size > other.getHowBig()) {
			return true;
		}
		else return false;
	}
	public boolean isSmaller(Monster other) {
		if(size < other.getHowBig()) {
			return true;
		}
		return false;
	}
	public boolean namesTheSame(Monster other) {
		if(name.equals(other.getName())) {
			return true;
		}
		return false;
	}
	//add a toString
	public String toString(){
		return "Name is " + name + "Size is " + size;
	}
}