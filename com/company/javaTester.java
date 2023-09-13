package com.company;

public class javaTester {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Sam";

        Student s2 = new Student();
        s2.id = 1;
        s2.name = "Sam";

        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1.equals(s2) : " + s1.equals(s2));
    }
}

class Student {
    public int id;
    public String name;

    @Override
    public boolean equals(Object obj) {
        Student s = (Student)obj;
        return this.id == s.id && this.name.equals(s.name);
    }
}