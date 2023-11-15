/*
Problem Description

You are given a N X N square integer matrix A. You have to tell whether A is an identity matrix or not.

Identity matrix is a special square matrix whose main diagonal elements are equal to 1 and all other elements are 0.


Problem Constraints

2 <= N <= 103

A[i][j] equals 0 or 1.
  */


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final List<ArrayList<Integer>> A) {
        int n = A.size();

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == j){
                    if(A.get(i).get(j) != 1) return 0;
                }
                else{
                    if(A.get(i).get(j) != 0) return 0;
                }
            }
        }
        return 1;
    }
}
