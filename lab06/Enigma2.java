///////////////////////////
// George Ebbs
// October 3, 2014
// Enigma2.java Debug Lab06
/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */
 //no scanner
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40/*/0*/;
    }
    System.out.println(out);
  }
}

/*
 * The user cannot divide by zero, when the program is written to do so, it will result in a runtime error. 
 * Although you can compile this program, when you run it, the compiler will display the java.lang exception
 * and display "java.lang.ArithmeticException: / by zero. In the error message it shows that is occurs in line 
 * 18, thus immediately pointing the user to where the zero is. I have commented the zero out so the program runs! 
 */