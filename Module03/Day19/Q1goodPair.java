/*Problem Description
Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.

Problem Constraints
1 <= A.size() <= 104
1 <= A[i] <= 109
1 <= B <= 109
*/

/*
Approach 1
For every i run a loop of j and check if A[i]+A[j]==B or not. Also, check if i!=j.
Time complexity : O(n^2)
This is enough to pass the test casses. However we can furthur optimize this solution.

Approach 2
Sort the array A in increasing order. For each i from 0 to n-1 find the first element in the array having a value greater than or equal to B-A[i] using binary search.
(For c++ we can directly use ‘lower_bound’ function) . Now just check if this element is equal to B-A[i] , if it is then return 1 , otherwise continue the process.
Time complexity : O(nlogn)
*/

//Time Complexity O(N^2)
//Space Complexity O(1)
public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int len = A.size();
        for(int i=0; i<len-1; i++){
            for(int j=i+1; j<len; j++){
                int sum = A.get(i)+A.get(j);
                if(sum == B){
                    return 1;
                }
            }
        }
        return 0;
    }
}

//Time Complexity O(NlogN)
//Space Complexity O(1)
public class GoodPair {
    // Function to check if a good pair exists
    static boolean hasGoodPair(int[] A, int B) {
        Arrays.sort(A);

        int n = A.length;
        for (int i = 0; i < n; i++) {
            // Use binary search to find B - A[i] in the sorted array
            int complement = B - A[i];
            int low = 0, high = n - 1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (A[mid] == complement && i != mid) {
                    // Found a good pair
                    return true;
                } else if (A[mid] < complement) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        // No good pair found
        return false;
  }
