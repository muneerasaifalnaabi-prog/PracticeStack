import java.util.Stack;

public class CelebrityFinder {

    static int[][] matrix;

    public static void main(String[] args) {

        // Test 1: Celebrity is person 2
        matrix = new int[][]{
                {0, 1, 1, 1},
                {0, 0, 1, 1},
                {0, 0, 0, 0},
                {0, 0, 1, 0}
        };
        System.out.println("=== Test 1 - Celebrity is person 2 ===");
        displayMatrix();
        System.out.println("Result: " + findCelebrity(matrix.length));
        System.out.println();

        // Test 2: No celebrity
        matrix = new int[][]{
                {0, 1, 0},
                {0, 0, 1},
                {1, 0, 0}
        };
        System.out.println("=== Test 2 - No celebrity ===");
        displayMatrix();
        System.out.println("Result: " + findCelebrity(matrix.length));
        System.out.println();

        // Test 3: Celebrity is person 0
        matrix = new int[][]{
                {0, 0, 0},
                {1, 0, 0},
                {1, 0, 0}
        };
        System.out.println("=== Test 3 - Celebrity is person 0 ===");
        displayMatrix();
        System.out.println("Result: " + findCelebrity(matrix.length));
        System.out.println();

        // Test 4: Single person
        matrix = new int[][]{
                {0}
        };
        System.out.println("=== Test 4 - Single person ===");
        displayMatrix();
        System.out.println("Result: " + findCelebrity(matrix.length));
        System.out.println();

        // Test 5: All know each other
        matrix = new int[][]{
                {0, 1, 1},
                {1, 0, 1},
                {1, 1, 0}
        };
        System.out.println("=== Test 5 - All know each other ===");
        displayMatrix();
        System.out.println("Result: " + findCelebrity(matrix.length));
        System.out.println();
    }

    public static int findCelebrity(int n) {
        Stack<Integer> stack = new Stack<>();

        // push all indices onto stack
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }
        System.out.println("Initial stack: " + stack);

        while (stack.size() >= 2) {
            int a = stack.pop();
            int b = stack.pop();

            if (knows(a, b)) {
                stack.push(b);
                System.out.println(a + " knows " + b + " → eliminate " + a + " | stack: " + stack);
            } else {
                stack.push(a);
                System.out.println(a + " does not know " + b + " → eliminate " + b + " | stack: " + stack);
            }
        }

        int candidate = stack.pop();
        System.out.println("Candidate: " + candidate);

        for (int i = 0; i < n; i++) {
            if (i == candidate) continue;

            if (knows(candidate, i)) {
                System.out.println("Failed: " + candidate + " knows " + i);
                return -1;
            }

            if (!knows(i, candidate)) {
                System.out.println("Failed: " + i + " does not know " + candidate);
                return -1;
            }
        }

        return candidate;
    }

    public static int findCelebrityBruteForce(int n) {
        for (int i = 0; i < n; i++) {
            boolean isCelebrity = true;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                if (knows(i, j) || !knows(j, i)) {
                    isCelebrity = false;
                    break;
                }
            }
            if (isCelebrity) {
                return i;
            }
        }
        return -1;
    }

    public static boolean knows(int a, int b) {
        return matrix[a][b] == 1;
    }

    public static void displayMatrix() {
        int n = matrix.length;
        System.out.print("  ");
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}