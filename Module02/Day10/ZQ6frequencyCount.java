/*
Problem Description
You are given an integer array A, you have to return an integer array of same size whose ith element is the frequency count of A[i] in array A .

Problem Constraints
1 <= len(A) <= 1000

1 <= A[i] <= 100
  */

public class Solution {
    public int[] solve(int[] A) {
        int len = A.length;
        int[] ans = new int[len];

        for(int i=0; i<len; i++){
            int count =0;
            for(int j=0; j<len; j++){
                if(A[i]== A[j]) count++;
            }
            ans[i] = count;
        }
        return ans;
    }
}
