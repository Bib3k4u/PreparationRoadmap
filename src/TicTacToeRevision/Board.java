package TicTacToeRevision;

public class Board {
    char[][] board;
    int size;

    Board(int size){
        this.size = size;
        board = new char[size][size];
        initilizeBoard();
    }

    public void initilizeBoard(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                board[i][j] = '-';
            }
        }
    }
    public boolean placePiece(int row, int col , char symbol){
        if(row >= 0 && row < size &&
           col >= 0 && col < size &&
           board[row][col]=='-'){
            board[row][col] = symbol;
            return true;
        }
        return false;
    }

    public boolean checkWin(char symbol){
        return (checkRows(symbol) || checkCols(symbol) || checkDiagonals(symbol));
    }

    public boolean checkRows(char symbol){
        for(int i = 0; i < size; i++){
            boolean win = true;
            for(int j = 0; j < size; j++){
                if(board[i][j] != symbol){
                    win = false;
                    break;
                }
            }
            if(win) return true;
        }
        return false;
    }

    public boolean checkCols(char symbol){
        for(int i = 0; i < size; i++){
            boolean win = true;
            for(int j = 0; j < size; j++){
                if(board[j][i] != symbol){
                    win = false;
                    break;
                }
            }
            if(win) return true;
        }
        return false;
    }

    public boolean checkDiagonals(char symbol){
        boolean d1 = true, d2 = true;
        for(int i = 0; i < size; i++){
            if(board[i][i] != symbol) d1= false;
            if(board[i][size-i-1] != symbol) d2 = false;
        }
        return (d1 || d2);
    }

    public boolean isBoardFull(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(board[i][j] == '-') return false;
            }
        }
        return true;
    }

    public void printBoard(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

}
