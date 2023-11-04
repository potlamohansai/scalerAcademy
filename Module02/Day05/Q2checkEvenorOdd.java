/*
Write a program to input an integer from user and print 1 if it is odd otherwise print 0.
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
        int num = sc.nextInt();

        if(num%2 ==0){
            System.out.println(0);
        }
        else {
            System.out.println(1);
        }
    }
}
