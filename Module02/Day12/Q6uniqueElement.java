/*
Problem Description
Given an Array of integers A, every element in it is repeated twice except one, find that unique element.


Problem Constraints
1<= Length of array A <= 103
0<= Ai <=1000
  */

public class Solution {
    public int solve(ArrayList<Integer> A) {
        int len = A.size();

        for(int i=0; i<len; i++){
            int count =0;
            for(int j=0; j<len; j++){
                int p= A.get(i);
                int q= A.get(j);

                if(p == q) count++;
            }
            if(count ==1) return A.get(i);
        }
        return 0;
    }
}
