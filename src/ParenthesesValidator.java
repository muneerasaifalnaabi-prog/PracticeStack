import java.util.Stack;

public class ParenthesesValidator {
    public static void main(String[] args) {
        //create stack
        Stack<String> parenthesesValidator = new Stack<>();
        // add elements in Stack using push

        parenthesesValidator.push("{hello})");
        parenthesesValidator.push("[hi])");
        parenthesesValidator.push("(java){]");
        parenthesesValidator.push("{(programming");
        parenthesesValidator.push("{{Muneera}}");


    }
    public static  Boolean  isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        System.out.println("Validating " + expression);

        if (expression.isEmpty()) {
            System.out.println("Empty String");
            return true;
        }
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
                System.out.println("  PUSH  '" + ch + "'  → stack: " + stack);
            }
        else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    System.out.println("  CLOSE '" + ch + "'  → stack empty.");
                    return false;
                }
            }

        }


    }}