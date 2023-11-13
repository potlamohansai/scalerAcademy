/*
Alex is fond of chocolates. He has initially A rupees and a single chocolate costs B rupees.

But too many chocolates are not good for health, so Alex will not buy more than C chocolates.

Find the number of chocolates Alex will buy with the money he has.

Input Format
The First argument given is an integer A.
The Second argument given is an integer B.
The Third argument given is an integer C.
  
Output Format
Return the number of chocolates Alex will buy.
  
Constraints
1 <= A, B, C <= 10^6
  */

public class Solution {
    public int solve(int A, int B, int C) {
        int noOfChocos = A/B;
        if(noOfChocos<=C){
            return noOfChocos;
        }
        return C;
    }
}
