import java.util.Stack;

public class ParenthesesValidator {
    public static void main(String[] args) {
        //create stack
        Stack<String > parenthesesValidator = new Stack<>();
        // add elements in Stack using push

        parenthesesValidator.push("{hello})");
        parenthesesValidator.push("[hi])");
        parenthesesValidator.push("(java){]");
        parenthesesValidator.push("{(programming");
        parenthesesValidator.push("{{Muneera}}");











    }
    public static  Boolean  isBalanced(String expression){
        Stack<String > parenthesesValidator = new Stack<>();
        for (int i=0;i<parenthesesValidator.size();i++){
            char c=expression.charAt(i);
            if (parenthesesValidator.isEmpty()){
                return false;
            }
            if (c=='{' || c=='(' || c=='{'){
                parenthesesValidator.push(String.valueOf(c));
            }
            if (c=='}' || c==')' || c=='}'){
                parenthesesValidator.push(String.valueOf(c));
            }



        }
    }

}
