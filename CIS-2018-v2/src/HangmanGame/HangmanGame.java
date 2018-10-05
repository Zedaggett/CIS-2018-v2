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
	public static void main (String[] args){}
	public void createMask()
	{
		{
			System.out.print("---Welcome to Hangman---"); //Welcome message
		}
		{
			System.out.println("");
		}
		String word = "Maine"; //Picked a word for my hangman game
		char[] charArray=word.toCharArray();
		for (int i = 0; i < word.length(); i++) //Creating a mask for "Maine"
		{
			System.out.print ("*");
		}
		{
			System.out.println(" ");
		}
		
		Scanner sc = new Scanner(System.in); //Creating a new Scanner to accept user input
		{
			System.out.print("Guess a letter :");
		}
		String guess = sc.next(); //Assigning a value to the user's input
		
		{
			System.out.print(sc.nextLine());
		}
		sc.close();
		
	}
}

		


	