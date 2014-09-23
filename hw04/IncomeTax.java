///////////////////////////////
// George Ebbs
// Homework 4 
// Program 1: IncomeTax 
// September 23, 2014
// This Program prompts the user to enter an int that gives the thousands 
//of dollars of income and then writes out the amount of tax on the income, 
//given the following (progressive) schedule:  <20, 5%;  >=20 and < 40, 7%;
//>=40 and < 78, 12%; >=78, 14%.

//first establish the scanner
import java.util.Scanner;

//Now we establish the class
public class IncomeTax {
    //main method is required for this java program
    public static void main(String [] args) {
        
        //declare the scanner to access the imput
        Scanner myScanner;
        
        //now we call the scanner instructor 
        myScanner = new Scanner( System.in );
        
        //now we want to ask the user for the income in the form of an int
        System.out.print("Please enter an int>0 giving the number of thousands: ");
        
        //now we check to see if int is valid
        if(myScanner.hasNextInt()) {
            //now we need to make variables for this if statement
            int incomeAmount=myScanner.nextInt();
            
        //neccessary if statement
        if(incomeAmount<=0) {
            System.out.println("That is not a positive integer. ");
            return; //terminates program 
        }
        //now we need to decide which tax rate the int is under using if statements
        //5%
        if(incomeAmount<20) {
            //make variables
            double tax5=5; 
            double finalTax5=(incomeAmount*1000)*tax5/100;
            //now present the product
            System.out.println("The tax rate for your income amount of: "+incomeAmount+",000 is "+tax5+"% and the total amount of tax is: "+ finalTax5+ " dollars ");
        }
        //7%
        if(incomeAmount>=20 && incomeAmount<40) {
            //make variables
            double tax7=7;
            double finalTax7=(incomeAmount*1000)*tax7/100;
            finalTax7=((int)finalTax7*100)/100.0;
            System.out.println("The tax rate for your income amount of: "+incomeAmount+",000 is "+tax7+"% and the total amount of tax is: "+ finalTax7+ " dollars ");
        }
        //12%
        if(incomeAmount>=40 && incomeAmount<78) {
            //make variables
            double tax12=12;
            double finalTax12= (incomeAmount*1000)*tax12/100;
            finalTax12 =((int)finalTax12*100)/100.0;
            System.out.println("The tax rate for your income amount of: "+incomeAmount+",000 is "+tax12+"% and the total amount of tax is: "+ finalTax12+ " dollars ");
        }
        //14%
        if(incomeAmount>=78) {
            //make variables
            double tax14=14;
            double finalTax14= (incomeAmount*1000)*tax14/100;
            finalTax14 =((int)finalTax14*100)/100.0;
            System.out.println("The tax rate for your income amount of: "+incomeAmount+",000 is "+tax14+"% and the total amount of tax is: "+ finalTax14+ " dollars ");
        }
        //else incase some int wasnt entered correctly
        }else{
            System.out.println("You didnt enter a positive int, give it another shot ");
            return; 
        }
        
        
    }//end of method
    
}//end of class 