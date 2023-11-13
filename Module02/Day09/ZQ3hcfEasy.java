/*Problem Description
Write a program to input two integers A & B from user and print their HCF.

Definition Of HCF: The HCF(Highest Common Factor) or the GCD(greatest common divisor) of two positive integers happens to be the largest positive integer that divides the numbers without leaving a remainder.

Problem Constraints
1 <= A,B <= 100000
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
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(hcf(a,b));
    }
    public static int hcf(int a, int b){
        int gtr = a>b?a:b;
        int lsr = a<b?a:b;
        int rem =1;
        while(rem!=0){
            rem = gtr%lsr;
            gtr = lsr;
            lsr = rem;
        }
        return gtr;
    }
}
