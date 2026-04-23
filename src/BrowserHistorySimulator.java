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

        System.out.println("Display the current page and all pages in history after each visit :" +browserHistorySimulator);









    }

}
