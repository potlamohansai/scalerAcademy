public class Solution {
    public int[] solve(int A, int[][] B) {
        int qlen = B.length;
        int[] ans = new int[A];
        Arrays.fill(ans,0);

        for(int i=0; i<qlen; i++){
            ans[B[i][0]-1] += B[i][2];

            if(B[i][1]<A){
                ans[B[i][1]] -= B[i][2];
            }
        }

        for(int i=1; i<A; i++){
            ans[i] = ans[i-1]+ans[i];
        }

        return ans;

    }
}
