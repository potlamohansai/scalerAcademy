/*
Problem Description
Given an array A. You have some integers given in the array B.
For the i-th number, find the frequency of B[i] in the array A and return a list containing all the frequencies.


Problem Constraints
1 <= |A| <= 105
1 <= |B| <= 105
1 <= A[i] <= 105
1 <= B[i] <= 105
    */


public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {

      //Create HashMap for frequency of elements in A array
        HashMap<Integer,Integer> freq = new HashMap<Integer,Integer>();
        int n = A.size();

        for(int i=0; i<n; i++){
            if(freq.containsKey(A.get(i)) == false) {
                freq.put(A.get(i), 1);
            }else{
                int oldValue = freq.get(A.get(i));
                int newValue = oldValue+1;
                freq.put(A.get(i), newValue);
            }
        }

      // create ArrayList of frequencies of query elements in B array and return frequencies
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int num : B){
            if(freq.get(num) == null){
                ans.add(0);
            }else{
                ans.add(freq.get(num));
            }
        }
        return ans;
    }
}
