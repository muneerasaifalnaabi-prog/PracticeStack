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

        if (expression.isEmpty()){
            System.out.println("Empty String");
            return true;
        }
        for (int i = 0; i < expression.length(); i++) {
            char c= expression.charAt(i);

            if (c == '{' || c == '(' || c == '{') {
                parenthesesValidator.push(String.valueOf(c));
            }
            if (c == '}' || c == ')' || c == '}') {
                parenthesesValidator.push(String.valueOf(c));
            }
            char pop = parenthesesValidator.pop();
            if ((c == ')' && pop != '(') ||
                    (c == '}' && pop != '{') ||
                    (c == ']' && pop != '[')) {
                return false;


            }
        }

    }

     */
}