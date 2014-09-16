///////////////////////////////
// George Ebbs
// Homework 3 
// Program 1: Bicycle 
// September 16, 2014
/*type This program should:
a. Prompt the user to enter the counts and number of seconds during the counts on a cyclometer
b. Prints out distance traveled and average miles per hour 
*/ 

//first establish the scanner
import java.util.Scanner;

//Now we establish the class
public class Bicycle {
    //main method is required for this java program
    public static void main(String [] args) {
        
        //declare the scanner to access the imput
        Scanner myScanner;
        
        //now we call the scanner instructor 
        myScanner = new Scanner( System.in );
        
        //now we prompt the user for the number of seconds their trip was
        System.out.print("Please enter how many seconds your trip was (>0): ");
        //now accept the users imput
        double nSeconds = myScanner.nextDouble();
        
        //now we prompt the user for the number of counts they took 
        System.out.print("Please enter how many counts your trip was (>0): ");
        //accept user imput for counts now
        double nCounts = myScanner.nextDouble(); 
        
        //Now define the constants of the wheel
        double wheelDiameter=27.0, //States the double diameter 
        PI=3.14159, //gives value for PI
        feetPerMile=5280, //States how many feet per mile
        inchesPerFoot=12, //States how many inches are in a foot
        secondsPerMinute=60; //States how many seonds are in a minute 
        
        //Here we compute the output
        double totalDistance = nCounts*wheelDiameter*PI; //give us the distance in inches 
        totalDistance /= inchesPerFoot*feetPerMile; //gives us the converted distance in miles
        double totalMinutes = nSeconds/secondsPerMinute; //gives us the number of minutes we have 
        double averageMPH = totalDistance/(totalMinutes/secondsPerMinute); //gives us the average MPH for the trip
        
        //Print out the data 
        System.out.printf("The total distance of the trip was %.2f", totalDistance); 
        System.out.printf("\n The trip, in minutes, took %.2f", totalMinutes); 
        System.out.printf("\n The average Miles Per Hour of the trip was %.2f", averageMPH);
        
        
        
        
        
    } //end of method
} //end of class 
//lol