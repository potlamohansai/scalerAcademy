/*Problem Description
Given a number A. Return 1 if A is prime and return 0 if not. 
Note : 
The value of A can cross the range of Integer.

Problem Constraints
1 <= A <= 10^9
*/

//Time Complexity O(sqrt(A))
//Space Complexity O(1)

public class Solution {
    public int solve(int A) {
        int count=0;
        for(int i=1; i*i<=A; i++){
            if(A%i ==0){
                if(i == A/i) count++;
                else count +=2;
            }
        }
        if(count==2) return 1;
        return 0;
    }
}
