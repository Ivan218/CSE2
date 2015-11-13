/*
Ivan Rivera
Prof. Chen
lab12 Array Manipulation
*/

/**/



public class ArrayMan {
    
    public static void main(String args[]) {
         int [][]ragged=raggedArray();
         printArray(ragged);
    }//main method
    
    public static int[][] raggedArray() {
        int length = (int)(Math.random()*11+10);
        int size;
        
        int[][] ragged = new int[length][];
        int random;
        
        for(int i=0; i<ragged.length; i++) {
            random=(int)(Math.random()*11+10);
            for(int j=0; j<random; j++) {
                ragged[i][j]=(int)(Math.random()*2000-1000);
            }
        }
        return ragged;
    }//raggedArray method
    
    public static void printArray(int[][] array) {
        
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }//printArray
}//public class