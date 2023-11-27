/*Problem Description
Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.

Problem Constraints
1 <= N <= 10^5
-10^9 <= A[i] <= 10^9
*/


//Time Complexity O(N)
//Space Complexity O(1)
public class Solution {
    public int solve(ArrayList<Integer> A) {
        int len = A.size();
        int min = A.get(0);
        int max = A.get(0);
        for(int i=1; i<len; i++){
            if(min >= A.get(i)){
                min = A.get(i);
            }else if(max < A.get(i)){
                max = A.get(i);
            }
        }
        return min+max;
    }
}
