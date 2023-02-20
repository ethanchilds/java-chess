import java.util.Arrays;
import java.util.List;

public class Team {

    String color = "";
    Boolean isTurn = true;
    List<Object> backRow = Arrays.asList("");
    List<Object> frontRow = Arrays.asList("");

    public Team(String teamColor, Boolean turn) {
        color = teamColor;
        isTurn = turn;

        King king = new King(color);
        Queen queen = new Queen(color);
        
        Rook rook1 = new Rook(color);
        Rook rook2 = new Rook(color);

        Knight knight1 = new Knight(color);
        Knight knight2 = new Knight(color);

        Bishop bishop1 = new Bishop(color);
        Bishop bishop2 = new Bishop(color);

        backRow = Arrays.asList(rook1,knight1,bishop1,queen,
                                king,bishop2,knight2,rook2);

        Pawn pawn1 = new Pawn(color);
        Pawn pawn2 = new Pawn(color);
        Pawn pawn3 = new Pawn(color);
        Pawn pawn4 = new Pawn(color);
        Pawn pawn5 = new Pawn(color);
        Pawn pawn6 = new Pawn(color);
        Pawn pawn7 = new Pawn(color);
        Pawn pawn8 = new Pawn(color);

        frontRow = Arrays.asList(pawn1,pawn2,pawn3,pawn4,
                                pawn5,pawn6,pawn7,pawn8);

                        
    }

    public void changeTurn(Boolean turn) {
        this.isTurn = turn;
    }
    
}
