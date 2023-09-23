public class Solution {
    public int solve(int A) {
        int sum =0;
        for(int i=1; i<A; i++){
            if(A%i == 0){
                sum +=i;
            }
        }
        if(sum == A){
            return 1;
        }
        return 0;
    }
}
