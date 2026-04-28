import java.util.Random;

public class TicTacToeUC7 {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    static char computerSymbol = 'O';

  
    public static void main(String[] args) {
        computerMove();
        displayBoard();
    }

  
    static void computerMove() {
        Random rand = new Random();
        boolean movePlaced = false;

        System.out.println("Computer's turn...");

        while (!movePlaced) {
           
            int slot = rand.nextInt(9) + 1; 

           
            if (isMoveValid(slot)) {
                placeMove(slot, computerSymbol);
                System.out.println("Computer placed " + computerSymbol + " in slot " + slot);
                movePlaced = true;
            }
        }
    }

  
    static boolean isMoveValid(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return board[row][col] == '-';
    }

   
    static void placeMove(int slot, char symbol) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        board[row][col] = symbol;
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
