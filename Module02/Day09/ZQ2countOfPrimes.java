/*Problem Description
You will be given an integer n. You need to return the count of prime numbers less than or equal to n.


Problem Constraints
0 <= n <= 10^3
  */

public class Solution {
    public int solve(int A) {
        int ans =0;
        for(int i=2; i<=A; i++){
            if(isPrime(i)){
                ans++;
            }
        }
        return ans;
    }

    public boolean isPrime(int n){
        int count=0;
        for(int i=1; i<=n; i++){
            if(n%i ==0) count++;
            if(count>2) return false;
        }
        return true;
    }
}
