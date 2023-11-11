/*
Problem Description
Take an integer N as input, print the corresponding pattern for N.

For example if N = 5 then pattern will be like:

*****
_****
__***
___**
____*
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

        for(int i =1; i<=n; i++){
            for(int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=n-i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
