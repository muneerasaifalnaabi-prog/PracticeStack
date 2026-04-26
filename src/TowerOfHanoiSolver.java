import java.util.Stack;

public class TowerOfHanoiSolver {
    static Stack<Integer> pegA = new Stack<>();
    static Stack<Integer> pegB = new Stack<>();
    static Stack<Integer> pegC = new Stack<>();

    static int count=0;
    public static void main(String[] args) {

    }
    public static void initializePegs(int numDisks) {
        pegA.clear();
        pegB.clear();
        pegC.clear();
        count = 0;
        //push disck from largest to smallest
        for (int i=numDisks;i>=1;i--){
            pegA.push(i);
        }
        System.out.println("Initlized "+numDisks +"on peg A");

    }

}
