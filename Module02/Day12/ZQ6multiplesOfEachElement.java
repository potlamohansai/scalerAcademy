/*
Problem Description
Given 2 arrays of integers A and B
Return a 2D array of integers such that i-th row of the array contains list of values in A such that A[j]%B[i]==0 in A in sequential order


Problem Constraints
1 <= |A| <= 103

1 <= |B| <= 103

1 <= A[i] <= 105

1 <= B[i] <= 105
  */


public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<B.size(); i++){
            ArrayList<Integer> ele = new ArrayList<Integer>();
            for(int j=0; j<A.size(); j++){
                if(A.get(j)%B.get(i) ==0){
                    ele.add(A.get(j));
                }
            }
            ans.add(ele);
        }
        return ans;
    }
}
