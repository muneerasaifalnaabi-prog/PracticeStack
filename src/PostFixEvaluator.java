import java.util.Stack;

public class PostFixEvaluator {
    public static void main(String[] args) {


    }
    public static Integer evaluatePostfix(String expression){
        Stack<Integer> stack=new Stack<>();
        for (int i=0 ;i<expression.length();i++){
            char c =expression.charAt(i);

            if (Character.isDigit(c)){
                stack.push(Integer.parseInt(c));
            }
        }



    }
}
