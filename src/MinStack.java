import java.util.Stack;

public class MinStack {
    static Stack<Integer> mainStack =new Stack<>();
    static Stack<Integer> minStack =new Stack<>();
    public static void main(String[] args) {

    }
    public static void  push(int value){
        mainStack.push(value);
        if (mainStack.isEmpty() || value<=minStack.peek()){
            minStack.push(value);
        }
    }
    public static void pop(int value){
       int pop= mainStack.pop();
        if (pop ==minStack.peek()){
            minStack.pop();
        }
    }
    public static Integer GetMin(){
        return minStack.peek();
    }
    public static void display() {

    }


}
