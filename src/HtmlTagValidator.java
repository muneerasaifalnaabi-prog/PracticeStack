import java.util.Stack;

public class HtmlTagValidator {
    public static void main(String[] args) {
        String h1 = "<html><body><p>Hello</p></body></html>";
        String h2 = "<html><body><p>Hello</body></html>";
        String h3 = "<div><p><b>text</b></p></div>";
        validateHtmlTags(h1);
        validateHtmlTags(h2);

    }
    public static boolean validateHtmlTags(String html) {
        Stack<String> stack = new Stack<>();
        // edge case: empty string
        if (html == null || html.isEmpty()) {
            System.out.println("Empty string - no tags to validate");
            return true;
        }
        // loop through each character
        for (int i = 0; i < html.length(); i++) {
            if (html.charAt(i) == '<') {
                int end = -1;
                for (int j = i + 1; j < html.length(); j++) {
                    if (html.charAt(j) == '>') {
                        end = j;
                        break;
                    }
                }

                // edge case
                if (end == -1) {
                    System.out.println("unclosed bracket");
                    return false;
                }
                // extract tag name character by character
                String tagName = "";
                for (int k = i + 1; k < end; k++) {
                    tagName += html.charAt(k);
                }

                // handle self-closing tags
                if (tagName.endsWith("/")) {
                    System.out.println("Self-closing tag: <" + tagName + "> skipped");
                    i = end;
                    continue;
                }

                if (tagName.startsWith("/")) {
                    String closingTag = "";
                    for (int k = 1; k < tagName.length(); k++) {
                        closingTag += tagName.charAt(k);
                    }

                    // edge case
                    if (stack.isEmpty()) {
                        System.out.println("Error: closing tag </" + closingTag + "> has no opening tag");
                        return false;
                    }

                    // peek top tag without removing
                    String top = stack.peek();

                    // check if closing tag matches top of stack
                    if (!top.equals(closingTag)) {
                        System.out.println("Error: expected </" + top + "> but found </" + closingTag + ">");
                        return false;
                    }
                    // pop matched tag
                    stack.pop();
                    System.out.println("Matched  : <" + closingTag + "> -> Stack: " + stack);
                } else {

                    stack.push(tagName);
                    System.out.println("Pushed   : <" + tagName + "> -> Stack: " + stack);
                }
                i = end;
            }
        }

        // edge case
        if (!stack.isEmpty()) {
            System.out.println("Error: unclosed tags remaining: " + stack);
            return false;
        }

        System.out.println("Valid HTML");
        return true;
    }
}