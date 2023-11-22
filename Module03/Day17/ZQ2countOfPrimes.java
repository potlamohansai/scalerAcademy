/*Problem Description
You will be given an integer n. You need to return the count of prime numbers less than or equal to n.

Problem Constraints
0 <= n <= 10^3
*/

//Time Complexity O(A^2)
//Space Complexity O(1)

public class Solution {
    public int solve(int A) {
        int prime=0;
        for(int j=1; j<=A; j++){          //iterating from 1 to A
            int count=0;
            for(int i=1; i<=j; i++){       //iterating from 1 to j
            if(j%i ==0){
                count++;
            }
            }
            if(count ==2) prime++;
        }
        return prime;
    }
}


/*
Let's analyze the time complexity of the given code.

The outer loop runs from 1 to A, and for each iteration of the outer loop, there is an inner loop that runs from 1 to the current value of the outer loop variable `j`. In the inner loop, there is a simple if statement checking if `j` is divisible by `i`.

The inner loop runs `j` times for each iteration of the outer loop. So, the total number of iterations of the inner loop across all iterations of the outer loop is:[1 + 2 + 3 +.....+ A]

This is the sum of the first (A) positive integers, which can be expressed as: [A.(A + 1)]/2

Therefore, the time complexity of the given code is O([A.(A + 1)]/2), which simplifies to O(A^2) in big-O notation, as we usually focus on the dominant term.
*/
