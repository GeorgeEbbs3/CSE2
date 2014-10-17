///////////////////////////
// George Ebbs
// October 3, 2014
// Enigma0.java Debug Lab06
/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner; //initialized the scanner
public class Enigma0 {
  public static void main(String arg []){
    Scanner myScanner;
    myScanner=new Scanner(System.in);
    System.out.print("Enter an int- ");
    int n=0;
    if(myScanner.hasNextInt()){
      n=myScanner.nextInt();
      System.out.println("You entered "+n);
      int k=4,p=6,q=7,r=8;
      int total=(k+p+q+r);
      System.out.println("The sum is: "+ total);
      System.out.println("Again, you entered "+n);
      
    }
    else{
      System.out.println("You did not enter an int");
      return; //end of program
    }

  }
}

/* Error report:
 *   Before you as the user if they can imput a number, you should declare the scanner.
 *   Move the scanner constructor before the input
 *   Then all you have to do is use the name of it instead of Scanner scan in line 17
 *   We need to initialize the variable n before we check to make sure the number was an int
 *   After the else, we just want to exit the program becuase the value wasnt an int
 *   Case 24 is not needed, therefore switch statement can be removed
 *   Now we want to put the whole sum (part 2) opperation in the if statement so the n value remains the same
     because the sum of the numbers will always be 25! 
 */