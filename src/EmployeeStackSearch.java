import java.util.Stack;

public class EmployeeStackSearch {
    public static void main(String[] args) {
        //create new stack

        Stack<String> employeeStackSearch = new Stack<>();
        // add elements in Stack using push
        employeeStackSearch.push("Ishaq");
        employeeStackSearch.push("Fatima");
        employeeStackSearch.push("Ahmed");
        employeeStackSearch.push("Fatima");
        employeeStackSearch.push("Muhammad");
        employeeStackSearch.push("Riham");
        employeeStackSearch.push("Rana");
            //Display all employee
        System.out.println("All Employees :" + employeeStackSearch);
            //search for exit element using search
        employeeStackSearch.search(2);
          //Check if element exit in  Stack
        System.out.println("If employee Fatima exit ? "+ employeeStackSearch.contains("Fatima"));
            //Display all elements using for loop
        System.out.println("Use for loop to display all employees ");
        for (int i=0;i<employeeStackSearch.size();i++) {
            System.out.println("all employees with position :" + i + ": " + employeeStackSearch);
        }
        //Display all element using for each loop
        System.out.println("Use for each loop to display all employees ");

        for (String name:employeeStackSearch){
            System.out.println("All employees :" +employeeStackSearch);

        }
        System.out.println("Use an Iterator to traverse the  employees");

        for (int i=employeeStackSearch.size();i>=0;i--) {

            System.out.println("all traverse employees with position :" + i + ": " + employeeStackSearch);
        }










    }
}
