import java.util.Stack;

public class TextEditorWithUndoRedo {
    static  Stack<String> undo = new Stack<>();
    static   Stack<String> redo = new Stack<>();
    String currentState ="";
    public static void main(String[] args) {


    }
    public  static void type(String text ){


        undo.push(text);
        currentState+=text;
        redo.clear();

    }
    public  static void undo(){
        if (!undo.isEmpty()) {
            redo.push(currentState);
            currentState = undo.pop();
        }
    }
    private void redo() {
        if (!redo.isEmpty()) {
            undo.push(currentState);
            currentState = redo.pop();
        }
    }


}
