/*Problem Description
Given an array A of N integers and also given two integers B and C. Reverse the elements of the array A within the given inclusive range [B, C].

Problem Constraints
1 <= N <= 10^5
1 <= A[i] <= 10^9
0 <= B <= C <= N - 1
*/

//Time Complexity O(N)
//Space Complexity O(1)
public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {
        while(B<C){
            int temp = A.get(B);
            A.set(B,A.get(C));
            A.set(C,temp);
            B++;
            C--;
        }
        return A;
    }
}
