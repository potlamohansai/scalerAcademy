/*
Given two names A and B as input, print "A says Hi to B" (Without quotations), where A and B are the names in input.
*/

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner s = new Scanner(System.in);
        String A = s.next();
        String B = s.next();
        System.out.print(A +" says Hi to " + B);
    }
}
