import java.util.Stack;

public class StockSpanCalculator {
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] spans = calculateSpan(prices);
        StockSpanCalculator calculator = new StockSpanCalculator();



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
    public int[] calculateSpanBruteForce(int[] prices) {
        int[] spans = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            int count = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (prices[j] <= prices[i]) count++;
                else break;
            }
            spans[i] = count;
        }
        return spans;

    }
    public void displayResults(int[] prices, int[] spans) {
        System.out.println("Day Price Span");
        System.out.println("--- ----- ----");
        int maxSpan = 0, totalSpan = 0;
        for (int i = 0; i < prices.length; i++) {
            System.out.println(i + "  " + prices[i] + "  " + spans[i]);
            if (spans[i] > maxSpan) maxSpan = spans[i];
            totalSpan += spans[i];
        }
        System.out.println("Max span: " + maxSpan);
        if (prices.length > 0) {
            System.out.println("Avg span: " + (totalSpan * 1.0 / prices.length));
        }
    }
    // Simple visualization
    public void visualizeSpans(int[] prices, int[] spans) {
        for (int i = 0; i < prices.length; i++) {
            String bar = "||||".repeat(spans[i]);
            System.out.println(i + ": " + bar + " (" + spans[i] + ")");
        }
    }


    }

