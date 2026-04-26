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



    }
}
