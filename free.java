

//continue statement: use to skip to end of loop without exiting loop (continue;)
import java.util.Scanner;

public class free {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        /*
        String something = "PR";
        int pr = Integer.parseInt(something); 
        System.out.println("HELLO"+pr+"BYE");
        */
        /*
        //Test if two strings are equal
        String a = "test";
        String b = "te"+"st";
        if(a.equals(b)) {
            System.out.println(a.equals(b));
        }
        */
        /*
        char a = '\u0050';
        char b = '\u0052';
        char c = '\u0053';
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        */
        /*
        int lotto = (int)(Math.random()*10000+1);
        int guess = -1;
        int i = 1;
        while(guess != lotto) {
            System.out.print("What's the magic number? ");
            guess = input.nextInt();
            if(guess>lotto) {
                System.out.println("Too high!");
            }
            else if(guess<lotto) {
                System.out.println("Too low.");
            }
            i++;
        }
        System.out.println("It took you "+i+" attempts!");
        */
        //an integer to store the user input
        /*double myDouble = 0.0;

        //a switch to decide if you want to ask again
        boolean acceptable = false;

        //loop until you get acceptable input (i.e. if it's a double)
        System.out.print("Input your double: ");
        while(true){
            //check if the input is a double.
            if (input.hasNextDouble() ){
                //if so, store it.
                myDouble = input.nextDouble();
                break;
            }
            else{
                //if not, trash it.  This does not assign the output of 
                //next() to anything. The output is just discarded.
                System.out.println("   ERROR: need a double");
                System.out.print("Input your double: ");
                input.next();
            }
        } 
        */
        /*
        for(int i=1; i<4; i++) {
            for(int j =1; j<3; j++) {
                for(int k=0; k<j; k++) {
                    System.out.println(k+j);
                }
            }
            i++;
            System.out.println("test");
        }*/
	    /*for(int i=0; i<10; i++) {
		    if(i<5) {
			    for(int j=0; j<=i; j++) {
				    System.out.print(i);
			    }
		    }
		    else {
			    for(int j=9; j>i-1; j--) {
				    System.out.print(i);
			    }
		    }
	    System.out.println();
	    }*/
	    int array[] = new int[5];
	    for(int i=0;i<5;i++) {
	        array[(i*3/2)%5]=(int)(Math.pow(i,i));
	        System.out.println("("+i+"*3/2)%5= "+(i*3/2)%5);
	    }
	    for(int i=0; i<5; i++) {System.out.println("array["+i+"]= "+array[i]);}
    }//main method brace
}//public class brace