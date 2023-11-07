/*
Take an integer N as input and print the count of its factors.
The factor of a number is the number that divides it perfectly leaving no remainder.

Example: 1, 2, 3, and 6 are factors of 6
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

        int n = sc.nextInt();
        int count =0;

        for (int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
