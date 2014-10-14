//////////////////
// George Ebbs
// October 13, 2014
// Roulette Program
/* This program is going to run a loop 100 times to collect data
on the odds of winning roulette and for each of the 100 loops, there 
will be another loop testing 1000 possible values. Then the program will 
let you know whether or not you made a profit, broke even, or simply lost 
money. 
*/ 
//name the class 
public class Roulette {
    //establish the method
    public static void main(String [] args) {

//make a counter
int counter= 0, counter2=0;
//make the random number 
int randomNumber= (int)(Math.random()*38);
//make a total amount of winnings
int winnings=100;
//more variables
int profit=0; //how many times your number got you a profit
int lostEverything=0; //how many times your number was never hit
int totalWinnings=0; //the total amount you won!

//start the while loop
    while(counter2<1000){ //runs it 1000 times
        winnings=100; //resets the winnings every reloop
        while(counter<100){ //runs it 100 times
         //make a random number to compare random number that was chosen
            int randomNumber2= (int)(Math.random()*38); //generate a random number 1-37
            if(randomNumber==randomNumber2){
             winnings+=35; //you won :)
            }else{
             winnings-=1; //you lost :/
            }
        counter++; //run the loop again!
        }
        counter=0; //reset the counter so the inner loop will run again
        
        if(winnings==0){
            lostEverything=+1; //adds it to the total
        }else if (winnings>100){
            profit+=1;
            totalWinnings+= winnings; //how many times you made a profit and your new value
        }else{
            totalWinnings+=winnings; // your total 
        }
    counter2++; //run the loop again 
    }
    //now we print the results for their number! 
    System.out.println("You lost everything "+ lostEverything +" times");
    System.out.println("Your made a profit: "+ profit +" times");
    System.out.println("Your total winnings was: "+ totalWinnings+ " dollars");
}//end of method
} //end of class
//lololol
        
    