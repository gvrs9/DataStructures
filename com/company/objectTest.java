package com.company;
// Always remember that static methods in class even though inherited, they are never overridden!! Instead they are hidden!! And in case of non static, they are overridden!!

class A {
    // this is not overridden!!
    public static void display1() {System.out.println("hey this is A class static display1!!");}
    // this is overridden!!
    public void display2() {System.out.println("hey this is A class non static display2!!");}
}

class B extends A {
    public void show() {
        display1();
        display2();
    }
    public static void display1() {
        System.out.println("hey this is B class static display1!!");
    }
    @Override
    public void display2() {
        System.out.println("hey this is B class non static display2!!");
    }
}

class C {
    private int x, t;
    private final int temp1;
    private final static int temp2;
    C(int x, int t, int temp1) {
        this.x = x;
        this.t = t;
        this.temp1 = temp1;
    }
    C c;
    public void setThroughObjsRef(C c) {
        c.x = c.x + 5;
        c.t = c.t + 5;
    }
    public Pair get() {
        Pair p = new Pair(x, t);
        return p;
    }
    {
        // this block's code is only executed while after object creation!!
        System.out.println("this is some code in non static block!!");
    }
    static {
        System.out.println("this is some code!!");
    }
    static {
        temp2 = 100;
        System.out.println(temp2);
    }
    public static void display1() {
        System.out.println("this is static C");
    }
    public void display2() {
        System.out.println("this is non-static C");
    }
}

class D<T> {
    private T data;
    D(T data) {
        /*
        // This is for checking the type of data that is passed when object is created!!
        Class<?> typeOfClass = data.getClass();
        checkType(typeOfClass);
        */
        // simply
        checkType(data.getClass());
        this.data = data;
    }
    private void checkType(Class<?> c) {
        if(c.getName().equals(Integer.class.getName())) {
            System.out.println("Integer it is bruh!!");
        }else {
            System.out.println("IDK bruh!! " + c.getName());
        }
    }
    @Override
    public String toString() {
        return String.valueOf(data);
    }
}

class Pair<T> {
    public T first, second;
    Pair(T x, T t) {
        first = x;
        second = t;
    }
}

class Test {
    int marks, ques;
    Test(int marks, int ques) {
        this.marks = marks;
        this.ques = ques;
    }
    Test(Test t) { // copy constructor!!
        this.marks = t.marks;
        this.ques = t.ques;
    }
    Test() {System.out.println("hello");}
}

class Vehicle {
    void run() {System.out.println("vehicle is running:");}
}

class Bike extends Vehicle {
    Bike() {
        super.run();
        this.run();
    }
    @Override
    void run() {
        super.run();
        System.out.println("Bike is Running Safe!!");
    }
}

class Bike2 extends Bike {
    Bike2() {
        super();
    }
    @Override
    void run() {
        super.run();
        System.out.println("Bike2 is currently running!!");
    }
}

class MethodOverloading { // params should be diff!!
    int getSum(int x, int y) {
        return x + y;
    }
    int getSum(int x, int y, int z) {
        return x + y + z;
    }
    float getSum(float x, float y, float z) {
        return x + y + z;
    }
}

class Q {
    Q() {
        System.out.println("Q!!");
    }
}

class R extends Q{
    R() {
        System.out.println("R!!");
    }
}

abstract class Bike3 {
    Bike3() {
        System.out.println("abstract class Constructor!!");
    }
    abstract void run();
    void changeGear() {System.out.println("Gear changed in abstract class!!");}
}

class Honda extends Bike3 {
    @Override
    void run() {
        super.changeGear();
        System.out.println("Overriden run()!!");
    }
    Honda(final int n) {
        System.out.println(n);
        this.run();
    }
    Honda() {
        super();
        System.out.println("Wait!!");
    }
}

interface I1 {
    void print();
    default void go() {
        System.out.println("T1's Go!!");
    }
}

interface I2 {
    void show();
    default void go() {
        System.out.println("T2's Go!!");
    }
}

class MultipleInher implements I1, I2 {
    public void print() {
        System.out.println("print!!");
    }
    public void show() {
        System.out.println("Show!!");
    }

    {
        System.out.println("Voila");
        I1.super.go();
    }

    public void go() {
        I1.super.go();
        I2.super.go();
    }
}



public class objectTest {
    public static void main(String[] args) {
        B b = new B();
        b.display1();
        b.display2();

        A a = new A();
        a.display1();
        a.display2();

        A a1 = new B(); // is only possible when B extends A not the other way around!!
        a1.display1();
        a1.display2();

        C c = new C(10, 20, 30);
        c.setThroughObjsRef(c);
        Pair p = c.get();
        System.out.println(p.first + " " + p.second);
        Pair p1 = new Pair(10, 20);
        D d = new D(p1);
        System.out.println(d);

        Test t1 = new Test(45, 2);
        System.out.println(t1.marks + " " + t1.ques);
        Test t2 = new Test(t1); // copy constructor call here!!
        System.out.println(t2.marks + " " + t2.ques);

        Vehicle v = new Bike2();
        v.run();

        Honda b3 = new Honda(10);
        b3.run();

        R r = new R();

        MultipleInher mh = new MultipleInher();
        mh.print();mh.show();

        I1 mh1 = new MultipleInher();
        I2 mh2 = new MultipleInher();
        mh1.print();mh2.show();
        mh.go();
    }
}
