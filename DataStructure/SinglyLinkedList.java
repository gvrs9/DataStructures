package DataStructure;

public class SinglyLinkedList<T> {

    private Node<T> head; // Reference variable pointing to the node
    private Node<T> tail; // Reference variable pointing to the node
    private int size; // size of the LinkedList

    public SinglyLinkedList() {
        this.size = 0;
    }

    public void insertFirst(T val) {
        Node<T> node = new Node<>(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertAtTail(T val) {
        Node<T> node = new Node<>(val);
        if (tail == null) {
            insertFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void insertAtSomePosition(T val, int pos) {
        if (pos == 0) { // insert at the Start
            insertFirst(val);
            return;
        }

        /*
        if(pos == size) { // When size is given
            insertAtTail(val);
            return;
        }
        */

        if (pos < 0 || pos > size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        Node<T> temp = head;
        int szPointer = 1;
        while (szPointer < pos) {
            temp = temp.next;
            szPointer += 1;
        }

        if (temp.next == null) { // Insert at the End
            insertAtTail(val);
            return;
        }

        Node<T> node = new Node<>(val); // Insert at Some Position
        node.next = temp.next;
        temp.next = node;
        size += 1;
    }

    public void deleteAtSomePosition(int pos) {
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        System.out.println(size);
        size -= 1;
        if (pos == 0) { // if at first then do this
            head = head.next;
            if (head == null) tail = null;
            return;
        }

        int currIndex = 1;
        Node<T> curr = head;
        while (currIndex < pos) {
            curr = curr.next;
            currIndex += 1;
        }

        Node<T> temp = curr.next;
        if (temp.next == null) { // if at last then do this
            curr.next = null;
            tail = curr;
            return;
        }

        curr.next = temp.next; // if any other position
    }

    public int getElementIndex(T target) {
        Node<T> currNode = head;
        int index = 0;
        while (currNode != null) {
            if (currNode.value.equals(target)) return index;
            currNode = currNode.next;
            index++;
        }
        return -1;
    }

    public void print() {
        Node<T> tempIterator = head;
        while (tempIterator != null) {
            System.out.print(tempIterator.value + " -> ");
            tempIterator = tempIterator.next;
        }
        System.out.println("null");
    }

    private static class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }

        /*
        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }
         */
    }
}
