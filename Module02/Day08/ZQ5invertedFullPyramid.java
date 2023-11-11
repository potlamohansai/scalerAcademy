/*Problem Description

Take an integer N as input, and print the corresponding Inverted Full Pyramid pattern for N.

For example if N = 5 then pattern will be like:

* * * * * 
 * * * * 
  * * * 
   * *    
    * 
NOTE: There should be exactly one extra space after each * for each row.



Problem Constraints

2 <= N <= 100
  */


import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=n-i+1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
