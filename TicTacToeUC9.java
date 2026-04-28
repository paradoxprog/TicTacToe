
public class TicTacToeUC9 {

    static char[][] board = new char;

    public static void main(String[] args) {
        
        System.out.println(hasWon('X'));
    }

   
    static boolean hasWon(char symbol) {
        
        for (int i = 0; i < 3; i++) {
            if (board[i] == symbol && board[i] == symbol && board[i] == symbol) {
                return true;
            }
        }

     
        for (int j = 0; j < 3; j++) {
            if (board[j] == symbol && board[j] == symbol && board[j] == symbol) {
                return true;
            }
        }

      
        if (board == symbol && board == symbol && board == symbol) {
            return true;
        }
        if (board == symbol && board == symbol && board == symbol) {
            return true;
        }

        return false;
    }
}
