import java.util.Stack;

public class PostFixEvaluator {
    public static void main(String[] args) {

        //expression
        String e1 = "3 4 +";
        String e2 = "5 1 2 + 4 * +";
        String e3 = "55+54";
        String e4 = "6 3 -";
        String e5 = "7 2 %";
        String e6 = "2 3 * 4 +";
            //show result
        System.out.println("result :");
        System.out.println(evaluatePostfix(e1));
        System.out.println(evaluatePostfix(e2));
        System.out.println(evaluatePostfix(e3));
        System.out.println(evaluatePostfix(e4));
        System.out.println(evaluatePostfix(e5));
        System.out.println(evaluatePostfix(e6));
    }

    public static Integer evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        // Edge case: empty or null
        if (expression == null || expression.isEmpty()) {
            System.out.println("Empty expression");
            return null;
        }


                //push operator in stack
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);


            if (c == ' ') {
                continue;
            }

            if (Character.isDigit(c)) {
                stack.push(Character.getNumericValue(c));
            } else {


                if (stack.size() < 2) {
                    System.out.println("Invalid expression");
                    return null;
                }
                    //pop operand
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                //  use multiple operator
                switch (c) {
                    case '+':
                        stack.push(operand2 + operand1);
                        break;
                    case '-':
                        stack.push(operand2 - operand1);
                        break;
                    case '*':
                        stack.push(operand2 * operand1);
                        break;
                    case '/':
                        if (operand1 == 0) {
                            System.out.println("Division by Zero");
                            return null;
                        }
                        stack.push(operand2 / operand1);
                        break;
                    case '%':
                        stack.push(operand2 % operand1);
                        break;
                    default:
                        System.out.println("Invalid operator");
                        stack.clear();
                        return null;
                }
            }
        }
        return stack.pop();
    }
}