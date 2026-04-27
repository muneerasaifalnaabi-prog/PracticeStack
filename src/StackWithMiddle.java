
public class StackWithMiddle {
    //node class
    static Node top  = null;
    static Node mid  = null;
    static int  size = 0;
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


    }
    public static void main(String[] args) {

    }
    public static void push(int value) {
        Node newNode = new Node(value);
        // Link new node to current top
        newNode.next = top;
        if (top != null) {
            top.prev = newNode;
        }

        top = newNode;
        size++;
        // Update mid pointer
        if (size == 1) {
            mid = top;
        } else if (size % 2 == 1) {
            mid = mid.prev;
        }
        System.out.println("Push:" + value + " ");

    }
    public static int pop() {
        //when stack is empty
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
    }

}
