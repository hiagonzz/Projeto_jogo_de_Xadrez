package chess;

import boardgame.Board;
import boardgame.Piece;

public abstract class ChessPiece extends Piece{

    private Color color;




    public ChessPiece(Board board , Color color) {
        super(board);
        this.color= color;
    }
    
    //Getter
    public Color getColor() {
        return color;
    }
    //Setter
    public void setColor(Color color) {
        this.color = color;
    }
}