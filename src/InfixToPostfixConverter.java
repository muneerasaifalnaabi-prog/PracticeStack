import java.util.Stack;

public class InfixToPostfixConverter {
    public static void main(String[] args) {
        String e1 = "3 + 4";
        String e2 = "3 + 4 * 2";
        String e3 = "2 ^ 3 + 1";
        System.out.println(infixToPostfix(e1));
        System.out.println(infixToPostfix(e2));
        System.out.println(infixToPostfix(e3));


    }
    public static int getPrecedence(char op) {
        if (op == '^')                           return 3;
        if (op == '*' || op == '/' || op == '%') return 2;
        if (op == '+' || op == '-')              return 1;
        return 0;
    }
    public static String infixToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        String postfix="";
        //edge case :if empty or null
        if (infix==null || infix.isEmpty()){
            System.out.println("Empty Expression ");
            return null;
        }
        //loop through each character
        for (int i=0;i<infix.length();i++){
            char c =infix.charAt(i);

            if (c==' '){
                continue;
            }
            if (Character.isDigit(c)){
                postfix+=c +"";
            }
            else if (c=='('){
                stack.push(c);

            }
            else if (c == ')') {
            while (!stack.isEmpty() && stack.peek() != '(') {
                postfix += stack.pop() + " ";
            }
                // pop the open parenthesis
                if (!stack.isEmpty()) {
                    stack.pop();
                }
        }
            else {
                if (stack.size() < 0) {
                    System.out.println("Invalid expression");
                    return null;
                }
                while (!stack.isEmpty() && stack.peek() != '(' &&
                        getPrecedence(stack.peek()) >= getPrecedence(c)) {
                    postfix += stack.pop() + " ";
                }
                stack.push(c);
            }}
        while (!stack.isEmpty()) {
            postfix += stack.pop() + " ";
        }

        return postfix.trim();
    }


}

