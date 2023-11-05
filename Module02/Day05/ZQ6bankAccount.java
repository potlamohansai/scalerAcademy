/*
You are given a Bank account having N amount and you are asked to perform ADD(credit) or SUBTRACT(debit) operation of an amount X.

After the operation print the amount left in the Bank account. If the debit amount is greater than current balance print "Insufficient Funds"(without quotes) and the operation is skipped.
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

        int initialFund = sc.nextInt();

        int op = sc.nextInt();
        int amount = sc.nextInt();

        if(op == 1){
            System.out.println(initialFund+amount);
        }else if(op ==2 && initialFund>=amount){
            System.out.println(initialFund-amount);
        }else {
            System.out.println("Insufficient Funds");
        }
    }
}
