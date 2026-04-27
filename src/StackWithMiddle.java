
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
        push(10);
        display();
        push(20);
        display();
        push(30);
        display();
        push(40);
        display();
        push(50);
        display();
        push(60);
        display();
        // GetMiddle
        System.out.println("Middle      : " + getMiddle());
        System.out.println();


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
        int popped = top.data;
        top = top.next;

        if (top != null) {
            top.prev = null;
        }

        size--;
        // Update mid pointer
        if (size == 0) {
            mid = null;
        } else if (size % 2 == 0) {
            mid = mid.next;
        }
        return popped;
    }
    public static int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
    public static int getMiddle() {
        if (mid == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return mid.data;

    }
    public static int deleteMiddle() {
        if (mid == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        int deleted = mid.data;
        if (mid.prev != null) {
            mid.prev.next = mid.next;
        }
        if (mid.next != null) {
            mid.next.prev = mid.prev;
        }
        Node oldMid = mid;
        if (size % 2 == 1) {
            mid = mid.next;
        }
        else {
            mid = mid.prev;
        }
        size--;

        if (size == 0) {
            mid = null;
            top = null;
        }

        return deleted;

    }
    public  static boolean isEmpty(){
        return size==0;
    }
    public static  int size(){
        return size;
    }
    public static  void display(){
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("| mid=" + (mid == null ? "null" : mid.data));
    }





}
