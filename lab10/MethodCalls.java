/////////
//George Ebbs
//October 31, 2014
//For this lab session you will get practice
//writing methods that call methods.
import java.util.Scanner;
public class MethodCalls{
    public static int addDigit(int total, int addition){
      if (total<0){
          int betterTotal= total*-1;
          String Space = String.valueOf(addition);
          String newTotal= String.valueOf(betterTotal);
          String bigTotal= Space+newTotal;
          Integer x = Integer.valueOf(bigTotal);
          return -x;
      }else if (addition>=0 && addition<=9){
          String Space = String.valueOf(addition);
          String newTotal= String.valueOf(total);
          String bigTotal= Space+newTotal;
          Integer x = Integer.valueOf(bigTotal);
          return x;
      }else{
          return total;
      }
    }
    
    public static int join(int a2 , int b2){
        if(a2<0 && b2<0){
            int a3= a2*-1;
            int b3= b2*-1;
            String A = String.valueOf(a3);
            String B = String.valueOf(b3);
            String C = A + B;
            Integer d = Integer.valueOf(C);
            return d;
        }/*
        String A = String.valueOf(a2);
        String B = String.valueOf(b2);
        String C= A+B;
        Integer d = Integer.valueOf(C);
        return d;*/
        
        return addDigit(a2,b2);
    }
    
    
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));

        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
        
    }
}  
/*
Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/