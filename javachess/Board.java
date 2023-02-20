import java.util.HashMap;
import java.util.Arrays;
import java.util.List;

public class Board {

    // board state attribute
    HashMap<String, List<Object>> board = new HashMap<>();  

    // Board constructor
    public Board() {

        board.put("1", Arrays.asList("X", "O", "X", "O", "X", "O", "X", "O"));
        board.put("2", Arrays.asList("O", "X", "O", "X", "O", "X", "O", "X")                );
        board.put("3", Arrays.asList("X", "O", "X", "O", "X", "O", "X", "O"));
        board.put("4", Arrays.asList("O", "X", "O", "X", "O", "X", "O", "X"));
        board.put("5", Arrays.asList("X", "O", "X", "O", "X", "O", "X", "O"));
        board.put("6", Arrays.asList("O", "X", "O", "X", "O", "X", "O", "X"));
        board.put("7", Arrays.asList("X", "O", "X", "O", "X", "O", "X", "O"));
        board.put("8", Arrays.asList("O", "X", "O", "X", "O", "X", "O", "X"));
        board.put("9", Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
    }

    // displays board
    public void printBoard(){

        // loops through board dictionary
        for (HashMap.Entry<String, List<Object>> entry : board.entrySet()) {
            String key = entry.getKey();
            List<Object> value = entry.getValue();
            
            // checks to see if the loop is on the final row yet
            if (key != "9"){
                System.out.println("");
                System.out.print(key);
                System.out.print("    ");

                // displays board row content
                for (int i = 0; i < value.size(); i++) {
                    Object listValue = value.get(i);
                    if (value.get(i) instanceof String){
                        System.out.print(listValue);
                        System.out.print(" ");
                    }
                    else {
                        // unresolved issue just want to print visual
                        System.out.print(listValue.getClass().getName());
                        System.out.print(" ");
                    }
                }
            }

            // if loop is on final row
            else {
                System.out.println("");
                System.out.println("");
                System.out.print("     ");

                for (int i = 0; i < value.size(); i++) {
                    System.out.print(value.get(i));
                    System.out.print(" ");
                }
            }

        }

    }

    public void newRow(List<Object> row, String rowKey){
        
        board.put(rowKey, row);
    }

}
