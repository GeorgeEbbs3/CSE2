////////////////////////////////////////////////////////
// George Ebbs III
// lab04
// Big Mac Again Java Program
// September 19, 2014

// This program will compute the cost of buying some big macs
// along with the cost of fries (whether the customer wants them or not)


import java.util.Scanner;

// now we name the class
public class BigMacAgain {
    // now establish the main method
    public static void main(String [] args) {
        
    //declare the scanner to access the imput
    Scanner myScanner;
    
    //now we are calling the Scanner Constructor 
    myScanner = new Scanner( System.in );
    
    //now we prompt the user for the number of Big Macs they want
    System.out.print("Please enter the number of Big Macs you want (as an integer >0): ");
    
    //define BigMacs
    int nBigMacs;
    
    //Now we want to make sure an int was entered
    if(myScanner.hasNextInt()) {
         //now we need to make the BigMac variable 
    nBigMacs = myScanner.nextInt();
    }
    else{
        System.out.println("You did not enter an int");
        return; //leaves the program
                //program terminates
    }
    //now we want to make sure the int was a positive value!
    if(nBigMacs>0) {
    
    }
    else{
        System.out.println("You entered a negative int");
        return; //leaves the program
                //program terminates
    }
    
    //now we calculate the price of the Big Macs
    if(nBigMacs>0)  {
        double cost$;
    cost$= nBigMacs*(2.22);
    System.out.println("The price of your BigMac purchase is: "+ cost$ );
    }
    //lets make a if statement for fries
    if(myScanner.next()) {
    
    char Y= myScanner.next().charAt(0); //make outside if statement!
    
    }
}