import java.util.Random;
import java.util.Scanner;

public class TicTacToeUC6 {
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

        int slot;
        int row, col;

        while (true) {
            slot = getSlotInput();

            if (slot < 1 || slot > 9) {
                System.out.println("Invalid input!");
                continue;
            }

            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

            if (board[row][col] != '-') {
                System.out.println("Slot already taken!");
            } else {
                break;
            }
        }

        char symbol = (currentPlayer.equals("Player 1")) ? player1Symbol : player2Symbol;
        placeMove(board, row, col, symbol);
        
        displayBoard(board);
    }

    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
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
