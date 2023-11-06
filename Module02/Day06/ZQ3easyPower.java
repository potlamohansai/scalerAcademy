/*
You are given two integers A and B. You have to find the value of AB.

NOTE: The value of AB will always be less than or equal to 109.
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
        int value =1;

        while(b>0){
            value *=a;
            b--;
        }
        System.out.println(value);
    }
}
