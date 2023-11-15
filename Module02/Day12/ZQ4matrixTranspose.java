/*
Problem Description
Given a 2D integer array A, return the transpose of A.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.


Problem Constraints
1 <= A.size() <= 1000

1 <= A[i].size() <= 1000

1 <= A[i][j] <= 1000
  */


public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        int M = A.size();
        int N = A.get(0).size();
        for(int i =0; i<N; i++){
            ArrayList<Integer> sub = new ArrayList<Integer>();
            for(int j=0; j<M; j++){
                sub.add(A.get(j).get(i));
            }
            ans.add(sub);
        }
        return ans;
    }
}
