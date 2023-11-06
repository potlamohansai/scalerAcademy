/*
Take an integer A as input. You have to print the sum of all odd numbers in the range [1, A].
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
        int sum =0;
        int i =1;

        while(i<=a){
            sum +=i;
            i +=2;
        }
        System.out.println(sum);
    }
}
