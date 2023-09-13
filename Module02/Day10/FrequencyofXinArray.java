public class Solution {
    public int solve(int[] A, int B) {
        int len = A.length;
        int count =0;
        for(int i=0; i<len; i++){
            if(A[i] == B) count++;
        }
        return count;
    }
}
