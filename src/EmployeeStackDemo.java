import java.util.Stack;

public class EmployeeStackDemo {
    public static void main(String[] args) {
        Stack<String> employeeStack =new Stack<>();

        employeeStack.push("Ishaq");
        employeeStack.push("Fatima");
        employeeStack.push("Ahmed");
        employeeStack.push("Muhammad");
        employeeStack.push("Riham");

        System.out.println("All Employee :" + employeeStack);

        employeeStack.push("Abdullah");

        System.out.println("All Employees after added employee");






    }
}
