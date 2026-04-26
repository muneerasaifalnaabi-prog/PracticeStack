import java.util.Stack;

public class StringReversalAndPalindrome {
    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();
        //Create 6 String element
        String s1="mom";
        String s2="";
        String s3="s";
        String s4="hello";
        String s5="level";
        String s6="java";
        //test case for s4
        System.out.println("Original String :"+s4);
        System.out.println("Reverse String :"+reverseString(s4));
        System.out.println(isPalindrome(s4));
        //Show stack process :
        for (int i = 0; i<s1.length(); i++) {
            stack.push(s1.charAt(i));
            System.out.println("pushed "+s1.charAt(i)+" to stack");
        }
        for (int i = 0; i<s1.length(); i++) {
            char popped = stack.pop();
            System.out.println("popped "+popped+" from stack");
        }
    }

    public static String reverseString(String s) {
        Stack<Character> stack = new Stack<>();
        //check if empty or null or length ==1
        if (s == null) return null;
        if (s.length() == 0) return "";
        if (s.length() == 1) return s;
        String result = "";
        //push character from string s
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        //added pushed character to result ..reversed string
        for (int i = 0; i < s.length(); i++) {
            result += stack.pop();
        }
        return result;
    }

    public static Boolean isPalindrome(String s) {
        //ignore sensitive case with space
        s=s.toLowerCase().trim();
        //check if isPalindrome
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