import java.util.Scanner;

public class Game {
    static boolean xTurn = true;
    static String winner = null;
    // static CellStatus cs = new CellStatus();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Board board = new Board();

        System.out.println("Welcome to 3x3 Tic Tac Toe.");
        board.printBoard();

        System.out.println("X will play first. Enter a slot number to place X in:");

        while (winner == null) {
            int numInput;

            numInput = in.nextInt();
            if (!(numInput > 0 && numInput <= 9)) {
                System.out.println("Invalid input; re-enter slot number:");
                continue;
            }


            // This game has two player x and O.
            // Here is the logic to decide the turn
            if (board.board[numInput - 1].isEmpty()) {
                board.insertMove(numInput - 1, xTurn);

                xTurn = !xTurn;

                board.printBoard();
                winner = board.checkWinner();
            } else {
                System.out.println("Slot already taken; re-enter slot number:");
            }

            String turn = xTurn ? "X" : "O";
            System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
        }

        // If no one win or lose from both player x and O.
        // then here is the logic to print "draw".
        if (winner.equalsIgnoreCase("draw")) {
            System.out.println("It's a draw! Thanks for playing.");
        }

        // For winner -to display Congratulations! message.
        else {
            System.out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");
        }
    }
}
