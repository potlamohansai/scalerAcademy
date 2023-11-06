/*
Given an integer input N, print all multiples of 4 less than or equal to N.
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
        int start = 4;

        while(start <= n){
            System.out.print(start+" ");
            start +=4;
        }
    }
}
