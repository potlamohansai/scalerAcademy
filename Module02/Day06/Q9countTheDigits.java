/*
Take T (number of test cases) as input.
For each test case, take integer N as input and Print the count of digits of that number.

Note: No of digits for number 0 is considered as 1.
  */

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for oupt    S
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            int count=0;
            if(n==0) System.out.println(1);
            else{
                while(n>0){
                count++;
                n /=10;
                }
                System.out.println(count);
            }
            t--;
        }
    }
}
