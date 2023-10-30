public class Solution {
    public int firstMissingPositive(int[] A) {
        int n = A.length;

        for(int i=0; i<n; i++){
            if(A[i] <=0){
                A[i] = n+2;
            }
        }

        for(int i=0; i<n; i++){
            int x= Math.abs(A[i]);
            if(x >=1 && x<=n){
                int indx = x-1;
                if(A[indx] >0){
                    A[indx] *=-1;
                }
            }
        }

        for(int i=0; i<n; i++){
            if(A[i] >0){
                return i+1;
            }
        }

        return n+1;
    }
}
