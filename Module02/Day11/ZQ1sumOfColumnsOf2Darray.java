/*
Problem Description
Given a 2D integer array C[][] of A rows and B columns. Return an integer array of size B that represents the sums of the columns of the 2D array C.


Problem Constraints
1 <= A,B <= 103
1 <= C[i][j] <= 103
    */


public class Solution {
    public ArrayList<Integer> solve(int A, int B, ArrayList<ArrayList<Integer>> C) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int j =0; j<B; j++){
            int sum =0;
            for(int i=0; i<A; i++){
                sum += C.get(i).get(j);
            }
            ans.add(sum);
        }
        return ans;
    }
}
