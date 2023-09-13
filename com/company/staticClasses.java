package com.company;

public class staticClasses {
    static int x;
    int y = 0;
    {
        y = 15;
    }
    public static class staticClass {

    }
    static {
        x = 10;
        System.out.println("hey this static block sir!");
    }

    {
        y = 25;
    }
    staticClasses() {System.out.println("default constructor is called!!");}

    public static void main(String[] args) {
        staticClasses sc = new staticClasses();
        System.out.println(staticClasses.x + " " + sc.y);
    }
}
