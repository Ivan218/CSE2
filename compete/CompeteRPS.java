import java.util.Scanner;

public class CompeteRPS {
    
    public static void main (String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Name:moves for Robot 1: ");
        String Robot1 = input.nextLine();
        System.out.print("Name:moves for Robot 2: ");
        String Robot2 = input.nextLine();
        
        int NameID1 = Robot1.indexOf(":");
        String Name1 = Robot1.substring(0,NameID1);
        String Moves1 = Robot1.substring(NameID1+1,Robot1.length()-1);
        Moves1 = Moves1.toUpperCase();
        int NameID2 = Robot2.indexOf(":");
        String Name2 = Robot2.substring(0,NameID2);
        String Moves2 = Robot2.substring(NameID2+1,Robot2.length()-1);
        Moves2 = Moves2.toUpperCase();
        
        int wins1 = 0;
        int wins2 = 0;
        String M1="0";
        String M2="0";
        int move1 = 0;
        int move2 = 0;
        int matches=0;
        
        while((wins1<5) || (wins2<5) || (matches==100000)) {
            if(move1==(Moves1.length()-1)) {
                move1 = 0;
                M1 = Moves1.substring(move1);
            }
            else {
                M1 = Moves1.substring(move1);
            }
            if(move2==(Moves2.length()-1)) {
                move2 = 0;
                M2 = Moves2.substring(move2);
            }
            else {
                M2 = Moves2.substring(move2);
            }
            
            if(M1.equals("R")) {
                if(M2.equals("R")) {
                    matches+=1;
                }
                else if(M2.equals("S")) {
                    matches+=1;
                    wins1+=1;
                    wins2-=1;
                }
                else if(M2.equals("P")) {
                    matches+=1;
                    wins1-=1;
                    wins2+=1;
                }
            }
            else if(M1.equals("P")){
                if(M2.equals("P")) {
                    matches+=1;
                }
                else if(M2.equals("R")) {
                    matches+=1;
                    wins1+=1;
                    wins2-=1;
                }
                else if(M2.equals("S")) {
                    matches+=1;
                    wins1-=1;
                    wins2+=1;
                }
            
            }
            else if(M1.equals("S")) {
                if(M2.equals("S")) {
                    matches+=1;
                }
                else if(M2.equals("P")) {
                    matches+=1;
                    wins1+=1;
                    wins2-=1;
                }
                else if(M2.equals("R")) {
                    matches+=1;
                    wins1-=1;
                    wins2+=1;
                }
                move1+=1;
                move2+=1;
            }
            
        } //while loop
        
        if(wins1==5) {
            System.out.println(matches);
            System.out.println(Name1);
        }
        else if(wins2==5) {
            System.out.println(matches);
            System.out.println(Name2);
        }
        else if(matches==100000) {
            System.out.println(matches);
            System.out.println("DRAW");
        }
     
        
    }
}