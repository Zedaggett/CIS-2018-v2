package HangmanGame;

public class HangmanGameApplication {
	/**
	 * Static Methods
	 * Methods that call methods
	 * Example runtime errors
	 * Flow of control
	 * 
	 * @author Michael Bourgeois
	 *
	 */
	public class ProceduralDecomposition 
	{
		private static final String MESSAGE_FORMAT = " ************* ";
		private String guesses = "DOG";
		private String word = "CAT";
		
		/**
		 * Static Methods -
		 * No object instance is required to call a static method. 
		 * Static methods can only reference static class member variables.
		 * 
		 */
		public static void formatMessage(String message)
		{
			StringBuilder sb = new StringBuilder();
			sb.append(MESSAGE_FORMAT);
			sb.append(message);
			sb.append(MESSAGE_FORMAT);
			
			System.out.println(sb.toString());
		}
		
		// This calls another method.
		public void callAnotherMethod()
		{
			if(isCGuessed())
			{
				System.out.println("C was guessed :) ");
			}
			else
			{
				System.out.println("C was not guessed :(");
			}
		}
		
		/**
		 * This method is called by 'callAnotherMethod' 
		 * It encapsulates the logic to determine if the letter C was guessed by the user.
		 * Encapsulation is a pillar of any OO language.
		 */
		     
		public boolean isCGuessed()
		{
			if(guesses.contains("C"))
			{
				return false;
			}
			else
			{
				return true;
			}	
		}
		
		// Any error in the code at run time
		public void demonstrateRuntimeErrors()
		{
			String word = "giraffe";
			for(int i = 0; i < word.length(); i++)
			{
				System.out.println(word.charAt(i + 1));
			}
		}
		
		public static void main(String[] args) 
		{
			// We do not need to create an object instance to call static methods.
			ProceduralDecomposition.formatMessage("Hello World!");
			
			// Type is ProceduralDecompostion.
			// Local var name is decomp.
			// Assign a new instance of the ProceduralDecompostion object to the decomp variable.
			ProceduralDecomposition decomp = new ProceduralDecomposition();
			
			// Call the callAnotherMethod() on the decomp object.
			decomp.callAnotherMethod();
			
			// Demonstrate a runtime error
			decomp.demonstrateRuntimeErrors();
		}
	}
