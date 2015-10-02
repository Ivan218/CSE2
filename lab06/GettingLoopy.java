/*
Ivan Rivera
lab06
Getting Loopy
October 2, 2015
*/

public class GettingLoopy {
    
    public static void main (String args[]) {
        
        //STEP 1
        System.out.println("STEP 1:");
        int i;
        for(i=1; i<8; i++) {
            System.out.print(i);
        }
        while(i<12) {
            System.out.print(7);
            i++;
        }
        System.out.println("");
        //END STEP 1
        
        //STEP 2
        //While Loop
        System.out.println("STEP 2:");
        i = 10;
        while(i>=10 && i<=100) {
            if(i%2!=0) {
                if(i%3!=0) {
                    if(i%5!=0) {
                        if(i%7!=0) {
                            System.out.print(i+" ");
                        }
                    }
                }
            }
            i++;
        }
        System.out.println("");
        //For loop
        for(i=10; i>9 && i<=100; i++) {
            if(i%2!=0) {
                if(i%3!=0) {
                    if(i%5!=0) {
                        if(i%7!=0) {
                            System.out.print(i+" ");
                        }
                    }
                }
            }
        }
        System.out.println("");
        //Do-while loop
        i=10;
        do {
            if(i%2!=0) {
                if(i%3!=0) {
                    if(i%5!=0) {
                        if(i%7!=0) {
                            System.out.print(i+" ");
                        }
                    }
                }
            }
            i++;
        } while(i>9 && i<100);
        System.out.println("");
        //END STEP 2
        
        //STEP 3
        System.out.println("STEP 3:");
        int nimrod = (int)(Math.random()*195.00+5.00);
        i=1;
        while(i<=nimrod) {
            if(i%20==0) {
                System.out.println(":)");
            }
            else {
                System.out.print(":) ");
            }
            i++;
        }
        //END STEP 3
    }//matches main method brace
}//matches public class brace