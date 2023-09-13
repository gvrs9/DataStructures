package com.company;

/*
Mr Srikanth has given a task to his students.
He has given a list of N numbers, nums[], the list contains both poitive and
negative integers. Also given two more list of integers as start[] and end[],
where start[] list contains starting indices, and end[] contains ending indices.

Now, the students task is to check and return the boolean values as a list res[],
for each 'i' between, 0<=i<N, check that the rearrangement of sublist of nums[],
from nums[start[i]] to nums[end[i]] forms an arithmetic series or not.

NOTE: A series is said to be arithmetic, if and only if,
nums[i+1]-nums[i]==nums[1]-nums[0], for all valid 'i' value.

i.e., 1,3,5,7,9 is a valid series.
2, 3, 5, 8, 12 is not a valid series.


Constraints:
------------
0<= start[i]<=end[i] < nums[].length


Input Format:
-------------
Line-1: comma separated integers, nums[]
Line-2: comma separated integers, start[]
Line-3: comma separated integers, end[]

Output Format:
--------------
Print a list of boolean values of length equals to start[]/end[] list.


Sample Input-1:
---------------
2,8,4,6,10,11,12,14,20,16,18,22,24
0,1,3,6,8
3,4,5,9,12

Sample Output-1:
----------------
[true,true,false,false,true]

Explanation:
------------
The sublist from 0 to 3 is: [2, 8, 4, 6] => [2,4,6,8] is valid
The sublist from 1 to 4 is: [8, 4, 6,10] => [4,6,8,10] is valid
The sublist from 3 to 5 is: [6, 10, 11] is invalid for any arrangement.
The sublist from 6 to 9 is: [12, 14, 20, 16] is invalid
The sublist from 8 to 12 is: [20, 16, 18, 22,24] is valid


Sample Input-2:
---------------
-8,-6,-2,-8,-4,10,15,-20,-15,-10,-5
0,1,6,4,8,7
4,4,9,7,9,10

Sample Output-2:
----------------
[false,true,false,false,true,true]


*/

public class program1 {
    public static void main(String[] args) {

    }
}
