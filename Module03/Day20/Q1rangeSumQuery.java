/*Problem Description
You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.

Problem Constraints
1 <= N, M <= 10^5
1 <= A[i] <= 10^9
0 <= L <= R < N
*/

//Time Complexity: O(N)
//Space Complexity: O(N)

public class Solution {
    public long[] rangeSum(int[] A, int[][] B) {
        int len = A.length;
        int row = B.length;
        long[] ans = new long[row];
        long[] pf = new long[len];
        pf[0] = A[0];
        for(int i=1; i<len; i++){
            pf[i] = pf[i-1]+A[i];
        }
        for(int i=0; i<row; i++){
            if(B[i][0] == 0){
                ans[i] = pf[B[i][1]];
            }else{
                ans[i] = pf[B[i][1]] - pf[B[i][0]-1];
            }
        }
        return ans;
    }
}
