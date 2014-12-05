///////////////////
// George Ebbs
// December 4th, 2014
/*This program will provide practice with 3d arrays that will print out slabs 
of random numbers and then will sort the third slab while also identify the smalest entry 
in the 3d array. */
public class MatrixSorter{
  public static void main(String arg[]){
    int mat3d[][][];//creates the 3d array
    mat3d=buildMat3d(); // calls the method to build the array
    show(mat3d);//this prints out the array
    System.out.println("The smallest entry in the 3D matrix is "+
              findMin(mat3d));//this does a search through the entire array to check and see whats the minimum 
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);//the sorted matrix
    show(mat3d);// this prints it out again
    
    
  }//end of method
  
  public static int findMin(int mat3d[][][]){ //calls the array and returns an integer
      int min=mat3d[0][0][0]; //make the first value the minimum and then compare it to the rest of the data
      for(int i=0; i<3; i++){//to build the slabs
          for(int j=0; j<3+2*i; j++){//to build the rows
              for(int k=0; k<i+j+1; k++){//to build the columns
                  if(mat3d[i][j][k]<min){//in the even that the next value is less than the original [0][0][0] then switch it to min
                      min=mat3d[i][j][k];//min is the new, lower value
                  }//end of if
              }//end of for3
          }//end of for2
      }//end of for1
      return min; //return the int min
  }//end of method
  
  public static int[][] sort(int mat3d[][]){//this calls the array as a 2d array and returns the sorted 2d array
        return mat3d; //this returns the 2d array (sorted)
  }
  
  public static void show(int mat3d[][][]){//this will print out the array 
    for(int s=0; s<3; s++){//carves out the 3 slabs
        for(int j=0; j<3+2*s; j++){//carves out the rows
            for(int r=0; r<s+j+1; r++){//carves out the number of columns
                System.out.print(mat3d[s][j][r]);//prints out the array 
                System.out.print(" ");// puts spaces in between the columns
            }//end of for3
            System.out.println();//puts a space between the rows
        }//end of for2
         System.out.println();//puts a space between the slabs
    }//end of for1
  }//end of method
  
  public static int[][][] buildMat3d(){//inputs nothing but returns a build 3d array
      int mat3d[][][] = new int[3][7][9];//makes the maximum amount or length
      for(int s=0; s<3; s++){//carves out the 3 slabs
        for(int j=0; j<3+2*s; j++){//carves out the rows
            for(int r=0; r<s+j+1; r++){//carves out the number of columns
               mat3d[s][j][r]= 0 + (int)(Math.random()*99);//makes a random number between 0 and 99
            }//end of for3
        }//end of for2
      }//end of for1
      return mat3d;//returns the 3d array
  }//end of method
  
  
}//end of class