//////////////////////
// George Ebbs 
// November 17, 2014
/*The program below calls two methods
that are among a number that could be 
written to perform arithmetic operations 
on arrays: equals() and addArrays(). */
public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
  
  public static Boolean equals(double a[], double b[]){
      int k=0;
      if(a.length==b.length){
        for(int i=0; i<a.length; i++){
            if(b[i]==a[i]){
                k++;
            }
        }
    if(k==a.length){
        return true;
    }else{
        return false; 
    }
        
    }else{
        return false;
    }
  }
  
  public static double[] addArrays(double a[], double b[]){
      int counter=0;
       double [] c = new double[a.length];
       double [] d= new double[b.length];
       double [] e= new double[a.length];
       if(a.length==b.length){
            for(int i=0; i<a.length; i++){
                c[i] = a[i] +b[i];
            }
            return c;
           }else{
               for(int x=0; x<b.length; x++){
                   c[x] = a[x] + b[x];
                   for(int y=b.length; y<a.length; y++){
                       c[y]= a[y];
                   }
               }
        return c;
  }
  }
}
    
  
  
  
  
