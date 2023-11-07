/*
Given two integers N and M as inputs, print a rectangle of N * M stars.

For example if N = 3, M = 4 then pattern will be like:

****
****
****
=========
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

        int N = sc.nextInt();
        int M = sc.nextInt();

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
