/*
Problem Description
You are given a N X N integer matrix. You have to find the sum of all the main diagonal elements of A.

Main diagonal of a matrix A is a collection of elements A[i, j] such that i = j.


Problem Constraints
1 <= N <= 103

-1000 <= A[i][j] <= 1000
  */


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final List<ArrayList<Integer>> A) {
        int n = A.size();
        int m = A.get(0).size();

        int sum =0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i==j){
                    sum += A.get(i).get(j);
                }
            }
        }
        return sum;
    }
}
