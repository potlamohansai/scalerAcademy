/*
You take a number of test cases, denoted by T as input.For each test case, you should take integers N as input. Your task is to calculate and print the sum of the digits of the given number N.
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

        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            int sum =0;
            while(n>0){
                sum += n%10;
                n /=10;
            }
            System.out.println(sum);
            t--;
        }
    }
}
