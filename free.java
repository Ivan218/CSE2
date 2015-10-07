

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
    }//main method brace
}//public class brace