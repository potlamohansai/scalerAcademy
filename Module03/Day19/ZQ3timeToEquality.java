/*Problem Description
Given an integer array A of size N. In one second, you can increase the value of one element by 1.
Find the minimum time in seconds to make all elements of the array equal.

Problem Constraints
1 <= N <= 1000000
1 <= A[i] <= 1000
*/

//Time Complexity:O(N)
//Space Complexity:O(1)

public class Solution {
    public int solve(ArrayList<Integer> A) {
        int n =A.size();
        int max = A.get(0);
        for(int i=1; i<n; i++){
            max = Math.max(max, A.get(i));
        }

        int time = 0;
        for(int i=0; i<n; i++){
            time += (max-A.get(i));
        }
        return time;
    }
}
