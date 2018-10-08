package HangmanGame;

import java.util.Scanner;
public class HangmanGame {

	
	public static void main (String[] args) {
HangmanGame.hangGame = new HangmanGame();
hangGame.isLetterGuessed();
	
		/*Variables
		 * String word = "Maine"
		 * String input = sc.nextLine()
		 * int i = 0
		 * boolean areWeDone = false
		 */
		String hint = "Your hint is: 'Vacationland'";
		String word = "Maine";
		int i = 0;
		boolean areWeDone = false;
		Scanner sc = new Scanner(System.in);
		/*
		 * Logic is as follows:
		 * Welcome user - done
		 * create mask for word to print to console
		 * prompt user to guess letter
		 * if user input reflects a character in the string peel away mask
		 * until game is over
		 */
		for (i = 4; i < word.length(); i++)
			i = 4; //Creating test condition that will become false when user guesses correctly
		{
			System.out.print("*");
		
		}
		//Here is where 'if' statement goes for when test condition becomes false
		//mask will hopefully get peeled away
		
}
}
		
		
	
		
			
		
			
		


	