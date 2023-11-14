/*
Problem Description
Given a 2D array A of N rows and M columns. Find value of largest element in each row.


Problem Constraints
1 <= N, M <= 1000
1 <= Ai <= 109
  */


public class Solution {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        int M = A.size();
        int N = A.get(0).size();
        ArrayList<Integer> ans = new ArrayList<Integer>();

        for(int i=0; i<M; i++){
            int max = A.get(i).get(0);
            for(int j=0; j<N; j++){
                if(max < (int)A.get(i).get(j)){
                    max = (int)A.get(i).get(j);
                }
            }
            ans.add(max);
        }
        return ans;
    }
}
