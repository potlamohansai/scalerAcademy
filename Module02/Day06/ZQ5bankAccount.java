/*
You have been provided with a bank account that has an initial balance of N amount. You are now required to perform two operations on this account, namely, ADD and SUBTRACT.

ADD operation: This operation increases the account balance by a certain amount and you are expected to print the updated balance after each ADD operation.
SUBTRACT operation: This operation decreases the account balance by a certain amount and you are again expected to print the updated balance after each SUBTRACT operation.
However, if the amount you are trying to subtract (i.e., debit) from the account balance is greater than the current balance, you should print "Insufficient Funds" (without quotes) instead of the updated balance. In this case, the operation should be skipped, and the account balance should remain unchanged.

Note :
Initial Amount N and Amount that is given are larger numbers.
  */

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();

        int opnum = sc.nextInt();

        long result = N;

        while(opnum>0){
            int op = sc.nextInt();
            long X = sc.nextLong();

            if(op ==1){
                result +=X;
                System.out.println(result);
            }else if(result>=X){
                result -=X;
                System.out.println(result);
            }else {
                System.out.println("Insufficient Funds");
            }
            opnum--;
        }
        
    }
}
