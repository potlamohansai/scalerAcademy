/*
Problem Description

You are given uppercase string (S) and you have to return a string that is the lower case form of S.

Uppercase strings are those which have all letters in uppercase (Example: MACHINE)

Lowercase strings are those which have all letters in lowercase (Example: machine)

Problem Constraints

1 <= S.size() <= 1000
  */

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
