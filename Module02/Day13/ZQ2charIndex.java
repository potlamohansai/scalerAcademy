/*
Problem Description
Shivam has a string A of size N containing only lowercase characters. He will update the string by inserting a number after every char which will be the index of that char.

For E.g.: if string is azd then it will be updated as a1z26d4 since index of a is 1, of z is 26 and of d is 4.

You have to tell how the string will look like afterwards,



Problem Constraints
1 <= A.size() <= 1000

a <= A[i] <= z
  */

public class Solution {
    public String solve(String A) {
        String ans = new String();
        int n = A.length();
        for(int i=0; i<n; i++){
            char ch = A.charAt(i);
            int val = ch - 96;
            ans += ch;
            ans += val;
        }
        return ans;
    }
}
