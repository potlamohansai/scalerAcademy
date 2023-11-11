/*
Problem Description

Given an integer N as input, print the corresponding Hollow Inverted Half Pyramid pattern for N.

For example if N = 6 then pattern will be like:

******
*   *
*  *
* *
**
*


Problem Constraints

1 <= N <= 100
  */

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i=1; i<n; i++){
            System.out.print("*");
            for(int j=1; j<n-i-1; j++){
                System.out.print(" ");
            }
            if(i<n-1){
                System.out.print("*\n");
            }
            
        }
    }
}
