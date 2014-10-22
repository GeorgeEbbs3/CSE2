////////////////
// George Ebbs
// October 20, 2014
// NumberStack.java Program
// This program will display a stack of numbers depending on what number the 
// user chooses and practices while, for, and do while loops. 
import java.util.Scanner; //import the scanner
//name the class
public class NumberStack { 
    //create the method
    public static void main(String [] args) {
    //declare and name the scanner
    Scanner myScanner;
    // call the scanner
    myScanner = new Scanner( System.in );
    // prompt the user for an input
    System.out.print("Enter a number between 1 and 9: ");
    int userEntry=0;
    //now we need to make sure the input is an int
        if(myScanner.hasNextInt()) {
            userEntry=myScanner.nextInt();
        }else{
            System.out.println("You did not enter an int");
            return; //ends the program
        }
    if(userEntry>=1 && userEntry<=9){   //we put it in an if statement to ensure that the number is between 1 and 9 inclusively  
    System.out.println("Using For Loops: "); //display what type of loop that was used 
    int x=0, y=0, z=0, a=0; //initialize variables x=#ofrows,y=#ofcolumns,z=#ofrowsrows,a=#ofcolumnscolumns
    String hyphen= "-";//to make the dashes
    String gap=" "+" "+" "+" "+" "+" "+" "+" "; //to make the spaces
    for(x=1; x<=userEntry; x++){ //how many rows (incrementing numbers) do we want in this output
        System.out.print(gap); //need to space
        for(y=1; y<x; y++){ //number of columns per row increasing everytime
            System.out.print(x+""+x); //prints out the number of columns realitive to the row number value ex: 3rd row = 3 columns
        }
    System.out.println(x);
        for(z=1;z<x; z++){ //this will make there be more rows per every increment of the number, but have it dependant of what row. similar to y's relationship
        System.out.print(gap);
        for(a=1; a<x; a++){//this will make the columns for each incrementing row
            System.out.print(x+""+x);
        }
        System.out.println(x);
    }
    System.out.println(gap+(hyphen)); 
    gap=gap.replaceFirst(" ", ""); //reduces the number of spaces ever time loop turns around 
    hyphen=hyphen.replaceFirst("-","---"); // increases the dashes 
    }
    System.out.println("Using While Loops: "); //this time we are to use w different style of loops
    x=1; //we need to set the variables back to what they were so the loop can run again!
    y=1;
    z=1;
    a=1;
    hyphen= "-";
    gap=" "+" "+" "+" "+" "+" "+" "+" ";
    while(x<=userEntry){ //run until the number of rows are what i entered above ^^^
        System.out.print(gap);
        z=1; //reinitializes every time loop goes around to ensure it runs
        y=1;
        while(y<x){ //all of the loops are doing the same as above, just in a different format! 
            System.out.print(x+""+x);
            y++; //this will increase the y one everytime the loop goes around 
        }
    System.out.println(x);
            while(z<x){ //does the same thing for the rows as above, increases them depending on what section number you are aka 3 = 3rows of 3
           System.out.print(gap);
           a=1;
           while(a<x){
               System.out.print(x+""+x);
               a++;
           }
           System.out.println(x);
           z++;
           }
    System.out.println(gap+(hyphen));
    gap=gap.replaceFirst(" ", "");
    hyphen=hyphen.replaceFirst("-","---");
    x++;
    }
    System.out.println("Using do-while Loops: "); //the final type of loop we will use!
    x=1; //reinitialize again!
    y=1;
    z=1;
    a=1;
    hyphen= "-";
    gap=" "+" "+" "+" "+" "+" "+" "+" ";
    do{ //its basically the same thing as above, just flipped upsidown
        System.out.print(gap);
        y=1;
        do{
            System.out.print(x+""+x);
            y++;
        }while(y<x);
    System.out.println(x);
        z=1;
        do{
        System.out.print(gap);
        a=1;
           do{ //do these opperations!
               System.out.print(x+""+x);
               a++;
              }while(a<x); //under these circumstances
        System.out.println(x);
        z++;
        }while(z<x);
    System.out.println(gap+(hyphen));
    gap=gap.replaceFirst(" ", "");
    hyphen=hyphen.replaceFirst("-","---");
    x++;
    }while(x<=userEntry);
    }else{ //end of if statement! and if the number is not within the range
        System.out.println("You did not enter a valid input");
        return; //quit the program!!
    }
} //end of method
} //end of class
//empire state of mind 
    
    
