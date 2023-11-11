/*
Problem Description
Take an integer N as input, print the corresponding Full Numeric Pyramid pattern for N.

For example if N = 5 then pattern will be like:

0 0 0 0 5 0 0 0 0 
0 0 0 4 8 12 0 0 0 
0 0 3 6 9 12 15 0 0
0 2 4 6 8 10 12 14 0
1 2 3 4 5 6 7 8 9 
NOTE: There should be exactly one extra space after each number for each row.


Problem Constraints
2 <= N <= 100
  */

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++ ){
            for(int j=1; j<n-i+1; j++){
                System.out.print(0+" ");
            }
            int st = n-i+1;
            int p = st;
            for(int j=1; j<=(2*i)-1;j++){
                System.out.print(p+" ");
                p = p+st;
            }
            for(int j=1; j<n-i+1; j++){
                System.out.print(0+" ");
            }
            System.out.println();
        }
    }
}
