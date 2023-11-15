/*
Problem Description

You are given a character string A having length N.

The string consists of 2 types of characters:

Alphabets : ['a'-'z', 'A'-'Z']
Digits: ['0'-'9']
You have to tell the count of characters of the maximum occuring character type.



Problem Constraints

1 <= N <= 105
  */


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final String A) {
        int aCount =0;
        int dCount =0;

        for(int i=0; i<A.length(); i++){
            char c = A.charAt(i);
            if((c >= 'A' && c <= 'Z') || (c>='a' && c<='z')) aCount++;
            else dCount++;
        }

        return Math.max(aCount,dCount);
    }
}
