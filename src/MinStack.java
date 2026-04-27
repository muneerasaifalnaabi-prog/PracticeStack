import java.util.Stack;

public class MinStack {
    static Stack<Integer> mainStack =new Stack<>();
    static Stack<Integer> minStack =new Stack<>();
    public static void main(String[] args) {

    }
    public static void  push(int value){
        mainStack.push(value);
        if (minStack.isEmpty() || value<=minStack.peek()){
            minStack.push(value);
        }
    }
    public static int pop() {
            if (mainStack.isEmpty()) {
                System.out.println("Stack is empty — cannot pop.");
                return -1;
            }
            int popped = mainStack.pop();
            if (popped == minStack.peek()) {
                minStack.pop();
            }
            return popped;
        }
    public static Integer GetMin(){
        return minStack.peek();
    }
    public static void display() {

    }


}
