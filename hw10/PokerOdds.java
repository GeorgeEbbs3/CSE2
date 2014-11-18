/////////////////
// George Ebbs 
// November 17, 2014
/*
The method showOneHand() should generate random 
poker hands, prompting the user if they would like 
another hand to be generated (it will repeat as long 
the user desires). The method simulateOdds() should 
randomly generate 10000 hands and count the number of 
times that a hand with a pair of a specific rank occurs, 
along with the number of hands that do not have a pair
*/
import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
    public static void main(String [] arg){
    showHands();
    simulateOdds();
    }
    
    public static void showHands(){
    Scanner scan = new Scanner( System.in ); //initialize the scanner
    Random rand = new Random(); //initialize random
    String suit = " "; //initialize suit
    String answer="";//initilized for the d0 while
    do{
    String faceCard[] = new String [4]; //This will allow for you to generate the facecard values later in a new array
    for(int g=0; g<4; g++){ //created a for loop to assign the face card values to each faceCard[] place
        if(g==0){
            faceCard[g]="A"; //Aces
        }else if(g==1){
            faceCard[g]="K";//Kings
        }else if(g==2){
            faceCard[g]="Q";//Queens
        }else{
            faceCard[g]="J";//Jacks
        }
        }
    String suitCard[]= new String[52]; //this will make the suits that we will then add the numbers too! 
    for(int w=0; w<52; w++){ //this will runs through the 'deck' and will give the suit a value of 13 numbers 
        if( w/13<=1){ //if the suit is in the first 12 
            suitCard[w]= "clubs"; //ITS A CLUB
        }
        else if(w/13>1 &&w/13<=2){
             suitCard[w]= "diamonds";//then diamonds and so on and so forth
        }else if(w/13>2  && w/13<=3){
            suitCard[w] = "hearts"; //Hearts
        }else if(w/13>3 && w/13<=4){
            suitCard[w] ="spades"; //Spades
        }
        }
        int a=0;
        for(int b=0; b<5; b++){ //This will run it through 5 times and give you a random value every time
            a= rand.nextInt(52); //a random value between 1 and 52
        if(a==0||a==13||a==26 || a==39){ //This calls the ace from ^^
            System.out.println(suitCard[a]+": "+faceCard[0]);
        }else if(a==1|| a==14 || a==27 || a==40){// This calls the King
            System.out.println(suitCard[a]+": "+faceCard[1]);
        }else if(a==2 ||a==15||a==28||a==41){//This calls the Queen
            System.out.println(suitCard[a]+": "+faceCard[2]);
        }else if(a==3||a==16||a==29||a==42){//This calls the Jack
            System.out.println(suitCard[a]+": "+faceCard[3]);
        }
        else{
            System.out.println(suitCard[a]+": "+(a%13));
        
        }
        }
        System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
        answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y")); //re runs the program unitl they dont want to anymore
    }
    
    public static void simulateOdds(){ //this calls the method simulate odds from the main method
    }



}
    
    
    
    

