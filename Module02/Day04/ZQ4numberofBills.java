/*
Given total bills amount and amount of a single bill. Print number of bills.

Note : The total amount is equally splitted in all bills. The number of bills should be an integer value.
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

        float totalBudget = sc.nextFloat();
        int bill = sc.nextInt();
        int totalBills =(int) totalBudget/bill;

        System.out.println(totalBills);
    }
}
