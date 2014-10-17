///////////////////////////
// George Ebbs
// October 3, 2014
// Enigma3.java Debug Lab06
/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */
//dont need scanner
public class Enigma3{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    
    switch(k%14){
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;
          n/=3;
          k-=7;
          break;
    }
    if(n*k%12< 12){
      n-=20;
      out+=n;
    }
    if(n*n>k){
      n=42;
      out+=n+k;
    }
    else {
      n=45;
      out+=n+k;
    }
    switch(n+k){
      case 114: 
        n-=11;
        k-=3;
        break;
      case 97:
        n-=14;
        k-=2;
        break;
      case 98:
        n/=5;
        k/=9;
        break;
      default:
        n-=3;
        k-=5;
    }
     out+=(1/n) + (1/k);   
    System.out.println(out);
  }
}

/*
 * Error report: Firstly, there was no need for a scanner! Then
 * there was no break statement from lines 22-23 which would
 * allow the user to exit from the switch statements. In addition,
 * there was no break on lines 55-56 (now line56) which caused the 
 * newly found k and n values to be subtracted from in the default
 * command rather than being exited from the switch.
 */