import java.util.Stack;

public class BrowserNavigationSystem {
    static Stack<String> back=new Stack<>();
    static Stack<String> farwared=new Stack<>();
    static String currentPage="";
    static int  max=10;
    public static void main(String[] args) {


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
        farwared.clear();
        //set new cuurent page
        currentPage = url;
        System.out.println("Visited  : " + url);


    }
}
