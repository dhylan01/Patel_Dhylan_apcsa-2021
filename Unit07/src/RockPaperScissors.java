//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{ setPlayers("");
	}

	public RockPaperScissors(String player)
	{ setPlayers(player);
	}

	public void setPlayers(String player)
	{double num = (Math.random() * 3);
	int rando = (int) num;
	if (rando == 0) {
		compChoice = "R";
	}
	if (rando == 1) {
		compChoice = "P";
	}
	if (rando == 2) {
		compChoice = "S";
	}
	playChoice = player;
	}

	public String determineWinner()
	{
	/*	String winner="";
		if ( (compChoice == playChoice)) {
			winner = "Tied";
		}
		else if ((compChoice == "R" && playChoice == "S") || (compChoice =="P" && playChoice =="R") || (compChoice =="S" && playChoice == "P")){
			winner = "Computer";
		}
		else if ((playChoice == "R" && compChoice == "S") || (playChoice =="P" && compChoice =="R") || (playChoice =="S" && compChoice == "P")){
			winner = "Player";
		}
		
		return winner; */
	    if (playChoice.equals(compChoice)) {
	        System.out.println("It's a tie!"); }
	     else if (playChoice.equals("R")) {
	        if (compChoice.equals("S")) 
	           System.out.println("Player wins <<Rock crushes scissors. You win>>!");}
	     else if (compChoice.equals("P")) {
	             System.out.println("Computer wins <<Paper eats rock. You lose>>!"); }
	     else if (playChoice.equals("P")) { 
	        if (compChoice.equals("S")) 
	        System.out.println("!omputer wins <<Scissor cuts paper. You lose>>!"); }
	     else if (compChoice.equals("R")) {
	             System.out.println("Player wins <<Paper eats rock. You win>>!"); }
	     else if (playChoice.equals("S")) {
	          if (compChoice.equals("P")) 
	          System.out.println("Player wins <<Scissor cuts paper. You win>>!"); }
	     else if (compChoice.equals("R")) {
	             System.out.println("Computer wins <<Rock breaks scissors. You lose>>!"); }
	     else {
	          System.out.println("Invalid user input."); }
	return "";
	}

	public String toString()
	{
	return "player had " + playChoice + " computer had " + compChoice + determineWinner();

	}
}