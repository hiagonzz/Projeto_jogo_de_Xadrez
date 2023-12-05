package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

    private Color color;
    private int moveCount;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    // Getter
    public Color getColor() {
        return color;
    }
    public int getMoveCount(){
        return  moveCount;
    }

    public void increaseMoveCount(){
        moveCount++;
    }
     public void decreaseMoveCount(){
        moveCount--;
    }

    public ChessPosition getChessPosition(){
        return ChessPosition.fromPosition(position);
    }

    // Setter
    public void setColor(Color color) {
        this.color = color;
    }

    protected boolean isThereOppentPiece(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;

    }
}