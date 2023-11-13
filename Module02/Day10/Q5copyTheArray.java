/*
Problem Description

You are given a constant array A and an integer B.

You are required to return another array where outArr[i] = A[i] + B.



Problem Constraints

1 <= A.size() <= 10000

1 <= A[i] <= 10000

1 <= B <= 10000
  */

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] solve(final int[] A, int B) {
        Scanner sc = new Scanner(System.in);
        int len = A.length;
        for(int i=0; i<len; i++){
            A[i] +=B;
        }
        return A;
    }
}
