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
        //Show stack procces :
        for (int i = 0; i<s1.length(); i++) {
            stack.push(s1.charAt(i));
            System.out.println("pushed "+s1.charAt(i)+" to stack");
        }
        for (int i = 0; i<s1.length(); i++) {
            stack.pop();
            System.out.println("poped "+s1.charAt(i)+" from stack");

        }


    }
    public static String reverseString(String s) {
        Stack<Character> stack = new Stack<>();
        //check if empty or null or length ==1
        if (s.length() == 0) return "";
        if (s.length() == 1) return s;
        if (s==null) return null;
        String result = "";
        //push characther from sting s
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));

        }
        for (int i = 0; i < s.length(); i++) {
            result += stack.pop();
        }

        return result;
    }
    public static Boolean isPalindrome(String s) {
        //ignore sensetive case with space
        s=s.toLowerCase().trim();

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
