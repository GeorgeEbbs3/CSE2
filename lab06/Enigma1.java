///////////////////////////
// George Ebbs
// October 3, 2014
// Enigma1.java Debug Lab06
/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */
import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
      Scanner myScanner; //name the scanner
      myScanner = new Scanner( System.in ); //call scanner constructor
    System.out.print("Enter a value between 0 and 99: ");
    //define the entered variable and initialize it
    double x=0;
    if(myScanner.hasNextDouble()) { //check to see if double was entered
        //now make generate the x again
    x =myScanner.nextDouble();
    }
    else{
        System.out.println("You did not enter a double");
        return;
    }
    //make the double and store a scanner in it
   System.out.println("You entered "+x+"%");
   double percent= x/100;
   double proportion= 1-percent;
   
   if(x>=0 && x<=99){
    System.out.println("The proportion remaining is: "+ proportion);
   }else{
       System.out.println("You did not enter a vaild input");
       return;
   }
  
}
}

/* Error report: 
First you need to name the Scanner then call the scanner constructor. Following 
that, you need to make the variable for the users entry and initialize it as
zero. Then make sure that the value entered was a double, otherwise quit the 
program. Then, make variables for turning that input into a proportion.
Furthermore, in order to account for all numbers between 0 and 99, make an if
statement that only works if the inputted value (x) is between 0 and 99. If it 
is, great! The program will calculate your number into how far of a proportion 
it is away from 1! The only acceptable values are between 0 and 99 because any
thing outside would be negative or above 100% of 1. 
 */
