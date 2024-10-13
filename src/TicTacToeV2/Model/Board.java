package TicTacToeV2.Model;

import TicTacToe.Model.PlayingPiece;

public class Board {
    private final int size;
    private final PlayingPiece[][] board;

    public Board(int size, PlayingPiece[][] board){
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public boolean placePiece(int row, int col, PlayingPiece piece){
        if(row >= 0 && row < size &&
           col >= 0 && col < size &&
           board[row][col] == null){
            board[row][col] = piece;
            return true;
        }
        return false;
    }

    public boolean checkWin(int row, int col, PlayingPiece piece){
    //check row
        boolean win = true;
        for(int i = 0; i < size; i++){
            if(board[row][i] == null || board[row][i].getPieceType() != piece.getPieceType()) {
                win = false;
                break;
            }
        }
        if(win) return true;

        //check col
        for(int i = 0; i < size; i++){
            if(board[i][col] == null || board[i][col].getPieceType() != piece.getPieceType()) {
                win = false;
                break;
            }
        }
        if(win) return true;

        //check diagonal
        if(row == col){
            win = true;
            for(int i = 0; i < size; i++){
                if(board[i][i] == null || board[i][i].getPieceType() != piece.getPieceType()) {
                    win = false;
                    break;
                }
            }
            if(win) return true;
        }

        if(row+col == size -1){
            win = true;
            for(int i = 0; i < size; i++){
                if(board[i][size-1-i] == null || board[i][size-1-i].getPieceType() != piece.getPieceType()) {
                    win = false;
                    break;
                }
            }
            if(win) return true;
        }

        return false;
    }

    public boolean isBoardFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    return false;
                }
            }
        }
        return true;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    System.out.print("_ ");
                } else {
                    System.out.print(board[i][j].getPieceType() + " ");
                }
            }
            System.out.println();
        }
    }
}
