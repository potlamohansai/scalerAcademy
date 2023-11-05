/*
You are given 3 integer angles(in degrees) A, B and C of a triangle. You have to tell whether the triangle is valid or not.

A triangle is valid if sum of its angles equals to 180.
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
        int c = sc.nextInt();

        if((a+b+c)==180) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
