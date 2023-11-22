/*Problem Description
You are given an integer A. You have to tell whether it is a perfect number or not.
Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
A proper divisor of a natural number is the divisor that is strictly less than the number.

Problem Constraints
1 <= A <= 10^6
*/

//Time Complexity O(A)
//Space Complexity O(1)

public class Solution {
    public int solve(int A) {
        int sum =0;
        for(int i=1; i<A; i++){               //traversing from 1 to A
            if(A%i == 0){
                sum +=i;
            }
        }
        if(sum == A){
            return 1;
        }
        return 0;
    }
}
