import java.util.Stack;

public class TextEditorWithUndoRedo {
    static  Stack<String> undo = new Stack<>();
    static   Stack<String> redo = new Stack<>();
    static String currentState ="";
    static int max=10;

    public static void main(String[] args) {

        type("Java ");
        display();

        type(" Programming ");
        display();

        type("!");
        display();

        undo();
        display();

        undo();
        display();

        redo();
        display();

        type(" Java");
        display();

        undo();
        display();
    }

    public  static void type(String text ){
            //edge case :
        if (undo.size()>=max){
            System.out.println("Undo limited reached");
            undo.remove(0);
        }
        undo.push(text);
        currentState+=text;
        redo.clear();
        System.out.println("Typed :" +text );



    }
    public  static void undo(){
        if (!undo.isEmpty()) {
            redo.push(currentState);
            currentState = undo.pop();
        }
    }
    public  static void redo() {
        if (!redo.isEmpty()) {
            undo.push(currentState);
            currentState = redo.pop();
        }

    }
    public static void display() {
        System.out.println("Current Text : " + currentState);
        System.out.println("Undo Stack   : " + undo);
        System.out.println("Redo Stack   : " + redo);
    }


}
