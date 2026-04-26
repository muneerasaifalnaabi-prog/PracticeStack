import java.util.Stack;

public class BrowserNavigationSystem {
    static Stack<String> back=new Stack<>();
    static Stack<String> forward=new Stack<>();
    static String currentPage="";
    static int  max=10;
    public static void main(String[] args) {

        visitPage("Codline.om");
        visitPage("linkedIn.com");
        visitPage("gitHub.com");
        visitPage("z.com");
        visitPage("reddit.com");

        goBack();
        goBack();
        goForward();
        visitPage("stackoverflow.com");


    }
    static  void visitPage(String url){
        //limit back history to max only
        if (back.size()>=max){
            System.out.println("History limit reached ");
            back.remove(0);

        }
        if (!currentPage.isEmpty()){
            back.push(currentPage);

        }
        //clear forwared stack when visiting new pages
        forward.clear();
        //set new cuurent page
        currentPage = url;
        System.out.println("Visited  : " + url);


    }
    public static void goBack(){
        // edge case when  nothing to go back to
        if (back.isEmpty()) {
            System.out.println("Cannot go back - no history");
            return;
        }
        forward.push(currentPage);
        currentPage = back.pop();
        System.out.println("Go Back  : " + currentPage);

    }
    // go forward to next page
    static void goForward() {
        //edge case when  nothing to go forward to
        if (forward.isEmpty()) {
            System.out.println("Cannot go forward - no forward history");

        }
         // push current page to back stack
        back.push(currentPage);
         // pop last page
        currentPage = forward.pop();
        currentPage = forward.pop();
        System.out.println("Go Forward : " + currentPage);

    }
    public static void showCurrentPage() {
        System.out.println("Current Page : " + currentPage);
        System.out.println("Back         : " + back);
        System.out.println("Forward      : " + forward);

    }
   public static void showHistory() {
        System.out.println("Back Stack    : " + back);
        System.out.println("Current Page  : " + currentPage);
        System.out.println("Forward Stack : " + forward);

    }

}
