/*
Given the number N, Categorise the number according to following condition :
1. Odd-Positive
2. Odd-Negative
3. Even-Positive
4. Even-Negative

Note : Intention of problem is to teach you Nested If-Else, so try to solve this problem using nested if-else

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

        if(num%2 ==0) {
            if(num >0) {
                System.out.println("Even-Positive");
            }
            else {
                System.out.println("Even-Negative");
            }
        }
        else {
            if (num >0) {
                System.out.println("Odd-Positive");
            }
            else {
                System.out.println("Odd-Negative");
            }
        }
    }
}
