////////////////////////////////////////////////////////
// George Ebbs III
// lab03
// Big Mac Java Program
// September 12, 2014

// This program will compute the cost of buying some big macs

import java.util.Scanner;

// now we name the class
public class BigMac {
    // now establish the main method
    public static void main(String [] args) {
        
    //declare the scanner to access the imput
    Scanner myScanner;
    
    //now we are calling the Scanner Constructor 
    myScanner = new Scanner( System.in );
    
    //now we are going to prompt the user to put in the number of tickets
    System.out.print("Please enter the number of Big Macs (as an integer>0): ");
    
    //now accept user imput
    int nBigMacs = myScanner.nextInt (); 
    
    //Now we prompt user for cost of Big Mac and sales tax
    System.out.print("Please enter the cost per Big Mac as"+ " a double (in the form xx.xx): ");
    double bigMac$ =myScanner.nextDouble();
    System.out.print("Enter the percent tax as a whole number (xx): ");
    double taxRate = myScanner.nextDouble();
    taxRate/=100; //user enters percent, but i want proportion 
    
    //Now print out the output
    double cost$;
    int dollars, //whole dollar amount of cost
        dimes, pennies; //for storing digits to the right of the decimal point for the cost$
    cost$= nBigMacs*bigMac$*(1+taxRate); //get the whole amount, dropping the decimal fraction
    dollars=(int)cost$;
    //get dimes amount
    //ex: (int)(6.73*10) % 10 ---> 67 % 10 -->7
    //where the % (mod) operator returns the remainder 
    //after the division: 583%100 -->83, 27%5 --> 2
    dimes=(int)(cost$*10)%10;
    pennies=(int)(cost$*100)%10;
    System.out.println("The total cost of " +nBigMacs +" BigMacs, at $"+bigMac$ +" per bigMac, with a" + " sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies);
    // we just printed out the result of the imputs --> your total cost of the big macs
    
    
    
    }
}