public class Solution {
    public int solve(int A) {
        
        int prime=0;
        for(int j=1; j<=A; j++){
            int count=0;
            for(int i=1; i<=j; i++){
            if(j%i ==0){
                count++;
            }
            }
            if(count ==2) prime++;
        }
        return prime;
    }
}
