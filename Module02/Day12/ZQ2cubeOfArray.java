/*
Problem Description
You are provided with an integer array A. Return another array B of size same as that of A such that B[i] = A[i]3 for 1 <= i <= |A| (1 based indexing).


Problem Constraints
1 <= |A| <= 106
1 <= A[i] <= 106

  */


public class Solution {
    public ArrayList<Long> solve(ArrayList<Integer> A) {
        ArrayList<Long> cube = new ArrayList<Long>();
        int len = A.size();
        for(int i=0; i<len; i++ ){
            long m = A.get(i);
            cube.add(m*m*m);
        }
        return cube;
    }
}
