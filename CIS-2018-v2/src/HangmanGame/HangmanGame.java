package HangmanGame;

import java.util.Scanner;

public class HangmanGame {

	
	/*
	 * Rules that need to be followed:
	 * Game initiate
	 * Choose word
	 * Guess limit = 5
	 * Hint limit = 1
	 * 
	 */
	Scanner sc = new Scanner(System.in);
	public static void main (String[] args){
		{
			System.out.print("---Welcome to Hangman---"); //Welcome message
		}
		{
			System.out.println("");
		}

	String word = "Maine";
	String[] wordParts = word.split("");
	
	{
		
		String m = wordParts[0];
		for (int i = 0; i < m.length() ; i++);
		boolean guessM = false; // Figure out how to use boolean to trigger mask removal
		do{
			System.out.print("*");
		} while (guessM = false);
		
		boolean guessA = false;
		String a = wordParts[1];
		for (int i = 0; i < a.length(); i++);
		do {
			System.out.print("*");
		} while (guessA = false);
		
	String I = wordParts[2];
		for (int i = 0; i < I.length(); i++);
		{
			System.out.print("*");
		}
	String n = wordParts[3];
		for (int i = 0; i < n.length(); i++);
		{
			System.out.print("*");
		}
	String e = wordParts[4];
		for (int i = 0; i <e.length(); i++);
		{
			System.out.print("*");
		}
		{
			System.out.println(" ");
		}
		{
			System.out.print("Guess a letter : ");
		}
		
		
	Scanner sc = new Scanner(System.in);
		 guess = sc.nextLine(); // find correct variable here
		{
			System.out.print("The user has guessed : " + guess);
		}
		{
			System.out.println(" ");
		}
		
}
}
}

		


	