/*
Venkatesh is a maths teacher.
He is teaching matrices concept to his students.
He is given a matrix of size m*n, and it contains only positive numbers.
He has given a task to his students to find the number of special matrices
in the given matrix A[m][n].

A special matrix has following property:
	- The size of matrix should be 3*3,
	- The sum of elements in each row, each column and
	  the two diagonals are equal.
	- The 3*3 matrix should contains all the numbers from 1 to 9.

Your task is to help the students to find the number of speical matrices
in the given matrix.

Input Format:
-------------
Line-1: Two space separated integers M and N, size of the matrix.
Next M lines: N space separated integers m and n.

Output Format:
--------------
Print an integer, number of the special matrices.


Sample Input-1:
---------------
4 5
6 8 1 6 8
7 3 5 7 3
2 4 9 2 4
6 8 1 6 8

Sample Output-1:
----------------
1

Explanation:
------------
The special square is:
8 1 6
3 5 7
4 9 2


Sample Input-2:
---------------
3 5
2 7 6 7 2
9 5 1 5 9
4 3 8 3 4

Sample Output-2:
----------------
2

Explanation:
------------
The special squares are:
2 7 6
9 5 1
4 3 8
-----
6 7 2
1 5 9
8 3 4
*/

package com.company;

import java.util.*;

public class pgrm1 {
    public static int[][] arr;

    private static boolean isSpecialMatrix(int... args) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int x : args) hmap.put(x, hmap.getOrDefault(x, 0) + 1);
        for (Map.Entry<Integer, Integer> e : hmap.entrySet()) {
            if (e.getValue() != 1) return false;
        }
        return (args[0] + args[1] + args[2] == 15 && args[3] + args[4] + args[5] == 15 && args[6] + args[7] + args[8] == 15 && args[0] + args[3] + args[6] == 15 && args[1] + args[4] + args[7] == 15 && args[2] + args[5] + args[8] == 15 && args[0] + args[4] + args[8] == 15 && args[2] + args[4] + args[6] == 15);
    }
    private static int numOfSpecialMatrix(int m, int n) {
        int res = 0;
        for (int i = 0; i < m - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                if(i + 1 < m && j + 1 < n && arr[i + 1][j + 1] != 5) continue;
                if((i + 2 < m) && (j + 2 < n) && (isSpecialMatrix(arr[i][j], arr[i][j+1], arr[i][j+2],
                        arr[i+1][j], arr[i+1][j+1], arr[i+1][j+2],
                        arr[i+2][j], arr[i+2][j+1], arr[i+2][j+2]))) res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        if(m >= 3 && n >= 3) {
            System.out.print(numOfSpecialMatrix(m, n));
        }else {
            System.out.print(0);
        }
    }
}
