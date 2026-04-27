import java.util.Stack;

public class InfixExpressionEvaluator {

    static Stack<Double>    operands  = new Stack<>();
    static Stack<Character> operators = new Stack<>();

    public static void main(String[] args) {

        System.out.println(evaluate("10 % 3"));
        System.out.println(evaluate("3.5 * 2 + 1.5"));
        System.out.println(evaluate("(2 + 3) * (4 - 1)"));
        System.out.println(evaluate("10 / 0"));
        System.out.println(evaluate("-5 + 3"));
        System.out.println(evaluate("(-5 + 3) * 2"));
        System.out.println(evaluate("((2 + 3) * 4) / 2"));
    }

    public static String evaluate(String expression) {
        operands.clear();
        operators.clear();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == ' ') continue;

            // Number → build full number and push
            if (Character.isDigit(ch) || ch == '.') {
                StringBuilder num = new StringBuilder();
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    num.append(expression.charAt(i));
                    i++;
                }
                i--;
                operands.push(Double.parseDouble(num.toString()));
            }

            // Open parenthesis
            else if (ch == '(') {
                operators.push(ch);
            }

            // Close parenthesis → apply until '('
            else if (ch == ')') {
                while (operators.peek() != '(') {
                    double b  = operands.pop();
                    double a  = operands.pop();
                    char   op = operators.pop();
                    operands.push(compute(a, b, op));
                }
                operators.pop();
            }

            // Unary minus → push 0 so it works as 0 - x
            else if (ch == '-' && (i == 0 || expression.charAt(i - 1) == '(')) {
                operands.push(0.0);
                operators.push('-');
            }

            // Operator → apply higher/equal precedence first then push
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^' || ch == '%') {
                while (!operators.isEmpty()
                        && operators.peek() != '('
                        && precedence(operators.peek()) >= precedence(ch)) {
                    double b  = operands.pop();
                    double a  = operands.pop();
                    char   op = operators.pop();
                    operands.push(compute(a, b, op));
                }
                operators.push(ch);
            }
        }

        // Apply remaining operators
        while (!operators.isEmpty()) {
            double b  = operands.pop();
            double a  = operands.pop();
            char   op = operators.pop();
            operands.push(compute(a, b, op));
        }

        return String.valueOf(operands.pop());
    }

    public static double compute(double a, double b, char op) {
        double result = 0;

        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("ERROR: Division by zero!");
                    result = 0;
                } else {
                    result = a / b;
                }
                break;
            case '^':
                result = Math.pow(a, b);
                break;
            case '%':
                result = a % b;
                break;
            default:
                result = 0;
        }

        return result;
    }

    public static int precedence(char op) {
        int result = 0;

        if (op == '+' || op == '-') {
            result = 1;
        } else if (op == '*' || op == '/' || op == '%') {
            result = 2;
        } else if (op == '^') {
            result = 3;
        } else {
            result = 0;
        }

        return result;
    }
}