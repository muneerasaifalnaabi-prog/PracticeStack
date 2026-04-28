import java.util.Stack;

public class ParenthesesValidator {
    public static void main(String[] args) {
        String s1 ="()}}";
        String s2 ="[(Hi)}}]";
        String s3 ="{Java :){}";
        String s4 ="{{()}}";

        System.out.println(s1 +"Is planced ?"+isBalanced(s1));
        System.out.println("-------------------------------");
        System.out.println(s2 +"Is planced ?"+isBalanced(s2));
        System.out.println("-------------------------------");
        System.out.println(s3 +"Is planced ?"+isBalanced(s3));
        System.out.println("-------------------------------");
        System.out.println(s4 +"Is planced ?"+isBalanced(s4));





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
                char top = stack.peek();
                char popped = stack.pop();
                boolean matches = (ch == ')' && popped == '(')
                        || (ch == ']' && popped == '[')
                        || (ch == '}' && popped == '{');

                if (matches) {
                    System.out.println("  POP   '" + popped + "' matched with '" + ch + "'  → stack: " + stack);
                }
                else {
                    System.out.println("  MISMATCH: '" + popped + "' does NOT match '" + ch + "'  → unbalanced!");
                    return false;
                }
                }
        else{
                System.out.println("  SKIP  '" + ch + "'  not a bracket");
            }

        }
        if (!stack.isEmpty()) {
            System.out.println("  Stack NOT empty at end: " + stack + " → unclosed openers!");
            return false;
        }
        return true;

    }
}