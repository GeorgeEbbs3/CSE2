///////////////////////////////
// George Ebbs
// Homework 3 
// Program 2: Root 
// September 16, 2014
/*type This program should:
a. Prompt the user to enter a double and take the cubed root of the double
b. Prints out the cube of the double (a crude guess)
*/ 

//first establish the scanner
import java.util.Scanner;

//Now we establish the class
public class Root {
    //main method is required for this java program
    public static void main(String [] args) {
        
        //declare the scanner to access the imput
        Scanner myScanner;
        
        //now we call the scanner instructor 
        myScanner = new Scanner( System.in );
        
        //prompt user to enter the double
        System.out.print("Please enter a double here: ");
        //now accept the users imput
        double poundCake = myScanner.nextDouble(); 
        //now make our first guess
        double guess= poundCake/3;
        //now make the second guess
        double guess2= (2*guess*guess*guess+poundCake)/(3*guess*guess);
        //now make the third guess
        double guess3= (2*guess2*guess2*guess2+poundCake)/(3*guess2*guess2);
        // now we make our fourth guess
        double guess4= (2*guess3*guess3*guess3+poundCake)/(3*guess3*guess3);
        // now we make our fifth guess 
        double guess5= (2*guess4*guess4*guess4+poundCake)/(3*guess4*guess4);
        //now we make our sixth guess
        double guess6= (2*guess5*guess5*guess5+poundCake)/(3*guess5*guess5);
        
        
        //Now we are going to print out the cubed root!
        System.out.println("The Cubed Root is: "+ guess6);
        
        
       
        
        
    } //end method
    
}//end class
//lol