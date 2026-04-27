import java.util.Stack;

public class StackSorter {
    public static void main(String[] args) {
        System.out.println("===== Test 1: Normal Unsorted =====");
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(3);
        stack1.push(1);
        stack1.push(4);
        stack1.push(1);
        stack1.push(5);
        System.out.println("Before :");
        displayStack( stack1);
        sortStack(stack1);
        displayStack(stack1);
        System.out.println();


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
        if (stack.isEmpty()) return;
        int top = stack.pop();
        sortStackRecursive(stack);
        insertInSortedOrder(stack, top);

    }

    private static void insertInSortedOrder(Stack<Integer> stack, int top) {
        if (stack.isEmpty() || top >= stack.peek()) {
            stack.push(top);
            return;
        }
        int value = stack.pop();
        insertInSortedOrder(stack, top);
        stack.push(top);
    }
    public static void displayStack(Stack<Integer> stack) {
        System.out.println( stack);
    }

}
