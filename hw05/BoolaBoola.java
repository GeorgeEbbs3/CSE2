// George Ebbs
// Homework 5 
// Program 2: BoolaBoola 
// September 26, 2014
// a program that has three boolean variables 
//to each of which the value of true or false
//is randomly assigned. Then, at random, combine 
//the three variables with random choices of && 
//and || and stores the result. For example, one 
//might have the expression true && false || true 
//(there are 32 possible expressions, so I will not 
//list all the possibilities). The program should then 
//present the expression to the user and ask the user to 
//state the result of of the expression.

//first establish the scanner
import java.util.Scanner;

//Now we establish the class
public class BoolaBoola {
    //main method is required for this java program
    public static void main(String [] args) {
        
         //declare the scanner to access the imput
        Scanner myScanner;
        
        //now we call the scanner instructor 
        myScanner = new Scanner( System.in );
        
        //made some variables 
        Boolean varBoo;
        Boolean varBoo2;
        Boolean varBoo3;
        String sign;
        String sign2;
        
        //now we are going to make a random
        int random1 = (int)(Math.random()*11);
        int random2 = (int)(Math.random()*11);
        int random3 = (int)(Math.random()*11);
        int random4 = (int)(Math.random()*11);
        int random5 = (int)(Math.random()*11);
        
        //randomizing variables by assigning a boolian value to them (in a number range) to generate a randomized True or False 
        if (random1>=5) {
            varBoo = true;
        // had to have 5 so they could be different random values, aka they're not effected by another 
        }else{
            varBoo = false;
        }
        // process cont
        if (random2>=5) {
            sign = "&&";
            
        }else{
            sign = "||";
        }
        // process cont
        if (random3>=5) {
            varBoo2 = true;
            
        }else {
            varBoo2 = false;
        }
        // process cont
        if (random4>=5) {
            sign2 = "&&";
            
        }else{
            sign2 = "||";
        }
        // process cont
        if (random5>=5) {
            varBoo3 = true;
            
        }else{
            varBoo3 = false;
        }
        //print statement asking question to user
        System.out.println("Does " +  varBoo   + sign   + varBoo2   + sign2   + varBoo3  +" have the value true(t/T) or false(f/F)? ");  
        
        // this creates the users answer
        String answer= myScanner.next();
        if(answer.length() == 1){ 
            answer= answer+"";
            
        }else{
        System.out.println("You put in an invalid input ");
    }
    //now we determine whether or not the answer the user provided is True or False
    //created a boolian indicator to be set T when an answer is correct and vice versa
    Boolean correct;
    
    if(varBoo == false || varBoo2 == false || varBoo3 == false ) {
        
        if(answer.equals("f") || answer.equals("F")) { //if they put in f or F they answer false
           correct = true; 
        }else{
            correct = false;
        }
    }else{
        if(answer.equals("t") || answer.equals("t")) { //if they put in the t or T they answer True
            correct = true;
        }else{
            correct = false;
        }
    }
    if (correct) {
        System.out.println("CORRRREEECCCTTTT "); //Boom the output Answer
    }else{
        System.out.println("TrY AgAiN ");
    }
    
    
}//end of method

}//end of class
//lolol