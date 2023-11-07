/*
Problem Description
Print a pattern consisting of N rows, where each row contains an asterisk (*) at the beginning and end of the line, with N-2 spaces in between.

The Pattern should look like:

*<N-2 Spaces>*

Print the above pattern for a total of N Rows.

Refer Example ouput, for better clarification.
Example Input
Input 1:
 2
Input 2:
 4

Example Output
Output 1:

**
**
Output 2:

*  *
*  *
*  *
*  *

Problem Constraints
2 <= N <= 100

*/

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.print("*");
            for(int k=1; k<=n-2; k++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
