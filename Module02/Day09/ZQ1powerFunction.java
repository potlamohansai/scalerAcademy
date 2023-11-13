/*Problem Description

You are given two integers A and B.

You have to find the value of AB.

NOTE: The value of answer is always less than or equal to 109.


Problem Constraints

1 <= A, B <= 1000
  */

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int power(final int A, final int B) {
        double ans = Math.pow(A,B);
        return (int)ans;
    }

}
