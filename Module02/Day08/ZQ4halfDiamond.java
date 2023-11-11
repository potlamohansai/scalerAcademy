/*Problem Description

Take an integer N as input, print the corresponding Half Diamond pattern with 2*N - 1 rows.

For example if N = 5 then pattern will be like:

* 
**
***
****
*****
****
***
**
*
NOTE: There should be no spaces after any * .


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
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=n-1; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
