/*
Ivan Rivera
Prof. Chen
lab12 Array Manipulation
*/

/**/



public class ArrayMan {
    
    public static void main(String args[]) {
         int [][]ragged=raggedArray();
         System.out.println("2D Array: ");
         printArray(ragged);
         int[] smallArray=findSmallest(ragged);
         System.out.println("Smallest Array: ");
         printArray(smallArray);
         int[] largeArray=findLargest(ragged);
         System.out.println("Largest Array: ");
         printArray(largeArray);
         int[]evenArray=mostEven(ragged);
         System.out.println("Even Array: ");
         printArray(evenArray);
    }//main method
    
    public static int[][] raggedArray() {
        
        int[][] ragged = new int[(int)(Math.random()*11+10)][];
        int random;
        
        for(int i=0; i<ragged.length; i++) {
            ragged[i]=new int[(int)(Math.random()*11+10)];
            for(int j=0; j<ragged[i].length; j++) {
                ragged[i][j]=(int)(Math.random()*2000-1000);
            }
        }
        return ragged;
    }//raggedArray method
    
    
    public static int[] findSmallest(int [][]array) {
        int small=0;
        
        for(int i=0; i<array.length; i++) {
            if(array[i].length<array[small].length) {small=i;}
        }
        return array[small];
        
    }//findSmallest[][]
    
    public static int[] findLargest(int[][] array) {
        int key1=0;
        int key2=0;
        
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length; j++) {
                if(array[i][j]>array[key1][key2]) {
                    key1=i;
                    key2=j;
                }
            }//inner for loop
        }//outer for loop
        
        System.out.println("Largest value in array: "+array[key1][key2]);
        return array[key1];
    }//findLargest[][]
    
    
    public static int[] mostEven(int[][] array) {
        int[] count= new int[array.length];
        for(int i=0; i<count.length;i++) {count[i]=0;}
        
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length; j++) {
                if(array[i][j]%2==0) {count[i]++;}
            }
        }
        int max=0;
        for(int i=0; i<count.length; i++) {
            if(count[i]>count[max]) {max=i;}
        }
        return array[max];
        
    }//mostEven[][]
    
    public static void printArray(int[][] array) {
        
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length; j++) {
                System.out.print(array[i][j]+"   ");
            }
            System.out.println();
        }
        System.out.println();
    }//printArray[][]
    
    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i]+"   ");
        }
        System.out.println();
        System.out.println();
    }//printArray[]
}//public class