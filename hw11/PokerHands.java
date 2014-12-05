////////////////
// George Ebbs 
// December 4, 2014
/* This program will prompt the user to enter several cards
to form a poker hand and then will print out the hand they selected
and tell the user what type of hand they selected. ex: full house or straight. 
*/
import java.util.Scanner; //calls the scanner
public class PokerHands{//class
    public static void main(String [] args){
    Scanner scan= new Scanner( System.in );//calls and initializes the scanner
    Boolean input= true; //sets up the while loop criteria
    while(input){//while the input is true (question is asked toward bottom of code to see if input is true / false)
        String [] suitVal= new String[5];//creates an array that will be the suit with 5 places
        String[] cardVal = new String[5];//creates an array that will be the card number with 5 places
        String Clubs="Clubs: ";//initalizes clubs
        String Diamonds= "Diamonds: ";//initializes Diamonds
        String Hearts= "Hearts: ";//initializes Hearts
        String Spades= "Spades: ";//initializes Spades
        for(int i=0; i<5; i++){//loops to ask the question 5 times
            System.out.print("Enter the suit: ");
            String suit = scan.next();//accepts the user input
            System.out.print("Enter Card Value: ");
            String card = scan.next();//accepts the user input
            suitVal[i] = suit;//stores it in the array 
            cardVal[i] = card;//stores it in the array 
            for(int j=0; j<1; j++){//now puts it in the string depending on what suit was selected
                if (suit.equals ("d") || suit.equals ("D")){//id d is selected
                    Diamonds+=cardVal[i]; //add the card value to the suit
                    Diamonds+=" ";// Spacing between the card numbers
                }
                if (suit.equals ("c") || suit.equals ("C")){
                    Clubs+=cardVal[i]; //add the card value to the suit
                    Clubs+=" ";// Spacing between the card numbers
                }   
                if (suit.equals ("h") || suit.equals ("H")){
                    Hearts+=cardVal[i]; //add the card value to the suit
                    Hearts+=" ";// Spacing between the card numbers
                }
                if (suit.equals ("s") || suit.equals ("S")){
                    Spades+=cardVal[i]; //add the card value to the suit
                    Spades+=" ";// Spacing between the card numbers
                }
            
            }
        }
    System.out.println(Clubs);//prints out the Strings
    System.out.println(Diamonds);
    System.out.println(Hearts);
    System.out.println(Spades);
    
    System.out.println("If you want to continue type 'y' or 'Y'"); //prompts the question
    String answer = scan.next();//takes the user's input
        if(answer.equals ("y") || answer.equals ("Y")){//if the user wants too, then the loop will loop
            input=true;//becuase its true
        }else{//otherwise
            input=false;//STOP THE LOOP
        }//end of else
        
    }    
    }//end of method
}//end of class

    
