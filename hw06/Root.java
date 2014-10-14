//////////////////
// George Ebbs
// October 13, 2014
// Root Program
/*
This program is going to calculate the square root of an inputted double. 
The square root will be found by closing the high and low values to center in on the value
*/

//import the scanner
import java.util.Scanner;
//name the class 
public class Root {
    //establish the method
    public static void main(String [] args) {
    //name the Scanner
    Scanner myScanner;
    //now we are calling the Scanner Constructor
    myScanner = new Scanner( System.in );
    
    //promp the user to enter in a double
    System.out.println("Please enter a double greater than zero: ");
    //make the double and store a scanner in it
    double numberSquared = myScanner.nextDouble();
    //now we want to initialize the doubles
    double low=0; //this is the low value
    double high= 1+numberSquared; //set the top value
    double middle= ((low+high)/2); //this is the middle of high and low
    double distance= high-low; //this change from low to high
    double tolerance= 0.0000001; //the ideal distance between the high and low
    //now if they entered 0
    if(numberSquared==0){
        System.out.println("You did not enter an acceptable value ");
        return; //terminate the program
    }
    //now we are going to make a while loop to narrow the
    //ranges of the number to find its square root
    while(distance>tolerance){ //this wil run the loop till the distances are very small
        if(middle*middle>numberSquared){ //sets the conditions for whether the range's high or low will change 
            high=middle;
            distance=high-low;
            middle= ((low+high)/2); //now we change the middle so it recalculates when the loop, loops
         }else{
            low=middle;//the other statement in case the middle of you inputted value is small
            distance=high-low;
            middle= ((low+high)/2);
        }
    }
    double resultSquare= high; //since the difference between high and low is so small this could equal high or low
    System.out.println(resultSquare); //this prints the result of your number 
    
    
} //end of method
} //end of class
//lolololol