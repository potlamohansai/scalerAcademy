/*Problem Description
Given an array A and an integer B, find the number of occurrences of B in A.

Problem Constraints
1 <= B, Ai <= 10^9
1 <= length(A) <= 10^5
*/

//Time Complexity:O(N)
//Space Complexity:O(1)

public class Solution {
    public int solve(int[] A, int B) {
        int len = A.length;
        int count =0;
        for(int ele: A){
            if(ele == B) count++;
        }
        return count;
    }
}
