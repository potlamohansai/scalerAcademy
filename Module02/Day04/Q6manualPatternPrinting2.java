/*
Print the following pattern in output

    *
   **
  ***
 ****
*****

*/

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        for(int i=4; i>=0; i--){
            for(int j=i; j>0; j--){
                System.out.print(" ");
            }
            for(int k=i; k<5; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
