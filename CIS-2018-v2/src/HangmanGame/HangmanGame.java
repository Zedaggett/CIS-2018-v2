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
		String word = "Maine";
		char[] charArray=word.toCharArray();
		for (int i = 0; i < word.length(); i++)
		{
			System.out.print ("*");
		}
		{
			System.out.println(" ");
		}
		
		Scanner sc = new Scanner(System.in);
		{
			System.out.print("Guess a letter :");
		}
		String guess = sc.next();
		
		{
			System.out.print(sc.nextLine());
		}
		sc.close();
		
	}
}

		


	