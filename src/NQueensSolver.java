import java.util.Stack;

public class NQueensSolver {
    //Position class to store row and column
    static class Position {
        int row;
        int col;
        Position(int row, int col) {
            this.row = row;
            this.col = col;
        }

    }
    public static void main(String[] args) {

    }
    public static void solveNQueens(int n) {
        if (n == 0) {
            System.out.println("No board for N=0");
            return;
        }
        Stack<Position> queens = new Stack<>();
        int row = 0;
        int col = 0;
        int solutionCount = 0;
        while (true) {
            boolean found = false;
            while (col < n) {
                Position pos = new Position(row, col);
                if (isSafe(pos, queens)) {
                    found = true;
                    break;
                }
                col++;
        }
            if (found) {

            }


    }


}

    private static boolean isSafe(Position pos, Stack<Position> queens) {
    }
