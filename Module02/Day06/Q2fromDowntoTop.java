/*
Write a program to print all Natural numbers from N to 1 where you have to take N as input from user
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

        while(n>0){
            System.out.print(n+" ");
            n--;
        }
    }
}
