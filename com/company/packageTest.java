package com.company;
import collegeInfo.classRooms.*;
import collegeInfo.library.library;

import java.util.Scanner;

public class packageTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        classRoomA room1 = new classRoomA(sc.nextInt());
        System.out.println(room1.getNumOfStudentsPer_3_Rows());
        System.out.println(new holaClass().getClass());
        library lb = new library(sc.nextInt());
        System.out.println(lb.displayNumOfBooksAfter_2_booksIssued());
        sc.close();
    }
}
