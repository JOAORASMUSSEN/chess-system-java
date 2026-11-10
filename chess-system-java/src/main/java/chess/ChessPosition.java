package chess;

import boardgame.Position;

public class ChessPosition {
    private char column;
    private int row;

    public ChessPosition(char column, int row) {
        if(column < 'a' || column > 'h' || row < 1 || row > 8){
            throw new ChessException("Error");
        }

        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    protected Position toPosition(){
        return new Position(8 - row, column - 'a');
        //tabuleiro de xadrez é ao contrário em relação com a matriz, isso converte
        //mat_row = 8 - chess_row
        //'a' - 'a' = 0, 'b' - 'a' = 1 ...  -> mat_c =chess _c - 'a'
    }

    protected static ChessPosition fromPosition(Position position){
        return new ChessPosition((char)(position.getColumn() + 'a'), 8 - position.getRow());
    }

    @Override
    public String toString(){
        return "" + column + row;
    }
}
