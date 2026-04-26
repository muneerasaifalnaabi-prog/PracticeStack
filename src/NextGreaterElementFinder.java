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
}
