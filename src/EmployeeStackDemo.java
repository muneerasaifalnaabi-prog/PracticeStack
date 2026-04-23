import java.util.Stack;

public class EmployeeStackDemo {
    public static void main(String[] args) {
        //Create a Stack
        Stack<String> employeeStack =new Stack<>();
        //push 5 element to stack
        employeeStack.push("Ishaq");
        employeeStack.push("Fatima");
        employeeStack.push("Ahmed");
        employeeStack.push("Muhammad");
        employeeStack.push("Riham");
        //display all element in the stack

        System.out.println("All Employee :" + employeeStack);
            // add one more element to stack
        employeeStack.push("Abdullah");
        //display all elements in stack after added one more
        System.out.println("All Employees after added employee");






    }
}
