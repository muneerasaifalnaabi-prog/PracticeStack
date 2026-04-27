import java.util.Stack;

public class InfixExpressionEvaluator {
    static Stack<Double> operandStack =new Stack<>();
    static Stack<Character> operatorStack =new Stack<>();
    public static void main(String[] args) {


    }
    public static String evaluate(String expression) {
        for (int i=0 ;i<expression.length();i++){
            char c =expression.charAt(i);
            if (c == ' ') {
                continue;;
            }
            if (Character.isDigit(c) ){
                StringBuilder num = new StringBuilder();

            }
        }

    }

}
