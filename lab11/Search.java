/*
Ivan Rivera
Prof. Chen
CSE2
lab11 Search program */

/*This program creates two arrays to conduct a linear search on one unsorted array,
and a binary search on a sorted array*/


import java.util.Scanner;
public class Search {
    
    public static void main(String args[]) {
        Scanner input= new Scanner(System.in);
        int[] array1 = new int[5000];
        int[] array2 = new int[5000];
        
        for(int i=0; i<5000;i++) {
            array1[i]=(int)(Math.random()*100000);
        }
        
        int min=0;
        int max=0;
        
        for(int i=0; i<5000;i++) {
            if(array1[i]<array1[min]) {min=i;}
            if(array1[i]>array1[max]) {max=i;}
        }
        
        System.out.println("max = "+array1[max]+"; min = "+array1[min]);
        System.out.print("Input key: ");
        
        for(int i=0; i<5000;i++) {
            array2[i]=(int)(Math.random()*i+Math.pow(i,2));
            if(i!=0) {
                if(array2[i]<array2[i-1]) {array2[i]+=array2[i-1];}
            }
        }
        
        
        int key = input.nextInt();
        if(key<0) {return;}
        
        int high=array2.length-1;
        int low=0;
        int mid=0;
        boolean success=false;
        int count=0;
        while(high>=low) {
            mid=(high+low)/2;
            if(array2[mid]==key) {success=true; break;}
            else if(array2[mid]>key) {high=mid;}
            else {low=mid;}
            count++;
            if(count==15) {break;}
        }//while loop
        
        if(success) {
            System.out.println("The key was found at index: "+mid);
        }
        else {
            System.out.println("The key "+key+" was not found");
            System.out.println("The number above the key is "+array2[high]);
            System.out.println("The number below the key is "+array2[low]);
        }
    }//main method
}//public class