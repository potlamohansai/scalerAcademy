/*Problem Description
Mr. Jim likes playing with strings a lot, so Mrs. Pam gifted him a string A which has some very unique magical powers. The string consists of lowercase latin letters 'p','a' and 'm' only.

In one wish, Mr Jim can perform one of the following operations:
Remove exactly one occurrence of 'p' and exactly one occurrence of 'm', from anywhere inside string A.
Remove exactly one occurrence of 'a' and exactly one occurrence of 'm', from anywhere inside string A.
Now Mr. Jim wants to know if after some number of wishes is it possible to make string A empty.

Return 1 if it is possible to make string A empty after some number of operations otherwise Return 0.


Problem Constraints
1 ≤ |A| ≤ 105
  */


public class Solution {
    public int solve(String A) {
        int len = A.length();

        if(len%2 !=0) return 0;

        int mCount =0;
        for(int i=0; i<len; i++){
            char ch = A.charAt(i);
            if(ch == 'm') mCount++;
        }
        
        if(mCount == len/2) return 1;
        return 0;
    }
}
