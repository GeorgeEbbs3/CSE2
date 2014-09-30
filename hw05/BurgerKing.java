// George Ebbs
// Homework 5 
// Program 1: Burger King 
// September 26, 2014
// a program that prompts the user 
//to enter a choice of a burger, a soda, or fries.

//first establish the scanner
import java.util.Scanner;

//Now we establish the class
public class BurgerKing {
    //main method is required for this java program
    public static void main(String [] args) {
        
        //declare the scanner to access the imput
        Scanner myScanner;
        
        //now we call the scanner instructor 
        myScanner = new Scanner( System.in );
        
        //prompt the user for what type of item they want from the menu
        System.out.println("Enter a letter to indicate a choice of: ");
        System.out.println("Burger (B or b) "); //burger
        System.out.println("Soda (S or s) "); //soda
        System.out.println("Fries (F or f) "); //fries
        
        //now we make our imput variable
    String order1=myScanner.next();
        
    if(order1.length() == 1){ //we use this if statement to ensure that only one character is inputted 
       
     //now we set up a switch statement to call what happens depending on what was entered
     switch (order1) {
         case "B": //this will cover both the upper and lower case letters
         case "b":
             System.out.println("Please enter (A or a) for 'all the fixins' ");
             System.out.println("(C or c) for cheese ");
             System.out.println("(N or n) for none of the above ");
             //this was made to allow the user to answer
             char order2=myScanner.next().charAt(0); 
             
             //now we setup another switch to finalize these three options
             switch (order2) {
                 case 'A': //if they want a loaded burger
                 case 'a':
                     System.out.println("You ordered a burger with 'All the fixins' ");
                     break;
                 case 'C':
                 case 'c': //if they want just cheese
                    System.out.println("You ordered a burger with cheese ");
                    break;
                 case 'N':
                 case 'n': //if they want a plain burger
                    System.out.println("You ordered a plain burger ");
                    break;
                default:
                    System.out.println("You didn't input an option ");
                    return;
             }
        case "S": //if they want a soda, they can imput S or s
        case "s":
            System.out.println("Do you want Pepsi (P or p) ");
            System.out.println("Do you want Coke (C or c) ");
            System.out.println("Do you want Sprite (S or s) ");
            System.out.println("Do you want Mountain Dew (M or m) ");
            
            //like before we make another variable for their soda choice
            char order3= myScanner.next().charAt(0);
            
            //another switch statement to differentiate between options
            switch (order3) {
                case 'P'://if they chose pepsi
                case 'p':
                    System.out.println("You ordered a Pepsi ");
                    break;
                case 'C': //if they chose coke
                case 'c':
                    System.out.println("You ordered a Coke ");
                    break;
                case 'S': //if they chose sprite
                case 's':
                    System.out.println("You ordered a Sprite ");
                    break;
                case 'M': //if they ordered mountain dew
                case 'm':
                    System.out.println("You ordered a Mountain Dew ");
                    break;
                default: //in case they didnt enter one of the values
                    System.out.println("You didnt enter an option ");
                    return;
                }
                //now it is time for fries
            case "F":
            case "f":
                System.out.println("Do you want a large (L or l) or a small fries (S or s) ");
                
            //now we make another char variable
                char order4= myScanner.next().charAt(0);
                
            //now the last switch statement
                switch (order4) {
                    case 'L': //for larger fries
                    case 'l':
                        System.out.println("You ordered a large fries ");
                        break;
                    case 'S': //for small fries
                    case 's':
                        System.out.println("You ordered a small fries ");
                        break;
                    default: // in case they entered something wrong
                        System.out.println("You did not enter a valid answer ");
                        return;
                }
            default: //to make sure you entered an option
                System.out.println("You did not enter a valid input ");
                return;
        }//end of switch1
        
     }else { //incase you entered more that one letter
         System.out.println("You did not enter a single character ");
         return; 
     }//end of else
             
    }//end of method

        
        
        
        
       
    } //end of class
        