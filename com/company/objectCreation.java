package com.company;
import java.util.*;

public class objectCreation {
    public static Scanner scanner;
    private int x;

    public objectCreation() {
        // this(10, 20);
        x = 26;
        System.out.println("The default constructor called!!" + " and private x is: " + this.x);
    }

    public objectCreation(int x, int val) {
        this();
        System.out.println("The x is : " + this.x + " and val is : " + val);
        this.x = x;
        System.out.println("The x is : " + this.x + " and val is : " + val);
    }

    public void display() {
        System.out.println("The private x is : " + x);
        System.out.println("blah blah!!");
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        // setIO();
        objectCreation obj = new objectCreation(scanner.nextInt(), scanner.nextInt());
        obj.display();
        System.out.println(obj.x);
        obj = new objectCreation();
        System.out.println(obj.x);
        obj.display();

        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1 + " " + s2);

        System.out.println("-----");

        s2 = "def";
        s1 = s2;
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println("-----");

        s2 = "abc";
        s1 = s2;
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1 + " " + s2);

        System.out.println("--------------");

        String str1 = new String("ABC");
        String str2 = new String("ABC");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str1 + " " + str2);

        System.out.println("-----");

        str1 = "DEF";
        str2 = str1;
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str1 + " " + str2);

        System.out.println("-----");

        str1 = "ABC";
        str2 = str1;
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str1 + " " + str2);
        scanner.close();
    }
}
