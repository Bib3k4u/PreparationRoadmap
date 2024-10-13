package TicTacToeV2.Model;

import TicTacToe.Model.PlayingPiece;
import TicTacToe.Model.PlayingPieceX;

public class Player {
    public String name;
    PlayingPiece playingPiece;

    public Player(String name, PlayingPiece playingPiece){
        this.name = name;
        this.playingPiece = playingPiece;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public PlayingPiece getPlayingPiece(){
        return playingPiece;
    }
    public void setPlayingPiece(PlayingPiece playingPiece){
        this.playingPiece = playingPiece;
    }


}
