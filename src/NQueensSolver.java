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
            //find a safe column in current row
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
                // Place queen and move to next row
                queens.push(new Position(row, col));
                //Print stack after each placement
                System.out.print("Placed queen at (" + row + "," + col + ")  Stack: ");
                for (Position p : queens) {
                    System.out.print("(" + p.row + "," + p.col + ") ");
                }
                //if all queens placed  solution founde
                if (row == n - 1) {
                    solutionCount++;
                    System.out.println("Solution " + solutionCount + ":");

                    //Backtrack to find next solution
                    Position last = queens.pop();
                    row = last.row;
                    col = last.col + 1;

                } else {
                    // Move to next row
                    row++;
                    col = 0;
                }

            } else {
                // No safe column found → backtrack
                if (queens.isEmpty()) {
                    break;
                }
                Position last = queens.pop();
                row = last.row;
                col = last.col + 1;


            }

            }
        System.out.println("Total Solutions for N=" + n + ": " + solutionCount);
    }





    private static boolean isSafe(Position pos, Stack<Position> queens) {
        for (Position existing : queens) {
            if (existing.col == pos.col) {
                return false;
            }
            if (Math.abs(existing.row - pos.row) == Math.abs(existing.col - pos.col)) {
                return false;
            }
        }
        return true;
    }
    public static void displayBoard(Stack<Position> queens, int n) {
        char[][] board = new char[n][n];

    }

    }

