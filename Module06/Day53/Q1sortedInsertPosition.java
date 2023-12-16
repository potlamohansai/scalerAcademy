/*Problem Description
You are given a sorted array A of size N and a target value B.
Your task is to find the index (0-based indexing) of the target value in the array.

If the target value is present, return its index.
If the target value is not found, return the index of least element greater than equal to B.
Your solution should have a time complexity of O(log(N)).


Problem Constraints
1 <= N <= 105
1 <= A[i] <= 105
1 <= B <= 105
*/

public class Solution {
    public int searchInsert(ArrayList<Integer> A, int B) {
        int n = A.size();
        int l=0, r=n-1;
        int mid = 0;

        while(l<=r){
            mid = l+(r-l)/2;
            if(A.get(mid) == B){
                return mid;
            }
            if(B<A.get(mid)){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }

        if(A.get(mid) > B){
            return mid;
        }
        return mid+1;
    }
}

