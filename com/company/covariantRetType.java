package com.company;

class CoviA {
    CoviA fun() {
        System.out.println("hey this is A!!");
        return new CoviA();
    }
}

class CoviB extends CoviA {
    CoviB fun() {
        System.out.println("Hey this is B!!");
        return new CoviB();
    }
}

public class covariantRetType {
    public static void main(String[] args) {
        CoviA ca = new CoviA();
        ca.fun();
        CoviB cb = new CoviB();
        cb.fun();
    }
}
