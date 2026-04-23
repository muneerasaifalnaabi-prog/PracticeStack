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
        int searchResult = employeeStackSearch.search("Ahmed"); // search by name
        System.out.println("Position of Ahmed from top: " + searchResult);
        //Check if element exit in  Stack
        System.out.println("If employee Fatima exit ? " + employeeStackSearch.contains("Fatima"));
        //Display all elements using for loop
        System.out.println("Use for loop to display all employees ");
        for (int i = 0; i < employeeStackSearch.size(); i++) {
            System.out.println("  Position " + i + ": " + employeeStackSearch.get(i));
            //Display all element using for each loop
        }
            System.out.println("Use for each loop to display all employees ");

            for (String name : employeeStackSearch) {
                System.out.println("All employees :" + name);

            }
            //traverse all element
            System.out.println("Use an Iterator to traverse the  employees");

            for (int j = employeeStackSearch.size() - 1; j >= 0; j--) {
                System.out.println("  Position " + j + ": " + employeeStackSearch.get(j));
            }


        }
    }

