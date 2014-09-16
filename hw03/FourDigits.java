///////////////////////////////
// George Ebbs
// Homework 3 
// Program 3: FourDigits 
// September 16, 2014
// This Program should prompts the user to enter a double
//and  then prints out the first four digits to the
//right of the decimal point.

//first establish the scanner
import java.util.Scanner;

//Now we establish the class
public class FourDigits {
    //main method is required for this java program
    public static void main(String [] args) {
        
        //declare the scanner to access the imput
        Scanner myScanner;
        
        //now we call the scanner instructor 
        myScanner = new Scanner( System.in );
        
        //prompt the user to enter the double
        System.out.print("Please enter a four digit double here: ");
        // now accept the users imput (define the variable)
        double decimalPoint = myScanner.nextDouble();  
        
        //compute the output
        int intDecimalPoint = (int) decimalPoint;
        int iDP = intDecimalPoint*10000;
        double dDP = decimalPoint*10000;
        int finale = (int)dDP;
        int Bang = finale-iDP;
        
        //Print Output
        System.out.format("These are your first four digits after the decimal point: %04d%n",Bang);
        
    }
    
}
        