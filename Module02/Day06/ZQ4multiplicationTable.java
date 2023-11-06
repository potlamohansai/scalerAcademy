/*
Take a number A as input, print its multiplication table having the first 10 multiples.
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
        int i =1;
        while(i<=10){
            System.out.println(a+" * "+i+" = "+a*i);
            i++;
        }
    }
}
