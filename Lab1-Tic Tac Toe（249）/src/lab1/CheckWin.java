package lab1;

public class CheckWin {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide moves as a single string in args[0]");
            return;
        }

        String input = args[0];
        int[] moves = new int[input.length()];

        for (int i = 0; i < input.length(); i++) {
            moves[i] = Character.getNumericValue(input.charAt(i));
        }

        String result = determineWinner(moves);
        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("No win condition found");
        }
    }

    public static String determineWinner(int[] moves) {
        char[] board = new char[9];

        for (int i = 0; i < 9; i++) {
            board[i] = ' ';
        }

        for (int i = 0; i < moves.length; i++) {
            board[moves[i]] = (i % 2 == 0) ? 'X' : 'O';
            String result = checkWin(board);
            if (result != null) {
                return result;
            }
        }
        return null;
    }

    public static String checkWin(char[] board) {
       
        for (int i = 0; i < 9; i += 3) {
            if (board[i] != ' ' && board[i] == board[i + 1] && board[i] == board[i + 2]) {
                return board[i] + " wins on a row";
            }
        }

       
        for (int i = 0; i < 3; i++) {
            if (board[i] != ' ' && board[i] == board[i + 3] && board[i] == board[i + 6]) {
                return board[i] + " wins on a column";
            }
        }

       
        if (board[0] != ' ' && board[0] == board[4] && board[0] == board[8]) {
            return board[0] + " wins on a diagonal";
        }
        if (board[2] != ' ' && board[2] == board[4] && board[2] == board[6]) {
            return board[2] + " wins on a diagonal";
        }

        return null; 
    }
}