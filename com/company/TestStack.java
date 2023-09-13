package com.company;

// import DataStructure.stackDS;
/*
* if using the above then use,
* stackDS.stackUsingLL<String> stk = new stackDS.stackUsingLL<String>();
* */
// or the below
import DataStructure.StackDS.StackUsingLL; // importing the static nested class directly without importing the whole stackDS outer class.

public class TestStack {
    public static void main(String[] args) {
        StackUsingLL<String> stk = new StackUsingLL<String>();
        stk.push("hey");
        stk.push("bey");
        stk.push("doy");
        stk.push("koy");
        stk.push("poy");
        stk.display();
        System.out.println(stk.pop());
        stk.display();
        System.out.println(stk.peek());
        System.out.println(stk.sizeOfStack());
        System.out.println(stk.isEmpty());
    }
}
