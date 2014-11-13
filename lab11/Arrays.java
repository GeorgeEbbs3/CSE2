////////////////////
// George Ebbs 
// November 13, 2014
// This lab will provide practice with elementary array operations
import java.util.Scanner; 
public class Arrays{
    public static void main( String [] args){
        Scanner scan= new Scanner( System.in );
        int[] userCollect = new int[10];//makes the array with 10 spaces available
        int counter=0;
        System.out.print("Enter 10 ints- ");
        for(counter=0; counter<10; counter++){
            userCollect[counter] = scan.nextInt();
        }
        int min= userCollect[0];
        for(counter=1; counter<10; counter++){
            if(userCollect[counter]<min){
                min=userCollect[counter];
            }
        }
        System.out.println("The Lowest Entry is "+ min);
        
        int max= userCollect[0];
        for(counter=1; counter<10; counter++){
            if(userCollect[counter]>max){
                max=userCollect[counter];
            }
            }
            System.out.println("The highest entry is "+ max);
        
        int sum=0;
        for(counter=0; counter<10; counter++){
           sum+= userCollect[counter]; 
        }
        System.out.println("The sum is "+ sum);
        
        int[] userDollect = new int[userCollect.length];
        for(int i=0; i<userCollect.length; i++){
            userDollect[i]= userCollect[userCollect.length-1-i];
        
            System.out.println(userCollect[i]+"\t"+userDollect[i]);
        }
}
}
