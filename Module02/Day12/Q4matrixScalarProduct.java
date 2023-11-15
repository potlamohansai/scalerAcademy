/*
Problem Description
You are given a matrix A and and an integer B, you have to perform scalar multiplication of matrix A with an integer B.


Problem Constraints
1 <= A.size() <= 1000

1 <= A[i].size() <= 1000

1 <= A[i][j] <= 1000

1 <= B <= 1000
  */


public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {
        int n = A.size();
        int m = A.get(0).size();

        //System.out.println(n + " "+ m);

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int temp = B*(A.get(i).get(j));
                // System.out.println(temp);
                A.get(i).set(j,temp);
            }
        }
        return A;
    }
}
