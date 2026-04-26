import java.util.Stack;


public class DecimalToBinaryConverter {

    public static void main(String[] args) {
        int num = 5;
        System.out.println(decimalToBinary(num));
        displayConversionProcess(num);
    }

    public static String decimalToBinary(int num) {
        Stack<Integer> stack = new Stack<>();
        String binary = "";

        if (num == 0) {
            return "0";
        }

        while (num > 0) {
            int reminder = num % 2;
            stack.push(reminder);
            num = num / 2;
        }


        while (!stack.isEmpty()) {
            binary = binary + stack.pop();
        }

        return binary;
    }

    public static void displayConversionProcess(int num) {
        if (num == 0) {
            System.out.println("Special case" + num);
            return;
        }


        if (num < 0) {
            num = num * -1;
        }

        Stack<Integer> stack = new Stack<>();
        System.out.println("Conversion process step for " + num + ":");

        while (num != 0) {
            System.out.println("Reminder :" + stack.push(num % 2));
            System.out.println("Quotient :" + num / 2);
            num = num / 2;
        }
    }
}