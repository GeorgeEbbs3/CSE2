//////////////////////
//  George Ebbs III
// October 10, 2014
// Loop the Loop Program
// For this lab session you write while loops and use a break statement.
// Do your assignment on Cloud9 in the folder lab07. Store the 
// resulting program in the file LoopTheLoop.java.
import java.util.Scanner;
// now we name the class
public class LoopTheLoop {
    // now establish the main method
    public static void main(String [] args) {
    //declare the scanner to access the imput
    Scanner myScanner;
    //now we are calling the Scanner Constructor 
    myScanner = new Scanner( System.in );
    
    //Promp them to enter a number the want for the number of stars
    System.out.println(" Please enter an int between 1 and 15: ");
    //make a counter
    int counter=0;
    //make the int nStars and store a scanner in it
    int nStars= myScanner.nextInt();
    //if it is in the range
    if(nStars>1 && nStars<15){
        while(counter<=nStars){
            counter=1;
            String Stars= "*";
            
            while(counter<=nStars){
                System.out.println( Stars);
                Stars="*" + Stars;
                counter++;
            }
        }
    }else{
        System.out.println("Your int was not in the range [1.15]");
        return; //ends the program
    }
        





/* now we are going to create an int variable
int starInput = 0, nStars = 10; 
    while(nStars<11){
       nStars=1;
       String Stars= "*";
     
        while(nStars<11){
         System.out.println( Stars);
         Stars="*" + Stars;
         nStars++;
*/
         
            
      
    
    
    
 }
}    