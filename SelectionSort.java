


public class SelectionSort {
    
    public static void main(String args[]) {
        int[] someArray=getArray();
        printArray(someArray);
        java.util.Arrays.sort(someArray);
        printArray(someArray);
        
    }//main method
    
    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println();
    }//printArray[]
    
    public static void printArray(int[][] array) {
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }//printArray[][]
    
    public static int[] getArray() {
        int[] array1=new int[(int)(Math.random()*100)];
        for(int i=0; i<array1.length; i++) {
            array1[i]=(int)(Math.random()*50+1);
        }
        return array1;
    }//getArray[]
    
    public static int[][] getArray1() {
        int[][] array2=new int[(int)(Math.random()*5)][(int)(Math.random()*5)];
        for(int i=0; i<array2.length; i++) {
            for(int j=0; j<array2[i].length; j++) {
                array2[i][j]=(int)(Math.random()*11);
            }
        }
        return array2;
    }//getArray1[][]
    
    /*public static void InsertionSort(int[] array) {
        for(int i=1; i<array.length; i++) {
            
        }
        
    }*/
}//public class