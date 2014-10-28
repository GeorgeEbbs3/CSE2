/////////////////
//George Ebbs
// October 27, 2014
// This program has the objective of giving 
//you practice in writing methods, overloading methods,
//and in forcing the user to enter good input.
import java.util.Scanner;
public class HW8{
  public static char getInput(Scanner scan1, String run){ //begin the method for the C or c input
      char firstInput = scan1.next().charAt(0); //converts the first input into a char
         if(firstInput=='c' || firstInput=='C'){ //need to make sure that the input is c or C
          return firstInput; //if so, lets just return that
        }else{ //otherwise, lets repeat
          while(firstInput!='c' || firstInput!='C'){
          System.out.println("Try Again: "); //try again to input your answer
          firstInput=scan1.next().charAt(0); //keep asking the user
            return firstInput; //return their answer once they get it right
          }
        }
  return 0; //return nothing if nothing good comes
  }//end of first method
  
    public static char getInput(Scanner scan2, String compareTo, int maxTries){ //we want to limit the number of opportunities
    char secondInput=scan2.next().charAt(0); //make it a char again
    int counter;//for the for loop
    char retEmpty = ' ';
    for(counter=1; counter<maxTries; counter++){ //make the for loop for 5 tries
      if(secondInput=='n' || secondInput=='N' || secondInput=='y' || secondInput=='Y'){ //tests all of these values
      return secondInput; //yay it is one, move on!!
      }else{
        //while(secondInput!='n' || secondInput!='N' || secondInput!='y' || secondInput!='Y')
        System.out.print("You did not enter a character from the list 'yYnN'; try again- "); //same as before, try until you get it
        secondInput=scan2.next().charAt(0); //keep asking the user
      }
    }
  System.out.println("You failed");  //give up at that point, whats the use if they couldnt get it after 5 times
  return retEmpty;//if they have nothing dont bother returning anything
  }//end of second method
  
  public static char getInput(Scanner scan3, String Prompt, String numberOptions){ //you want one of the numbers to be chosen this time
    System.out.println(Prompt);// prompt the question 
    System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9': ");
    char thirdInput=scan3.next().charAt(0); // make it a char
      if(thirdInput=='1' || thirdInput=='2' || thirdInput=='3' || thirdInput=='4' || thirdInput=='5' || thirdInput=='6' || thirdInput=='7' || thirdInput=='8' || thirdInput=='9' || thirdInput=='0'){
        return thirdInput; //yay you did it!
      }else{
        while(thirdInput!='1' || thirdInput!='2' || thirdInput!='3' || thirdInput!='4' || thirdInput!='5' || thirdInput!='6' || thirdInput!='7' || thirdInput!='8' || thirdInput!='9' || thirdInput=='0'){
        System.out.println("You did not enter an acceptable character"); //have them keep trying by putting in the scanner
        thirdInput=scan3.next().charAt(0);
        return thirdInput; //return it once they get it 
        }      
      }
  return 0; 
  }//end of third method
  
  public static void main(String []arg){ //new public class
	char input;
	Scanner scan=new Scanner(System.in); //new scanner, initialize it
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- "); //whats going to be asked 
	input=getInput(scan,"Cc");//These are the values that we want to accept in order to continue
	System.out.println("You entered '"+input+"'"); //the output
	
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- "); //the second question that asks for the user to input
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	if(input!=' '){//if they finally got it right, then print out what they got right
   	System.out.println("You entered '"+input+"'");
	}

	input=getInput(scan,"Choose a digit.","0123456789"); //you need to pick a digit between out of these numbers
	System.out.println("You entered '"+input+"'");
  }//end of main method  
}//end of class
