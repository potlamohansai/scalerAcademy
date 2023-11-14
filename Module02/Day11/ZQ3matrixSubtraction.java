/*
Problem Description

You are given two integer matrices A and B having same size(Both having same number of rows (N) and columns (M). You have to subtract matrix B from A and return the resultant matrix. (i.e. return the matrix A - B).

If A and B are two matrices of the same order (same dimensions). Then A - B is a matrix of the same order as A and B and its elements are obtained by doing an element wise subtraction of A from B.


Problem Constraints

1 <= N, M <= 103

-109 <= A[i][j], B[i][j] <= 109
  */


public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        int M = A.size();
        int N = A.get(0).size();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                int res = A.get(i).get(j) - B.get(i).get(j);
                ans.get(i).set(j,(int)res);
            }
        }
        return ans;
    }
}
