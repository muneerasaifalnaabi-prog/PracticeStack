import java.util.Stack;

public class StockSpanCalculator {
    public static void main(String[] args) {

    }
    // Simple O(n) stack method
    public static int[] calculateSpan(int[] prices) {
        int[] span = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            // Remove previous smaller prices
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }
            // Calculate span
            if (stack.isEmpty()) {
                span[i] = i + 1;
            }
            else {
                span[i] = i - stack.peek();
            }

            stack.push(i);
        }
        return span;
        }
}
