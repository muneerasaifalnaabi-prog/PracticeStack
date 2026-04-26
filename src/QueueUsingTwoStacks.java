import java.util.Stack;

public class QueueUsingTwoStacks {
     static Stack<T> input =new Stack<>();
    static Stack<T> output =new Stack<>();
    public static void main(String[] args) {


    }
    public <T> void enqueue(T element){
        input.push(element);
        System.out.println("Enqueued: " + element);

    }
    public <T> T dequeue() {
        if (input.isEmpty()) {

        }
        return output.pop();
    }
    public static boolean isEmpty() {
        return input.isEmpty() && output.isEmpty();
    }
    public static int size() {
        return input.size() + output.size();
    }


    }
}
