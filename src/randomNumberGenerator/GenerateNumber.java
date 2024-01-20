package randomNumberGenerator;

import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
public class GenerateNumber {

	public static void main(String[] args) {
		boolean correctGuess = false;
		try {

		    Scanner scanner = new Scanner(System.in);

		     Random random = new Random();
		     int randomNum = random.nextInt(1)+1;

			System.out.println("Enter a random number. You can only guess 5 times");
		     
		     for(int i = 1;i <= 5; i++) {
		    	 int userInput = scanner.nextInt();
					
				     
				  if(userInput == randomNum) {	
		    		   System.out.println("You got it!");
		    		   correctGuess = true;
		    		   break;
		    	     }
		    	   else if (userInput < randomNum) {
		    	    	 System.out.println("Guessed number too low!");
		    	     }
		    	   else {
		    		   System.out.println("Guessed number too high!");
		    	   }
		    	  
		    	 }
		 	    
		 	    if(!correctGuess) {
				System.out.println("You have exceeded your guesses!");
	}
			
		} catch(java.util.InputMismatchException e)  {
			
			System.out.println("You entered an invalid number");
				
			
		} 
  
	}
}
