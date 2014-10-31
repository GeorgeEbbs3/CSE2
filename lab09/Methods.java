///////////
//George Ebbs III
// October 24,2014
//
import java.util.Scanner;
public class Methods{
    public static int getInt(Scanner scan){
       System.out.println("Enter an Int: ");
       while(!scan.hasNextInt()){
           System.out.println("You did not enter an int; try again- ");
       scan.next();
       }
       int x=0;
       x = scan.nextInt(); 
        return x;
    }
    public static int larger(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static Boolean ascending(int a, int b, int c){
        if(c>b && b>a){
            return true; 
        }else{
            return false;
        }
    }
    
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter three ints");
	a=getInt(scan);
	b=getInt(scan);
	c=getInt(scan);
	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	System.out.println("The larger of "+a+", "+b+", and "+c+
                   	" is "+larger(a,larger(b,c)));
	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                   	", and "+c+" are in ascending order");
}
}