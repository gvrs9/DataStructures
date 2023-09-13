package DataStructure;

public class StackDS {
    public static class StackUsingLL<T> {
        // lifo
        // push() is just to insert at first
        // pop() is just return top element of the stack just by returning peek() and delete from first
        // peek() is just to return top of the stack i.e., just to return head node of the LL
        // sizeOfStack() is just to return size of the linked list
        // display() is just to display all elements in the LL.
        // isEmpty() is just to return t/f if top == null ? true : false;

        private Node<T> top; // top is a global reference variable. It is nothing but just acting like head in a LL
        private int size = 0; // to maintain the size of LL

        public void push(T val) {
            Node<T> newNode = new Node<>(val);
            // check for overflow. As we are using LL and creating a new Node using 'new' keyword, every newNode will be stored in "heap" memory. So here we are checking if there is a heap overflow.
            if (newNode == null) {
                System.out.println("Heap Overflow");
                return;
            }

            newNode.value = val;
            newNode.next = top;
            top = newNode;
            size += 1;
        }

        public boolean isEmpty() {
            return top == null;
        }

        public int sizeOfStack() {
            return size;
        }

        public T peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty" + "\n" + -1);
                return null;
            }
            return (T) top.value;
        }

        public T pop() {
            if (top == null) {
                System.out.println("\n Stack Underflow!");
                return null;
            }
            size -= 1;
            Node<T> temp = top;
            top = top.next;
            return (T) temp.value;
        }

        public void display() {
            if (top == null) System.out.println("\n Stack Underflow!");
            Node<T> temp = top;
            while (temp != null) {
                System.out.print(temp.value + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    private static class Node<T> {
        private T value;
        private Node<T> next;

        Node(T value) {
            this.value = value;
            this.next = null;
        }
    }
}
