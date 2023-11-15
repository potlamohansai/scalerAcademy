/*
Problem Description
Given an array A of N integers, return the number of unique elements in the array.


Problem Constraints
1 <= N <= 105
1 <= A[i] <= 109
  */

public class Solution {
    public int solve(ArrayList<Integer> A) {
        int len = A.size();
        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();

        for(int i=0; i<len; i++){
            if(hm.containsKey(A.get(i))){
                int oldValue = A.get(i);
                int newValue = oldValue+1;
                hm.put(A.get(i), newValue);
            }else{
                hm.put(A.get(i),1);
            }
        }
        int count=0;
        for(int i : hm.keySet()){
            count++;
        }
        return count;
    }
}
