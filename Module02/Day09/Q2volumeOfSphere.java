/*Problem Description

You are given a positive integer A denoting the radius of a sphere. You have to calculate the volume of the sphere.

Volume of a sphere having radius R is given by (4 * π * R3) / 3.

NOTE: Since, the answer can be a real number, you have to return the ceil value of the volume. Ceil value of a real number X is the smallest integer that is greater than or equal to X.



Problem Constraints

1 <= A <= 400
  */

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final int A) {
        double volume = (4*Math.PI*Math.pow(A,3))/3;
        int ans = (int)Math.ceil(volume);
        return ans;
    }
}
