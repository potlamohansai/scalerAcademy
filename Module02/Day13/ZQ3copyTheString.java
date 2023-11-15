/*
Problem Description

You will be given a constant string (A).

You have to return another copy of that input string after removing last character from it.



Problem Constraints

1 <= A.size() <= 1000
  */


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public String solve(final String A) {
        String ans = new String();
        for(int i=0; i<A.length()-1; i++){
            ans += A.charAt(i);
        }
        return ans;
    }
}
