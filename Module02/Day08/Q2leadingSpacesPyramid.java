/*Problem Description
Take an integer N as input, print the corresponding pattern for N.

For example if N = 5 then pattern will be like:

____*
___**
__***
_****
*****
Note : Here '_' represents space for explanation purpose only. You have to print space in your code.


Problem Constraints
1 <= N <= 100
  */

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row=1; row<=n; row++){
            for(int sp =1; sp<=n-row; sp++){
                System.out.print(" ");
            }
            for(int str=1; str<=row; str++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
