/*
Problem Description
Given an integer A in the function parameter.
Return a 2D array with A rows such that the i-th row has numbers from 1 to i.


Problem Constraints
1 <= A <= 103
  */


public class Solution {
    public ArrayList<ArrayList<Integer>> solve(int A) {
            ArrayList< ArrayList<Integer> > ans = new ArrayList< ArrayList<Integer> >();

            for(int i=1; i<=A; i++){
                ArrayList<Integer> row = new ArrayList<Integer>();
                for(int j=1; j<=i; j++){
                    row.add(j);
                }
                ans.add(row);
            }

            return ans;
    }
}
