import java.util.Scanner;

/* Assignment_11_Leap_Year_Modification.java is written with the purpose of understanding
 * not only how leap year works but to also
 * practise the knowledge of loops.
 * In this example the loop is : if - else if loop
 *
 * Algorithm for this code was found on the dedicated
 * leap year wiki page.
 *
 * Author: Ivan Belov
 * Student ID: T00637195
 * Course: COMP 1130 - 03
 */

public class Leap_Year_Checker
{

 public static void main (String[] args)
 {

  String welcomeMessage = " \n \t Leap Year Checker. ";
  
  @SuppressWarnings("unused")
  String makeNewLine = "\n \t";
  
  String instructions = " \n \t Enter a year or a sequence of years after 1582 to evaluate:"
  		+ "\n\t 0 to exit. ";
  
  int yearToCheck;

  @SuppressWarnings("resource")
  Scanner myLeapYearScanner = new Scanner (System.in); // Creating an instance of a scanner object

  System.out.print(welcomeMessage);

  do
  {
		System.out.print(makeNewLine + instructions); // printing instructions
		
		yearToCheck = myLeapYearScanner.nextInt(); // accepting one year or a sequence
  		  		
  		  		String answer = " \n \t " + yearToCheck + " is";
  		  		
  		  		while ( yearToCheck != 0 )
  		  		{
  		  	  		if ( yearToCheck < 1582 )
  		  	  		{
  		  	   			answer += " an invalid year.";
  		  	  		}
  		  	  		else if ( yearToCheck % 4 != 0 )
  		  	  		{
  		  	   			answer += " a common year. ";
  		  	  		}
  		  	  		else if ( yearToCheck % 100 != 0 )
  		  	  		{
  		  	   			answer += " a leap year. ";
  		  	  		}
  		  	  		else if ( yearToCheck % 400 != 0 )
  		  	  		{
  		  	   			answer += "n't a leap year. ";
  		  	  		}
  		  	  		else
  		  	  		{
  		  	   		answer += " a leap year. ";
  		  	  		}
  		  	    		System.out.print( answer ); // displaying the checker's message
  		  			break;
  		  		}
  }
  while (yearToCheck != 0);
  {
	  welcomeMessage = null;
	  makeNewLine = null;
	  instructions = null;
	  
	  myLeapYearScanner.close();
	  
	  yearToCheck = 0;
	  
	  System.out.print( "\n \t Finishing execution. " );
  }
 } // End of main
} // End of class