// George Ebbs
// Homework 4 
// Program 3: CourseNumber 
// September 23, 2014
//a program that has the user enter an positive integer 
//giving the number of seconds that have passed during 
//the day and then displays the time in conventional form.

//first establish the scanner
import java.util.Scanner;

//Now we establish the class
public class TimePadding {
    //main method is required for this java program
    public static void main(String [] args) {
        
        //declare the scanner to access the imput
        Scanner myScanner;
        
        //now we call the scanner instructor 
        myScanner = new Scanner( System.in );
        
        //we prompt the user to enter the number of seconds
        System.out.println("Please enter the time in seconds ");
        
        //make sure the value is an int
        if(myScanner.hasNextInt()) {
            //make a variable
            int Time=myScanner.nextInt();
            
        //need to make sure value isnt negative
        if(Time<=0) {
            System.out.println("You entered a negative int, you need positive! ");
            return;  
        }
        //define some variables
        int hours=(int)(Time/3600);
        int minutes=(int)((Time- (hours*3600)) /60);
        int seconds=(int)((Time-(hours*3600))-(minutes*60));
        
        //now we need to format the strings so the variable min and sec can 
        // include leading zeros and stay limited to 2 digits
        String formattedminutes=String.format("%2d", minutes);
        String formattedseconds=String.format("%2d", seconds);
        
        System.out.println("The time is "+hours+":"+formattedminutes+":"+formattedseconds+".");
        
        }else{
            System.out.println("You did not enter and integer");
            return;
        }
        
    }//end of method
}//end of class