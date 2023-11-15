/*
Problem Description

You are given a character string A, having length N and an integer ASCII code B.

You have to tell the leftmost occurrence of the character having ASCII code equal to B, in A or report that it does not exist.


Problem Constraints

1 <= N <= 105

A[i] ∈ ['a'-'z']

97 <= B <= 122
  */


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final String A, final int B) {
        for(int i=0; i<A.length(); i++){
            int val = A.charAt(i);

            if(val == B) return i;
        }
        return -1;
    }
}
