import java.util.Stack;

public class InfixToPostfixConverter {
    public static void main(String[] args) {


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
                continue;;
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
        }




    }
}
