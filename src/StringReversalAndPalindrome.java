import java.util.Stack;

public class StringReversalAndPalindrome {
    public static void main(String[] args) {
        String s1="mom";
        String s2="dad";
        String s3="abcd";
        String s4="hello";
        String s5="level";
        String s6="java";
        System.out.println("Original String :"+s3);
        System.out.println("Reverse String :"+reverseString(s3));
        System.out.println(isPalindrome(s3));

    }
    public static String reverseString(String s) {
        Stack<Character> stack = new Stack<>();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));

        }
        for (int i = 0; i < s.length(); i++) {
            result += stack.pop();
        }

        return result;
    }
    public static Boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
