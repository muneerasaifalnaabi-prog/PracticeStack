public class StackWithMiddle {
    //node class
    static class Node {
        int  data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
        //variables
        static Node top  = null;
        static Node mid  = null;
        static int  size = 0;

    }
    public static void main(String[] args) {

    }
    public static void push(int value) {
        Node newNode = new Node(value);
        // Link new node to current top


    }

}
