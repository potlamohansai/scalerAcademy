/*
Problem Description
Given an array A, check if it is sorted in non-decreasing order or not.

Non-decreasing order means that the numbers in a sequence can stay the same or increase, but they cannot decrease.


Problem Constraints
1 <= Ai <= 109
1 <= |A| <= 105
  */

public class Solution {
    public int solve(int[] A) {
        int len = A.length;
        for(int i=0; i<len-1; i++){
            if(A[i]>A[i+1]) return 0;
        }
        return 1;
    }
}
