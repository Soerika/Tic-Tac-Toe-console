import java.util.*;

public class Board {
    static int SIZE = 9;
    public Cell board[];
    Board() {
         board = new Cell[SIZE];
         for(int i = 0; i < SIZE; i++) {
             if(board[i] == null) {
                 board[i] = new Cell();
             }
         }
    }

    void insertMove(int position, boolean xMove) {
        if(xMove) {
            this.board[position].setStatus(CellStatus.X);
        } else {
            this.board[position].setStatus(CellStatus.O);
        }
    }

    // CheckWinner method will
    // decide the combination
    // of three box given below.
    String checkWinner() {
        for (int a = 0; a < 8; a++) {
            String line = null;

            switch (a) {
                case 0:
                    line = board[0].status.getState() + board[1].status.getState() + board[2].status.getState();
                    break;
                case 1:
                    line = board[3].status.getState() + board[4].status.getState() + board[5].status.getState();
                    break;
                case 2:
                    line = board[6].status.getState() + board[7].status.getState() + board[8].status.getState();
                    break;
                case 3:
                    line = board[0].status.getState() + board[3].status.getState() + board[6].status.getState();
                    break;
                case 4:
                    line = board[1].status.getState() + board[4].status.getState() + board[7].status.getState();
                    break;
                case 5:
                    line = board[2].status.getState() + board[5].status.getState() + board[8].status.getState();
                    break;
                case 6:
                    line = board[0].status.getState() + board[4].status.getState() + board[8].status.getState();
                    break;
                case 7:
                    line = board[2].status.getState() + board[4].status.getState() + board[6].status.getState();
                    break;
            }
            //For X winner
            if (line.equals("XXX")) {
                return "X";
            }

            // For O winner
            else if (line.equals("OOO")) {
                return "O";
            }
        }

        for (int a = 0; a < 9; a++) {
            if (board[a].isEmpty()) {
                break;
            } else if (a == 8) {
                return "draw";
            }
        }

        // To enter the X Or O at the exact place on board.
        return null;
    }

    void printBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0].status.getState() + " | "
                + board[1].status.getState() + " | " + board[2].status.getState()
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3].status.getState() + " | "
                + board[4].status.getState() + " | " + board[5].status.getState()
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6].status.getState() + " | "
                + board[7].status.getState() + " | " + board[8].status.getState()
                + " |");
        System.out.println("|---|---|---|");
    }
}
