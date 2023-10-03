//Time Complexity O(N) and Space Complexity O(1)

public class Solution {
    public int solve(int[] A) {
        int len = A.length;
        int max = A[0];
        int min = A[0];
        for(int i=1; i<len; i++){
            if(max<A[i]) max = A[i];
            else if(min >A[i]) min = A[i];
        }

        int min_index = -1;
        int max_index = -1;
        int ans = len;

        for(int i=len-1; i>=0; i--){
            if(A[i] == max){
                max_index = i;
                if(min_index != -1){
                    if(ans > min_index-max_index+1){
                        ans = min_index-max_index+1;
                    }
                }
            }

            if(A[i] == min){
                min_index = i;
                if(max_index != -1){
                    if(ans > max_index-min_index+1){
                        ans = max_index-min_index+1;
                    }
                }
            }
        }

        return ans;
    }
}
