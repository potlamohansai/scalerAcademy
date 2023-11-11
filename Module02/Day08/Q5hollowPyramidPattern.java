/*
Problem Description
Take an integer N as input, print the corresponding pattern for N.

For example if N = 5 then pattern will be like:

********** // 0 spaces

****__**** // 2 spaces

***____*** // 4 spaces

**______** // 6 spaces

*________* // 8 spaces
NOTE: Here '_' is used to represent spaces. You have to print spaces in your code.



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
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            for(int k=1; k<=(2*i)-2; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
