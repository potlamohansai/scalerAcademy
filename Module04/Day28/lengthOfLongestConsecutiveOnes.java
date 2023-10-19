public class Solution {
    public int solve(String A) {
        int n = A.length();
        int count =0;
        int res =0;
        for(int i=0; i<n; i++){
            count +=A.charAt(i)-'0';
        }
        if(count==n) return n;

        for(int i=0; i<n; i++){

            if(A.charAt(i) == '0'){
                int ans =0;
                int l=0, r=0;
                for(int j=i-1; j>=0; j--){
                    if(A.charAt(j)=='1') l++;
                    else break;
                }
                for(int j=i+1; j<n; j++){
                    if(A.charAt(j)=='1') r++;
                    else break;
                }
                ans = l+r+1;
                res = Math.max(ans,res);
            }     
        }
        if(res >count) return count;
        return res;
    }
}
