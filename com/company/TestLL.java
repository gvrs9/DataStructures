package com.company;

import DataStructure.SinglyLinkedList;

public class TestLL {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> ll = new SinglyLinkedList<>();
        ll.insertFirst(3);
        ll.insertFirst(2);
        ll.insertFirst(8);
        ll.insertFirst(17);
        ll.insertAtTail(99);
        ll.print();
        SinglyLinkedList<String> ll1 = new SinglyLinkedList<>();
        ll1.insertAtTail("hey");
        ll1.insertAtTail("bey");
        ll1.insertAtTail("dey");
        ll1.insertAtTail("doy");
        ll1.print();
        ll.insertAtSomePosition(100, 3);
        ll.print();
        ll.deleteAtSomePosition(3);
        ll.deleteAtSomePosition(2);
        ll.deleteAtSomePosition(3);
        ll.print();
        System.out.println(ll.getElementIndex(24));
    }
}
