import java.util.Stack;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {

    }

    public static int findLargestRectangle(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        if (heights.length == 0) {
            return 0;
        }
        for (int i = 0; i <= heights.length; i++) {
            int currentHeight = (i == heights.length) ? 0 : heights[i];
            while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
                int h = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                int area  = h * width;
            }
        }




        }

}
