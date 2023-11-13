/*
Problem Description

You are given an integer array A and an integer B.

You are required to return the count of pairs having sum equal to B.

NOTE: pair (i,j) and (j,i) are same.



Problem Constraints

1 <= A.size() <= 10000

1 <= A[i] <= 10000

1 <= B <= 10000
  */


public class Solution {
  public int solve(int[] A, int B) {
    
      int len = A.length;
      int count =0;
      for(int i=0; i<len-1; i++){
          for(int j=i+1; j<len; j++){
            int sum = A[i]+A[j];
            if(sum == B) count++;
          }
          
      }
      return count;
  }
}
