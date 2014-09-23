// George Ebbs
// Homework 4 
// Program 3: CourseNumber 
// September 23, 2014
// The semester during which a course is offered at Lehigh is given 
//by a 6 digit number. The first four digits give the year, and the 
//last two digits give the semester: 10 spring, 20 summer 1, 30 
//summer 2, and 40 fall. Write a program that reads in a 6 digit 
//number, makes sure that it adheres to the above description, 
//and then prints out the semester and year.

//first establish the scanner
import java.util.Scanner;

//Now we establish the class
public class CourseNumber {
    //main method is required for this java program
    public static void main(String [] args) {
        
        //declare the scanner to access the imput
        Scanner myScanner;
        
        //now we call the scanner instructor 
        myScanner = new Scanner( System.in );
        
        //now we need the user to enter a course number (6 digits)
        System.out.print("Please enter a 6 digit number giving the course semester ");
        
        //if statement to make sure it is an integer
        if(myScanner.hasNextInt()) {
            //make some variables
            int courseNumber=myScanner.nextInt();
            int yearNumber= (int)(courseNumber/100);
            int semesterNumber= (courseNumber) - (yearNumber*100);
            
        if(courseNumber<=0) {
            System.out.print("That is not an integer!");
            return;
        }
        //need to set the boundaries for the course numbers
        if(courseNumber<186510 || courseNumber>201440) {
            System.out.println("The number was outside the range of acceptable values ");
            return;
        }
        //make sure semester number is appropriate 
        if(semesterNumber==10 || semesterNumber==20 || semesterNumber==30 || semesterNumber==40 ) {
            
        }else{
            System.out.println(semesterNumber+ "is not a legitimate number ");
            
        }
        //if the semester was in the spring semester 
        if(semesterNumber==10){
            System.out.println("The course was offered in the Spring semester of "+ yearNumber);
        }
        //if the semester was in the Summer 1 semester
        if(semesterNumber==20){
            System.out.println("The course was offered in teh Summer 1 semester of "+ yearNumber);
        }
        //if the semester was in the Summer 2 semester
        if(semesterNumber==30){
            System.out.println("The course was offered in the Summer 2 semester of "+ yearNumber);
        }
        //if the semester was in the Fall semester
        if(semesterNumber==40){
            System.out.println("The course was offered in the Fall semester of "+ yearNumber);
        }
        
        }else{
            System.out.println("The number was not an int ");
            return;
        }
        
        
        }//end of method
   } //end of class
        
        