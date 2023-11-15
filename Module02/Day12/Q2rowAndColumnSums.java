/*
Problem Description
You are given a matrix A, you have to return an array containing sum of each row elements followed by sum of each column elements of the matrix.

NOTE: If the matrix given is of size (N x M), then the array you return would be of size (N + M), where first N elements contain the sum of each N rows, and the next M elements contain the sum of each M columns.


Problem Constraints
1 <= A.size() <= 1000

1 <= A[i].size() <= 1000

1 <= A[i][j] <= 1000
*/

public class Solution {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        int n = A.size();
        int m = A.get(0).size();

        ArrayList<Integer> ans = new ArrayList<Integer>();

        for(int i=0; i<n; i++){
            int sum =0;
            for(int j=0; j<m; j++){
                sum +=A.get(i).get(j);
            }
            ans.add(sum);
        }

        for(int j=0; j<m; j++){
            int sum =0;
            for(int i=0; i<n; i++){
                sum +=A.get(i).get(j);
            }
            ans.add(sum);
        }
        return ans;
    }
}
