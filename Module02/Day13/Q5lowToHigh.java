/*
Problem Description
You are given lowercase string (S) and you have to return a string that is the uppercase form of S.


Problem Constraints
1 <= S.size() <= 1000
  */


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
