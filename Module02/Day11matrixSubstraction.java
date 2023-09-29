public class Solution {
    public int[][] solve(int[][] A, int[][] B) {
        int M = A.length;
        int N = A[0].length;

        int ans[][] = new int[M][N];
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                ans[i][j] = A[i][j] - B[i][j];
            }
        }
        return ans;
    }
}
