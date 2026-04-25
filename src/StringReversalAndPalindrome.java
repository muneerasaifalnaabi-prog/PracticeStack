import java.util.Stack;

public class StringReversalAndPalindrome {
    public static void main(String[] args) {
        //create Stack Store characther
        Stack<Character> stack = new Stack<>();


    }
    public static String reverseString(String s) {
        Stack<Character> stack = new Stack<>();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
            result += stack.peek();
            stack.pop();

        }

       result += stack.peek();
        return result;
    }
}
