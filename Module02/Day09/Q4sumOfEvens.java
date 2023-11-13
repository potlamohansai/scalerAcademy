/*Problem Description
You are given an integer A, you need to find and return the sum of all the even numbers between 1 and A.

Even numbers are those numbers that are divisible by 2.



Problem Constraints
1 <= N <= 500
*/

public class Solution {
    public int solve(int A) {
        int sum =0;
        for(int i=2; i<=A; i=i+2){
            sum +=i;
        }
        return sum;
    }
}
