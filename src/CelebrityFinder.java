import java.util.ArrayList;
import java.util.Stack;

public class CelebrityFinder {
    static ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
    public static void main(String[] args) {

    }
    public static Boolean knows(int a ,int b){
        return matrix.get(a).get(b)==1;
    }



    public static int findCelebrity(int n ){
        Stack<Integer> stack =new Stack<>();

        //push all indices onto stack
        for (int i=0;i<n;i++){
            stack.push(n);
        }
        System.out.println("Initial stack: " + stack);

        while (stack.size() >= 2) {
            int a = stack.pop();
            int b = stack.pop();

    }


}
