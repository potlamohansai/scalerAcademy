/*Problem Description
Given an integer array A. Find and return the frequency of number B in array A.


Problem Constraints
1 <= |A| <= 105
1 <= A[i] <= 109
1 <= B <= 109
    */


public class Solution {
    public int solve(int[] A, int B) {
        int len = A.length;
        int count =0;
        for(int i=0; i<len; i++){
            if(A[i] == B) count++;
        }
        return count;
    }
}
