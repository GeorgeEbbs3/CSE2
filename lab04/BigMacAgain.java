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
    int nBigMacs=0;
   
    
    
    
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
    
    double cost$= nBigMacs*(2.22);
    double totalBill=cost$+(2.15);
    
    
    //now we calculate the price of the Big Macs
    if(nBigMacs>0)  {
    System.out.println("The price of your BigMac purchase is: "+ cost$ );
    }
    //lets make a if statement for fries
    System.out.println("Would you like to add fries to your meal? Y (or y) / N (or n)");
    String fries = myScanner.next().toUpperCase(); //so we use a string scanner in order to account of letters instead of numbers
    
    if (fries.equals("Y")){
        System.out.println("Your order for fries will add $2.15 to the bill");
        System.out.printf("Your new total for the bill will be: %.2f ",totalBill);
     }else if(fries.equals("N")){
         System.out.println("Your order will remain at the price of: "+ cost$);
     }else{
         System.err.println("You have not entered a valid answer");
         return; //terminates the program
     }
     
    
    }
}