package com.company;

class ObjPassDemo {
    int a, b;
    ObjPassDemo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    boolean equalTo(ObjPassDemo o) {
        return o.a == this.a && o.b == this.b;
    }
}

class ObjClone {
    double a, b, c;

    ObjClone(double ...args) {
        this.a = args[0];
        this.b = args[1];
        this.c = args[2];
    }

    ObjClone(ObjClone ob) {
        this.a = ob.a;
        this.b = ob.b;
        this.c = ob.c;
    }

    double computeWidth() {return this.a * this.b * this.c;}
}

class ObjReturn {
    int a;

    ObjReturn(int a) {this.a = a;}

    ObjReturn getObjIncr() {
        ObjReturn temp = new ObjReturn(this.a + 10);
        System.out.println(this.a + " " + temp.a);
        return temp;
    }
}

public class ObjAsArg {
    public static void main(String[] args) {
        ObjPassDemo ob1 = new ObjPassDemo(100, 200);
        ObjPassDemo ob2 = new ObjPassDemo(100, 200);
        ObjPassDemo ob3 = new ObjPassDemo(1, 2);

        System.out.println(ob1.equalTo(ob2));
        System.out.println(ob1.equalTo(ob3));

        ObjClone obc1 = new ObjClone(10, 20, 30);
        ObjClone obc2 = new ObjClone(obc1);

        System.out.println(obc1.computeWidth());
        System.out.println(obc2.computeWidth());

        ObjReturn ob = new ObjReturn(2);
        ObjReturn obret = ob.getObjIncr();
        System.out.println(ob.a);
        System.out.println(obret.a);
    }
}
