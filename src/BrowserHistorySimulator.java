import java.util.Stack;

public class BrowserHistorySimulator {
    public static void main(String[] args) {
        //Create a Stack
        Stack<String> browserHistorySimulator = new Stack<>();
        // add elements in Stack using push
        browserHistorySimulator.push("https://www.github.com");
        browserHistorySimulator.push("https://www.google.com");
        browserHistorySimulator.push("https://www.youtube.com");
        browserHistorySimulator.push("https://www.Linkedin.com");
        browserHistorySimulator.push("https://www.Instgram.com");
            //display all element
        System.out.println("Display the current page and all pages in history after each visit :" +browserHistorySimulator);
            //using pop to back
        System.out.println("Back 2 ");
        System.out.println(browserHistorySimulator.pop());
        System.out.println(browserHistorySimulator.pop());

// Displayed element after pop
        System.out.println("Display the current page and all pages in history after each visit :" +browserHistorySimulator);
//peek the to element
        System.out.println("peek the top URL:" +browserHistorySimulator);

        // Check if the history is empty at different points

        System.out.println("Is empty? "+ browserHistorySimulator.isEmpty());


















    }

}
