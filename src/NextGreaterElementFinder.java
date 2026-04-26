import java.util.Stack;

public class NextGreaterElementFinder {
    public static void main(String[] args) {

    }
    public static int[] findNextGreaterElement(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        // While current element is greater than what the top index holds,
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] > stack.peek()) {
                int pop = stack.pop();
                result[pop] = arr[i];
            }
            stack.push(i);//push current index
        }
        stack.clear();   // clear() when done
        return result;

    }
    public static int[] findNextGreaterElementCircular(int[] arr) {
        int[] result = new int[arr.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 2 * arr.length; i++) {
            int cur = arr[i % arr.length];     // modulo wraps index around

            while (!stack.isEmpty() && cur > arr[stack.peek()]) {
                int pop = stack.pop();
                result[pop] = cur;
            }

            // Only push real indices during the first pass (i < n)
            if (i < arr.length) stack.push(i);
        }

        stack.clear();
        return result;
    }
    public static int[] findNextSmallerElement(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        // While current element is greater than what the top index holds,
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                int pop = stack.pop();
                result[pop] = arr[i];
            }
            stack.push(i);//push current index
        }
        stack.clear();   // clear() when done
        return result;
    }
    public static int[] findNextGreaterBruteForce(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = -1;  // assume no NGE

            // Scan every element to the right of i
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    result[i] = arr[j];  // first greater found
                    break;
                }
            }
        }
        return result;
    }
    static void showResults(int[] arr, int[] result, String label) {
        System.out.print(label + ": ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "→" + result[i] + "  ");
        System.out.println();
    }

}

}
