/*
Problem Description

Given an integer N, print the corresponding Inverted Half Pyramid pattern for N.

For example if N = 4 then pattern will be like:

****
***
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

        for (int i=0; i<n; i++){
            for(int j=n-i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
