////////////////////////////////////////////////////////
// George Ebbs III
// lab05
// Random Games Program
// September 26, 2014
// This program will use a scanner class to obtain from the user
// one of three choices for a game of chance

import java.util.Scanner;
// now we name the class
public class RandomGames {
    // now establish the main method
    public static void main(String [] args) {
    //declare the scanner to access the imput
    Scanner myScanner;
    //now we are calling the Scanner Constructor 
    myScanner = new Scanner( System.in );
    //prompt the user for what game they would like to play
    System.out.println("Please enter R or r for Roulette, C or c for Craps, or P or p for Pick a Card: ");
    //we need to make sure they only imput one letter (character)
    
    //now we make our imput variable
    String game=myScanner.next();
    if(game.length() == 1){ //we use this if statement to ensure that only one character is inputted 
        
    //now we make the roulette variable
    int randomNumber= (int)(Math.random()*38);
    //now we make our switch statement
    switch (game) {
        case "R":
            switch (randomNumber) { //to change 37 to 00 to have a range of 00-36
                case 37:
                    System.out.println("Roulette:00");
                    break;
                default:
                    break;
            }
            System.out.println("Your number is: " + randomNumber +".");
            break;
        case "r":
            switch (randomNumber) {
                case 37:
                    System.out.println("Roulette:00");
                    break;
                default:
                    break;
            }
            System.out.println("Your number is: " + randomNumber +".");
            break;
        case "C": //this allows us to make sure all of the possible choices of games have a response 
        case "c":
            System.out.println("You cannot play craps yet");
            break;
        case "P":
        case "p":
            System.out.println("You cannot play Pick a Card yet");
        default:
        System.out.println("You didnt pick a valid option");
        break;
    }
    }else{ //in case more than one character was entered
        System.out.println("Please only use 1 character");
    }
    
    }
}
    