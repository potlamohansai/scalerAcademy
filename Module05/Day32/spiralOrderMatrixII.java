public class Solution {
    public int[][] generateMatrix(int A) {
        int[][] ans = new int[A][A];
        int n = A;

        int r=0, c=0, count =1;
        
        while(n>1){
            int i=r, j=c;
            for(int k=0; k<n-1; k++){
                ans[i][j] = count++;
                j++;
            }
            for(int k=0; k<n-1; k++){
                ans[i][j] = count++;
                i++;
            }
            for(int k=0; k<n-1; k++){
                ans[i][j] = count++;
                j--;
            }
            for(int k=0; k<n-1; k++){
                ans[i][j] = count++;
                i--;
            }

            r++; c++; n-=2;
        }
        if(n==1){
            ans[r][c] = count++;
        }
        return ans;
        
    }
}
