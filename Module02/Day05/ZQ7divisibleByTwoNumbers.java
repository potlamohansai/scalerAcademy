/*
Take an integer A as input. You have to tell whether A is divible by both 5 and 11 or not.
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

        if (num % 5 ==0 && num%11 ==0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
