import java.util.Stack;

public class PostFixEvaluator {
    public static void main(String[] args) {


    }
    public static Integer evaluatePostfix(String expression){
        Stack<Integer> stack=new Stack<>();
        //Edge Case
        if (expression == null || expression.isEmpty()) {
            System.out.println("Empty expression");
            return null;
        }
        if (stack.size() < 2) {
            System.out.println("Invalid expression");
            return null;
        }
        for (int i=0 ;i<expression.length();i++){
            char c =expression.charAt(i);

            if (Character.isDigit(c)){
                stack.push(Character.getNumericValue(c));
            }
            else {
                int operand1 =stack.pop();
                int operand2 =stack.pop();

                switch (c){
                    case '+':
                        stack.push(operand1+operand2);
                        break;
                    case '-':
                        stack.push(operand1-operand2);
                        break;
                    case '*':
                        stack.push(operand1*operand2);
                        break;
                    case '/':
                        if (operand1==0){
                            System.out.println("Division by Zero ");
                            return null;
                        }
                        stack.push(operand1/operand2);
                        break;
                    case '%':
                        stack.push(operand2 % operand1);
                        break;
                    default:
                        System.out.println("Invalid operator ");
                        stack.clear();
                        return null;



                }
            }
        }
        return stack.pop();

    }
}
