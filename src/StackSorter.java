import java.util.Stack;

public class StackSorter {
    public static void main(String[] args) {

    }
    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()) {
            //pick the top element
            int curr=stack.pop();
            //move element from temp to back to original stack if it greater than current  value
            while (!temp.isEmpty() && temp.peek() > curr) {
                stack.push(temp.pop());
            }
            temp.push(curr);

        }
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }

    }
    public static void sortStackRecursive(Stack<Integer> stack) {

    }
}
