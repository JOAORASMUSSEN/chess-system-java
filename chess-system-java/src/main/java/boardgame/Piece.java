package boardgame;

public class Piece {
    protected Position position; //como é protected pode ser acessada por outras classes do mesmo pacote
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }
}
