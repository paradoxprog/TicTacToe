import java.util.Scanner;
import java.util.Random;

public class TicTacToeUC8 {

    static char[][] board = {
        {'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'}
    };
    
  
    static boolean isHumanTurn = true; 
    static boolean gameOver = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to TicTacToe!");
        displayBoard();

      
        while (!gameOver) {
            if (isHumanTurn) {
                humanMove(sc);
            } else {
                computerMove();
            }

            displayBoard();
            
           
            checkGameState();

            isHumanTurn = !isHumanTurn; 
        }
        sc.close();
    }

   
    
    static void checkGameState() {
       
    }

    static void displayBoard() {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
    
    
}
