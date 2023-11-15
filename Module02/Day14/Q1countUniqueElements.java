/*
Problem Description
You are given an array A of N integers. Return the count of elements with frequncy 1 in the given array.


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
                int oldValue = hm.get(A.get(i));
                int newValue = oldValue+1;
                hm.put(A.get(i),newValue);
            }else{
                hm.put(A.get(i),1);
            }
        }
        int count =0;
        for(int i: hm.keySet()){
            if(hm.get(i) ==1) count++;
        }
        return count;
    }
}
