package com.company;

import static java.lang.System.*; // static imports!!

class Testi {
    private void method() {
        System.out.print("hey this is testi!!");
    }
}

public class wrapperTest {
    public static void main(String[] args) {
        int x = 100;
        int arr[] = {x};
        arr[0]++;
        out.print(arr[0]);
        Integer i = x;
        Testi t = new Testi();
    }
}
