/*Problem Description
Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times towards the right.

Problem Constraints
1 <= N <= 10^5
1 <= A[i] <=10^9
1 <= B <= 10^9
*/

// Time complexity O(N)
//Space Complexity O(N)
public class Solution {
    public static int[] reverse(int[] arr, int i, int j){
        int len = A.length;
        B = B%len;
        int[] ans = new int[len];
        for(int i=0; i<len; i++){
            int j = (i+B)%len;
            ans[j] = A[i];
        }
    }
}


//Time complexity O(N)
//Space Complexity O(1)
public class Solution {
    public static int[] reverse(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
    public int[] solve(int[] A, int B) {
        int len = A.length;
        B = B%len;
        reverse(A,0,len-1);
        reverse(A,0,B-1);
        reverse(A,B,len-1);
        return A;
    }
}
