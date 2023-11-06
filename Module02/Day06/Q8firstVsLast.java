/*
Write a program that asks the user to input a number T, indicating the number of test cases.
Then, for each test case, ask for input a number N and print the first and last digits of N.
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
            int lastDigit = n%10;
            int firstDigit =0;
            while(n>0){
                firstDigit = n%10;
                n /=10;
            }
            System.out.println(firstDigit+" "+lastDigit);
            t--;
        }
    }
}
