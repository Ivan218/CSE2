

import java.util.Scanner;

public class BinarySort {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[] nums = createArray();
        
        printArray(nums);
        sort(nums);
        printArray(nums);
        
        
        System.out.print("What do you wanna search for? ");
        int ding = input.nextInt();
        int keyInd= binSearch(nums, ding);
        
        System.out.println("KEY VALUE: "+ding);
        System.out.println("KEY INDEX: "+keyInd);
    }//main method
    
    public static int[] createArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Desired length for array? ");
        int length = input.nextInt();
        int[] array = new int[length];
        
        for(int i=0; i<length;i++) 
            array[i]=(int)(Math.random()*100000);
        
        return array;
    }//createArray method
    
    public static void printArray(int[] array) {
        for(int i=0; i<array.length;i++) {
            if((i+1)%20==0)
                System.out.println(array[i]+ " ");
            else
                System.out.print(array[i]+" ");
        }
        System.out.println();
    }//printArray method
    
    //NOTE: I deleted the duplicate counter since it is no longer necessary as Math.random() scales pretty high
    public static void sort(int[] array) {
        int[] count = new int[array.length];
        int[] copy = new int[array.length];
        for(int i=0; i<array.length;i++) 
            copy[i]=array[i];
            
        
        for(int i=0; i<array.length;i++) {
            for(int j=0; j<array.length; j++) {
                if(i==j) {continue;}
                if(array[i]>array[j]) {count[i]++; continue;}
            }//inner for loop
        }//outer for loop
        
        /*For testing only
        for(int i=0; i<array.length;i++) {
            if((i+1)%10==0)
                System.out.println(array[i]+": "+count[i]+"; ");
            else
                System.out.print(array[i]+ ": "+count[i]+"; ");
        }*/
        
        for(int i=0; i<array.length;i++)
            array[count[i]]=copy[i];
        System.out.println("SORTED");
    }//sort method
    
    public static int binSearch(int[] array, int key) {
        int low=0;
        int high=array.length-1;
        int mid=(low+high)/2;
        while(low<=high) {
            if(key==array[mid]) 
                return mid;
            else if(key>array[mid]) 
                low = mid+1;
            else 
                high = mid-1;
            mid=(low+high)/2;
        }
        return -1;
    }//binSearch method
    
    
    public static int makeEvenHalf(int num) {
        if(num%2==0) {return (num/2);}
        else {return((num+1)/2);}
    }//makeEvenHalf method
    
    public static void shuffle(int[] array) {
        int num;
        for(int i=0; i<array.length;i++) {
            num=(int)(Math.random()*array.length);
        }
    }
}//public class