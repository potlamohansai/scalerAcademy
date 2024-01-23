/*Problem Description
You are given an array A of integers of size N.
Your task is to find the equilibrium index of the given array
The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.

Note:
Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.

Problem Constraints
1 <= N <= 10^5
-10^5 <= A[i] <= 10^5
*/

//Time Complexity:O(N)
//Space Complexity:O(N)

public class Solution {
    public int solve(ArrayList<Integer> A) {
        int n = A.size();
        ArrayList<Long> pf = new ArrayList<>();
        pf.add((long)A.get(0));
        for(int i=1; i<n; i++){
            pf.add(pf.get(i-1)+(long)A.get(i));
        }

        for(int i=0; i<n; i++){
            long sum_low =0;
            long sum_high =0;
            if(i==0){
                sum_low =0;
                sum_high = pf.get(n-1)-pf.get(i);
            }else{
                sum_low = pf.get(i-1);
                sum_high = pf.get(n-1)-pf.get(i);
            }
            if(sum_low==sum_high) return i;
        }
        return -1;

    }
}
