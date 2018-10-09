package HangmanGame;

import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Input;
public class HangmanGame {

	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Logic is as follows:
		 * create initial boolean to start looping
		 * Create objects/variables
		 * createed loop '*' using arrays to store char data
		 * initialize the amount of tries user gets
		 * create while loop for !wordIsGuessed (NOT guessed) - this is the main part of the game itself, running
		 * get user's data to initialize a 'If/Else' scenario (to quit or keep playing) that leads into a for loop
		 * This for loops is where the game is being played
		 * Take user's data and apply conditions to meet certain outcomes
		 * 
		 */
		boolean areWePlaying = true;
		while (areWePlaying) {
				System.out.println("Welcome to Hangman!");//Welcome user
		String hint = " Your hint is: 'Vacationland '";
		String word = "maine"; //Created object 'word'
		char[] maine = word.toCharArray();//Created character array for 'Maine'
		int amountOfGuesses = maine.length;//Stating how many guesses to solve
		char[] playerGuesses = new char[amountOfGuesses];//New character array to store guesses
		
		for (int i = 0; i < playerGuesses.length; i++){
				playerGuesses[i] = '*';
		}								//Created loop for '*'
		boolean wordIsGuessed = false;
		int tries = 0;//Initialized how many tries the user has had
/////////////////////////////////		
		while (!wordIsGuessed && tries != amountOfGuesses){ //Starting a loop for when the game begins
				System.out.println("Current guesses: ");
				System.out.println(playerGuesses);
				System.out.printf("You have %d tries left. Enter '?' for hint or '-'to exit", amountOfGuesses - tries); // using 'printf' because the line involves a function (%d) (amountOfGuesses - treis)
				System.out.println(" ");
				System.out.println("Please enter a letter");
			char input = sc.nextLine().charAt(0);//Taking user's input at first character
			tries++; // After receiving input, the 'tries' counter will go up
			if (input == '-')  // Taking user's input and then creating loops that follow certain conditions
				{
				areWePlaying = false; //Creating an end to the game == Condition is met
				wordIsGuessed = true; // Creating an end to the game == Condition is met
				}
			if (input == '?')
			{
				System.out.println(hint);
			}
			else
			{
				for (int i = 0; i < maine.length; i++)  //Starting main for loop for guess process
				{
					if (maine[i] == input) //When maine array is equal to user's input
					{
						playerGuesses[i] = input; //The user's input is equivalent to playerGuess array at int i
					}
					if (isTheWordGuessed(playerGuesses)) //Checking to see if playerGuesses has any more '*' left in the array referenced at bottom of the code in a static boolean
					{
						wordIsGuessed = true;
						System.out.println("YOU WIN!"); // Condition is met for winning
					}
			    }
			}					
		}
		if (!wordIsGuessed) // I've taken this out of the conditional loop because we are trying to solve for true, the boolean already == false
		{					// Condition here is if user cannot guess word/ask for hint
			System.out.println("GAME OVER");
			System.out.println("You have ran out of guesses :/");
			System.out.println("Would you like to play again? y/n");
			String anotherGame = sc.nextLine(); //Creating a door for the user to begin a new game
			if (anotherGame.equals("n")) areWePlaying = false; // Creating a condition for the user to exit the game
		}
	}
}
		
////////////////////////////////////			
			public static boolean isTheWordGuessed(char[] array) //Creating a method for isTheWordGuessed 
			{
				for (int i = 0; i < array.length; i++)//Creating a loop to check the array for any '*' characters
				{
					if (array[i] == '*') return false;//If there are any more '*' within the array, isTheWordGuessed returns false
				}
			
			return true; //Creating an implied condition that there are no longer '*' within the array
			}
}