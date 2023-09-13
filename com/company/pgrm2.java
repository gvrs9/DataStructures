/*
In a contest, There are N people stand in a row, at positions 0,1,2,...,N-1.
The person at i-th  position in the row, assigned a number by the organizer number[i].

Initially, each person has zero credits with them.
Your task is to find number of credits each person will earn at the end.

Credits[i]=product of all numbers from number[], except number[i].

Note: Credits can be positive ,negative or remains zero.

Input Format:
-------------
A space separated integer array, number[]

Output Format:
--------------
Print an integer array, credits[].


Sample Input:
---------------
1 2 5 7

Sample Output:
----------------
70 35 14 10
*/

package com.company;

import java.util.*;

public class pgrm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.next().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
