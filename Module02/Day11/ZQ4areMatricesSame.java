/*
Problem Description
You are given two matrices A and B of equal dimensions and you have to check whether two matrices are equal or not.

NOTE: Both matrices are equal if A[i][j] == B[i][j] for all i and j.


Problem Constraints
1 <= A.size(), B.size() <= 1000
1 <= A[i].size(), B[i].size() <= 1000
1 <= A[i][j], B[i][j] <= 1000
A.size() == B.size()
A[i].size() == B[i].size()
  */


public class Solution {
    public int solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        int N = A.size();
        int M = A.get(0).size();
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(!A.get(i).get(j).equals(B.get(i).get(j))) return 0;
            }
        }
        return 1;
    }
}
