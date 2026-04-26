import java.util.Stack;

public class QueueUsingTwoStacks<T> {
    // Stacks should be instance variables, not static
    private Stack<T> input = new Stack<>();
    private Stack<T> output = new Stack<>();

    public static void main(String[] args) {
        QueueUsingTwoStacks<Integer> queue = new QueueUsingTwoStacks<>();

        int[] ops = {10, 20, 30, -1, 40, -2, 50, -1, -1, 60, -1, -1};

        for (int op : ops) {
            if (op == -1) {
                if (!queue.isEmpty()) System.out.println("Dequeued: " + queue.dequeue());
            } else if (op == -2) {
                if (!queue.isEmpty()) System.out.println("Peeked: " + queue.peek());
            } else {
                queue.enqueue(op);
            }
            queue.displayStatus();
        }
    }

    public void enqueue(T element) {
        input.push(element);
        System.out.println("Enqueued: " + element);
    }

    public T dequeue() {
        shiftStacks();
        return output.isEmpty() ? null : output.pop();
    }

    public T peek() {
        shiftStacks();
        return output.isEmpty() ? null : output.peek();
    }

    // Helper method to move elements only when output is empty
    private void shiftStacks() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
    }

    public boolean isEmpty() {
        return input.isEmpty() && output.isEmpty();
    }

    public int size() {
        return input.size() + output.size();
    }

    public void displayStatus() {
        System.out.println("Input: " + input + " | Output: " + output);
    }
}