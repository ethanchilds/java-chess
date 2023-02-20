import java.util.Scanner;
import java.util.List;

public class Main {

    public static void main(String args[]) {

        Board blankBoard = new Board();
        Board gameState = new Board();

        Team teamWhite = new Team("White", true);
        Team teamBlack = new Team("Black", false);

        gameState.newRow(teamWhite.backRow, "8");
        gameState.newRow(teamWhite.frontRow, "7");
        gameState.newRow(teamBlack.backRow, "1");
        gameState.newRow(teamBlack.frontRow, "2");
        
        Boolean notMate = true;
        Scanner scanner = new Scanner(System.in); 

        while (notMate) {


            if (teamWhite.isTurn) {
                System.out.println("It is team White's turn");
            }
            else {
                System.out.println("It is team Black's turn");
            }

            gameState.printBoard(); 

            System.out.println("");
            System.out.println("");
            System.out.println("What piece would you like to move");
            String move = scanner.nextLine();
            String rowPrev = move.substring(0, 1);
            int columnPrev = Integer.parseInt(move.substring(1));

            Object movePiece = gameState.board.get(rowPrev).get(columnPrev-1);

            System.out.println("Where would you like to move this piece");
            String next = scanner.nextLine();
            String rowNext = next.substring(0, 1);
            int columnNext = Integer.parseInt(next.substring(1));

            List<Object> updateRow = gameState.board.get(rowNext);
            updateRow.set(columnNext, movePiece);
            gameState.board.put(rowNext, updateRow);

            Object replaceValue = blankBoard.board.get(rowPrev).get(columnPrev);
            List<Object> replaceRow = gameState.board.get(rowPrev);
            replaceRow.set(columnPrev, replaceValue);
            gameState.board.put(rowPrev, replaceRow);

            System.out.println("Is game not checkmate? (yes/no)");
            String mate = scanner.nextLine();

            if (mate.equals("yes")){
                notMate = true;
            }
            if (mate.equals("no")) {
                notMate = false;
            }
        }

        scanner.close();

    }
    
}
