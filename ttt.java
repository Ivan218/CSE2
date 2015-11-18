//Tic-Tac-Toe program


import java.util.Scanner;

public class ttt {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int[][] board = createNewBoard();
        boolean noWinner=true;
        while(noWinner) {
            printBoard(board);
            
        }
        
    }//main method
    
    
    public static int[][] createNewBoard() {
        int[][] game = new int[3][3];
        
        for(int i=0; i<game.length; i++) {
            for(int j=0; j<game[i].length; j++) {
                game[i][j]=0;
            }
        }
        return game;
    }//createNewBoard
    
    
    public static void printBoard(int[][] board) {
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }//printBoard
    
    
    public static int[][] playerMove() {
        
    }//playerMove
    
    
    public static boolean winner(int[][] board) {
        int[] win=new int[3];
        
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                switch(board[i][j]) {
                    case 1: win[i]++;
                    case 0: break;
                    case 2: win[]; break;
                }
            }
        }
    }//winner
    
    
    public static int[][] computerMove() {
        
    }//computerMove
    
    
    public static int[][] updateBoard() {
        
    }//updateBoard
    
}//public class