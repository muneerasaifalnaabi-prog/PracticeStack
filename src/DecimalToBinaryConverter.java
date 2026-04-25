import java.util.Stack;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {

    }
    public static String decimalToBinary(int num) {
        Stack<Integer> stack = new Stack<>();
        String binary = "";
        if (num == 0) {
            return "0";
        }
        while (num != 0) {
            stack.push(num%2);
                num = num / 2;
                if (num<0) {
                    num = num*-1;
                }
        }
        for (int i = 0; i < stack.size(); i++) {
            binary = binary + stack.pop();
        }
        return binary;

    }
    public static void displayConversionProcess(int num) {

    }
}
