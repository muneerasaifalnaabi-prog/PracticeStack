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
                System.out.println("  height=" + h + "  width=" + width + "  area=" + area);
                if (area > maxArea) {
                    maxArea = area;
                }
            }
            stack.push(i);
        }
        return maxArea;
        }
    public static int calculateArea(int[] heights, int start, int end, int height) {
        int width = end - start + 1;
        return width * height;
    }
    public static int bruteForceLargestRectangle(int[] heights) {
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int minHeight = heights[i];
            for (int j = i; j < heights.length; j++) {
                if (heights[j] < minHeight) {
                    minHeight = heights[j];
                }
                int area = minHeight * (j - i + 1);
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }

        return maxArea;
    }
    public static void displayHistogram(int[] heights) {
        //find max
        int maxHeight = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
            }
        }
        for (int i = 0; i < heights.length; i++) {
            System.out.print(" " + heights[i] + " ");
        }

    }

}
