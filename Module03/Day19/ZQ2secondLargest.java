/*Problem Description
You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.

Problem Constraints
1 <= |A| <= 10^5
0 <= A[i] <= 10^9
*/

//Time Complexity:O(N)
//Space Complexity:O(1)

public class Solution {
    public int solve(ArrayList<Integer> A) {
        int n = A.size();
        if(n==1) return -1;

        int frst = A.get(0);
        int scnd = 0;
        
        for(int i =1; i<n; i++){
            if(A.get(i) > frst){
                scnd = frst;
                frst = A.get(i);
            }else if(A.get(i) > scnd && A.get(i) != frst){
                scnd = A.get(i);
            }
            //System.out.print(frst+" "+scnd);
        }
        if(scnd ==0) return -1;
        return scnd;
    }
}
