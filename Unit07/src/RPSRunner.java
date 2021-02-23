//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String response;
		Boolean cont = true;
		//add in a do while loop after you get the basics up and running
		while(cont == true){
			String player = "";
			String contin = "";
			out.print("type in your prompt [R,P,S] :: ");
			response = keyboard.next();   
			//read in the player value
		
			RockPaperScissors game = new RockPaperScissors();	
			game.setPlayers(response);
			System.out.println(game);
			
			out.print("continue?");
			contin = keyboard.next();
			if (contin == "no") {
				cont = false;
			}
		}
	}
}



