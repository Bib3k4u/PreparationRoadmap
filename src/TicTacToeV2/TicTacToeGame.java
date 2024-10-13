package TicTacToeV2;

import TicTacToe.Model.*;

public class TicTacToeGame {

    private final Board board;
    private PlayingPiece currentPlayer;

    public TicTacToeGame(int size) {
        board = new Board(size);
        currentPlayer = new PlayingPieceX();
    }

    public void switchPlayer() {
        currentPlayer = currentPlayer.getPieceType() == PieceType.X ? new PlayingPieceO() : new PlayingPieceX();
    }
    public void startGame() {
        while (true) {
            board.printBoard();
            int row, col;
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.println("Player " + currentPlayer.getPieceType() + ", enter row and column (0-based index): ");
            row = sc.nextInt();
            col = sc.nextInt();

            if (board.placePiece(row, col, currentPlayer)) {
                if (board.checkWin(row, col, currentPlayer)) {
                    board.printBoard();
                    System.out.println("Player " + currentPlayer.getPieceType() + " wins!");
                    break;
                }

                if (board.isBoardFull()) {
                    board.printBoard();
                    System.out.println("The game is a draw!");
                    break;
                }

                switchPlayer();
            } else {
                System.out.println("Invalid move, try again.");
            }
        }
    }
}
