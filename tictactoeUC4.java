import java.util.Random;
import java.util.Scanner;

public class tictactoeUC4 {
    static char player1Symbol;
    static char player2Symbol;
    static String currentPlayer;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        performToss();
        displayBoard(board);

        int slot = getSlotInput();
        
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        System.out.println("Slot " + slot + " maps to: Row " + row + ", Column " + col);
    }

    public static int getSlotInput() {
        System.out.print(currentPlayer + ", enter a slot (1-9): ");
        return scanner.nextInt();
    }

    public static void performToss() {
        Random random = new Random();
        int toss = random.nextInt(2);

        if (toss == 0) {
            currentPlayer = "Player 1";
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = "Player 2";
            player1Symbol = 'X';
            player2Symbol = 'O';
        }

        System.out.println("Toss Result: " + currentPlayer + " starts first.");
        System.out.println("---------------------------");
    }

    public static void displayBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
