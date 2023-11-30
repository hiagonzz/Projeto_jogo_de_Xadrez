package boardgame;

public class Position {
    private int row;
    private int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;

    }

    // getters
    public int getColumn() {
        return column;
    }
    public int getRow() {
        return row;
    }

    // Setters 

    public void setColumn(int column) {
        this.column = column;
    }
    public void setRow(int row) {
        this.row = row;
    }
    
    public void setValues(int row, int column){
        this.row = row;
        this.column = column;

    }

    @Override
    public String toString(){
        return  row + ", " + column;
    }

    public Position isThereAnyPossibleMove() {
        return null;
    }
}
