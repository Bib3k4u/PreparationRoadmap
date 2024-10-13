package TicTacToeRevision;

import java.util.Deque;
import java.util.Scanner;

public class GameController {
    public Board board;
    public TurnManager turnManager;

    GameController(int size, Deque<Player> players){
        board = new Board(size);
        turnManager = new TurnManager(players);
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            board.printBoard();
            Player currentPlayer = turnManager.getNextPlayer();
            System.out.println(currentPlayer.getName() + "'s turn (" + currentPlayer.getSymbol() + "):");

            boolean validMove = false;

            while (!validMove) {
                System.out.println("Enter row and column (between 0 - "+ board.size+") ");
                int row = scanner.nextInt();
                int col = scanner.nextInt();

                if (board.placePiece(row, col, currentPlayer.getSymbol())) {
                    validMove = true; // Exit the loop when the move is valid
                } else {
                    System.out.println("Invalid move, try again.");
                    System.out.println(currentPlayer.getName() + "'s turn (" + currentPlayer.getSymbol() + "):");
                }
            }

            // Check if the current player won or if the game is tied
            if (board.checkWin(currentPlayer.getSymbol())) {
                board.printBoard();
                System.out.println(currentPlayer.getName() + " wins!");
                break;
            }

            if (board.isBoardFull()) {
                board.printBoard();
                System.out.println("It's a tie!");
                break;
            }
        }
    }
}