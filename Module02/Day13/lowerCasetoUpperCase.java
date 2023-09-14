public class Solution {
    public String solve(String A) {
        String s = new String();
        for(int i=0; i<A.length(); i++){
            int val = A.charAt(i) -32;
            s += (char)val;
        }
        return s;
    }
}
