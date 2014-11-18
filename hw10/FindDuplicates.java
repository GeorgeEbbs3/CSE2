////////////////
//George Ebbs 
// November 17, 2014 
/*
The program for this assignment will test out how 
well the random generation of poker hands works. Once 
you have developed methods in one class you can use 
those methods in other classes. We have done this 
already with, e.g., Math.random(). In this assignment, 
you will develop some of the methods in a separate class.
I have provided the program FindDuplicates but I have omitted 
the code for two methods called in the main method, hasDups() 
and exactlyOneDup(). Write these methods. */
import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  public static Boolean hasDups(int num[]){ //this will go through and examine the array and return true/false 
      int c=0;
      for(int a=0; a<num.length; a++){ //to run through each part of the array
          for(int b=num.length-1; b>0; b--){ //to cross check each part with each part 
              if(a!=b){ //if the numbers are the same, they are automaticall going to have the same value, therefore it wouldnt be a repetition
                  if(num[b]==num[a]){ //since the numbers are different, if the arrays are the same, its a double!
                  c++;//add to the counter to help decide whether one of the values have doubles 
                  }//close if
              }//close if
          }//close for
      }//close for loop
      if(c>=1){ //if c was anything greater than one, there must've been a double 
          return true;
      }else{ //if not there was no doubles
          return false;
      }
                  
  } 
  
  public static Boolean exactlyOneDup(int num[]){
      int c=0;
      for(int a=0; a<num.length; a++){ //Same comments as above^^^
          for(int b=num.length-1; b>0; b--){
              if(a!=b){
                if(num[b]==num[a]){
                  c++;
                }
              }
          }
      }
      if(c==1){ // only if c is equal to one was there exactly one double
          return true;
      }else{
          return false;
      }
  }//end of method
  
  
    
    
}//end of class
  
  
  
  
  
  
  

