/*Problem Description

You are given a positive integer A denoting the radius of a circle. You have to calculate the area of the circle.

Note :

The formula for the area of a circle is Area = πr², where r is the radius of the circle.
You can use the value of PI as 3.1416
Round up the final answer up to 2 decimal places. You can use round(area, 2) it for rounding area to 2 decimal places


Problem Constraints

1 <= A <= 1000
    */


public class Solution {
    public int solve(int A) {
        double area = Math.PI*A*A;
        return (int)Math.ceil(area);
    }
}
