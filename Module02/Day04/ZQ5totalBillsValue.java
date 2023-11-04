/*Given the value of a single bill and the number of bills you received, print the total value of the bills.

Note: The value of all the bills are same
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

        int bill = sc.nextInt();
        int noOfBill = sc.nextInt();
        System.out.println(bill*noOfBill);
    }
}
