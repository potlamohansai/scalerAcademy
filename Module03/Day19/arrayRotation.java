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

        // Time complexity O(N) and Space Complexity O(N)
        //int[] ans = new int[len];
        // for(int i=0; i<len; i++){
        //     int j = (i+B)%len;
        //     ans[j] = A[i];
        // }

        //Time complexity O(N) and Space Complexity O(1)
        reverse(A,0,len-1);
        reverse(A,0,B-1);
        reverse(A,B,len-1);

        return A;
    }
}
