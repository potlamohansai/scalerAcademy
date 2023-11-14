/*
Problem Description

You are given two matrices A & B of same size, you have to return another matrix which is the sum of A and B.
Note: Matrices are of same size means the number of rows and number of columns of both matrices are equal.


Problem Constraints

1 <= A.size(), B.size() <= 1000 1 <= A[i].size(), B[i].size() <= 1000 1 <= A[i][j], B[i][j] <= 1000
  */


public class Solution {
    public int[][] solve(int[][] A, int[][] B) {
        int n = A.length;
        int m = A[0].length;
        int[][] ans = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                ans[i][j] = A[i][j] + B[i][j];
            }
        }
        return ans; 
    }
}
