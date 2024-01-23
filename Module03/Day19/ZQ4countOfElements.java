/*Problem Description
Given an array A of N integers. 
Count the number of elements that have at least 1 elements greater than itself.

Problem Constraints
1 <= N <= 10^5
1 <= A[i] <= 10^9
*/

//Time Complexity:O(N)
//Space Complexity:O(1)

public class Solution {
    public int solve(ArrayList<Integer> A) {
        int n = A.size();
        int max_val =0;
        int max_count =0;
        for(int i=0; i<n; i++){
            if(A.get(i) > max_val){
                max_val=A.get(i);
                max_count =1;
            }else if(A.get(i) == max_val){
                max_count++;
            }
        }
        return n-max_count;
    }
}
