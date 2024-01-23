/*Problem Description
Given an array A of N integers. Construct prefix sum of the array in the given array itself.

Problem Constraints
1 <= N <= 105
1 <= A[i] <= 103
*/

//Time Complexity:O(N)
//Space Complexity:O(1)

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int n = A.size();
        int sum = 0;
        for(int i=0; i<n; i++){
            sum +=A.get(i);
            A.set(i,sum);
        }
        return A;
    }
}
