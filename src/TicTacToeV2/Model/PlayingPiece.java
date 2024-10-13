package TicTacToeV2.Model;

import TicTacToeV2.Model.PieceType;

public class PlayingPiece {
    PieceType pieceType;
    public PlayingPiece(PieceType pieceType ){
        this.pieceType = pieceType;
    }

    public PieceType getPieceType(){
        return pieceType;
    }
}
