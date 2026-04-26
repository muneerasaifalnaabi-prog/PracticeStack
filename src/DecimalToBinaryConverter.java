import java.util.Stack;


public class DecimalToBinaryConverter {

    public static void main(String[] args) {
        int num = 5;
      //  System.out.println(decimalToBinary(num));
       // displayConversionProcess(num);
        String binary ="101110001";
        System.out.println(binaryToDesimal(binary));

        System.out.println("Built-in Verify : " + Integer.toBinaryString(num));
    }

    public static String decimalToBinary(int num) {
        Stack<Integer> stack = new Stack<>();
        String binary = "";

        if (num == 0) {
            return "0";
        }
            //10
        while (num > 0) {
            int reminder = num % 2;//0 //1 //1
            stack.push(reminder);//0 //1 //0 //1
            num = num / 2;//5 //2.5
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
        public static Integer binaryToDesimal(String binary){
        Stack<Integer> stack =new Stack<>();//101
        for (int i=0;i<binary.length();i++){
            stack.push(Character.getNumericValue(binary.charAt(i)));
        }
        int decimal=0;
        int power =0;

        while (!stack.isEmpty()){
            int pop = stack.pop();
            decimal+=pop*Math.pow(2,power);
            power++;
        }
        return decimal;


    }
}