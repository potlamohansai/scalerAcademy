public class Solution {
    public String solve(String A) {
        int n = A.length();
        String ans = new String();
        for(int i=0; i<n; i++){
            char ch = A.charAt(i);
            int val = ch +32;
            ans += (char)val;
        }
        return ans;
}
}
