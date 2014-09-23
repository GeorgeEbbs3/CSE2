// George Ebbs
// Homework 4 
// Program 2: Month 
// September 23, 2014
// prompts the user to enter an integer for the month (1 for January, 2 for February, etc.)
//and then displays the number of days in the month). If the number 2 is entered (February) 
//the user is then asked to enter the year.

//first establish the scanner
import java.util.Scanner;

//Now we establish the class
public class Month {
    //main method is required for this java program
    public static void main(String [] args) {
        
        //declare the scanner to access the imput
        Scanner myScanner;
        
        //now we call the scanner instructor 
        myScanner = new Scanner( System.in );
        
        //now we ask the user to enter a number for the month in an int form 
        System.out.print("Please enter an int (1-12), representing a month. ");
        
        //now we need to make sure the input is an int
        if(myScanner.hasNextInt()) {
            int monthNumber=myScanner.nextInt();
            
        //now the int cannot be zero 
        if(monthNumber<=0) {
            System.out.println("You didn't enter a positive integer! ");
            return;
        }
        //now for the months that have 31 days!
        if(monthNumber==1 || monthNumber==3 || monthNumber==5 || monthNumber==7 || monthNumber==8 || monthNumber==10 || monthNumber==12) {
            System.out.println("This month contains 31 days ");
        }
        
        //now for the months that have 30 days!
        if(monthNumber==4 || monthNumber==6 || monthNumber==9 || monthNumber==11) {
            System.out.println("This month has 30 days "); 
        }
        
        //now for February which is complicated becuase of the leap year factor 
        //so if they enter February, we need to ask for what yeat
        if(monthNumber==2) {
            System.out.print("Enter the year as an integer");
            double yearNumber=(myScanner.nextInt());
            double leapYear= yearNumber/4;
            leapYear= leapYear-(int)leapYear;
            
        //now we see if February has 28 or 29 days
        if(leapYear==0) {
            System.out.println("This month has 29 days ");
            
        }else{
            System.out.println("This month has 28 days");
        }}
        //this shuts off program if int isnt an int
        }else{
            System.out.println("You didnt enter a valid int ");
        }
        

    }//end of method 
            
}//end of class 
        
