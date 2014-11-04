//////////////////
// George Ebbs 
// November 3, 2014
/*This homework is designed to give you practice 
designing a nested sequence of method calls that divide
a larger problem into subproblems.  
*/
import java.util.Scanner;
public class BlockedAgain{
    public static int checkInt(){
        Scanner scan= new Scanner( System.in ); //construct the scanner 
        while(!scan.hasNextInt()){ //if the input is not an integer, keep looping it 0__0
           System.out.print("You did not enter an int; try again- ");
           scan.next(); //throw the loop back into first gear and keep going until they get it
       }
        int x=0;
       x = scan.nextInt(); 
        return x; //return the value they entered through the scanner 
    }
    public static int checkRange( int y){ //this uses the return x value now named y 
        Scanner scan2= new Scanner( System.in ); //construct the scanner
        int a=1;
        int b=9;
        while(y<1 || y>9){ //when its not between the two, keep it in the loop
            System.out.print("You did not enter an int in [1,9]; try again: ");
            //y=scan2.nextInt();
            y=checkInt(); // take it back to the check int to make sure that it comes to range 
        }
        return y; //this is the acceptable input
    }
    public static int getInt(){ //this method will call two sub methods to check before it returns a 'good' value
        System.out.print("Enter an in int between 1 and 9, inclusive: "); //ask the user
        int integer= checkInt(); //the yeild of check int will be an integer
        int rangeCheck=checkRange(integer);// the yeild of range check will be an int, but range check makes sure its [1,9]
        return rangeCheck; //return the acceptable input :D 
    }
    public static void allBlocks(int x){ //x is equal to user input
        block(x);// calls the block method
    }
    public static void block(int b){ //This will keep the user input that we checked earlier and store it as b
        int x=0, y=0, z=0, a=0; //initializeeee 
        String hyphen= "-";//to make the dashes
        String gap=" "+" "+" "+" "+" "+" "+" "+" "; //to make the spaces
        for(x=1; x<=b; x++){ //how many rows (incrementing numbers) do we want in this output
            System.out.print(gap); //need to space
            for(y=1; y<x; y++){ //number of columns per row increasing everytime
                System.out.print(x+""+x); //prints out the number of columns realitive to the row number value ex: 3rd row = 3 columns
            }
        System.out.println(x);
        line(x, y, z, a, gap, hyphen); //calls the line which contains the nested for loops
        System.out.println(gap+(hyphen)); 
        gap=gap.replaceFirst(" ", ""); //reduces the number of spaces ever time loop turns around 
        hyphen=hyphen.replaceFirst("-","---"); // increases the dashes 
        }
    }
    public static void line(int l, int y, int z, int a, String gap, String hyphen){ //this calls all the initialized variables in block()
        for(z=1;z<l; z++){ //this will make there be more rows per every increment of the number, but have it dependant of what row. similar to y's relationship
        System.out.print(gap);
        for(a=1; a<l; a++){//this will make the columns for each incrementing row
            System.out.print(l+""+l);
        }
        System.out.println(l);
        }
    }
    public static void main(String []s){
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt(); //will call checkInt and checkRange
        allBlocks(m);
    }
}