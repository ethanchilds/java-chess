abstract class Piece {
    String visual = " ";
    String name = "";
    String team = "";

}

class Pawn extends Piece {

    public Pawn(String teamChoice) {
        visual = "P";
        name = "Pawn";
        team = teamChoice;

    }
}

class King extends Piece {

    public King(String teamChoice) {
        visual = "K";
        name = "King";
        team = teamChoice;

    }
}

class Queen extends Piece {

    public Queen(String teamChoice) {
        visual = "Q";
        name = "Queen";
        team = teamChoice;

    }
}

class Knight extends Piece {

    public Knight(String teamChoice) {
        visual = "k";
        name = "Knight";
        team = teamChoice;

    }
}

class Rook extends Piece {

    public Rook(String teamChoice) {
        visual = "R";
        name = "Rook";
        team = teamChoice;
    }
}

class Bishop extends Piece {

    public Bishop(String teamChoice) {
        visual = "B";
        name = "Bishop";
        team = teamChoice;
    }
}


