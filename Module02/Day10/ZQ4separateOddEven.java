/*
Problem Description
You are given an integer T denoting the number of test cases. For each test case, you are given an integer array A.

You have to print the odd and even elements of array A in 2 separate lines.

NOTE: Array elements should have the same relative order as in A.



Problem Constraints
1 <= T <= 10

1 <= |A| <= 105

1 <= A[i] <= 109
  */

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int len = sc.nextInt();
            int[] A = new int[len];
            for(int i=0; i<len; i++){
                A[i] = sc.nextInt();
            }

            for(int i:A){
                if(i%2!=0) System.out.print(i+" ");
            }
            System.out.println();
            for(int i:A){
                if(i%2 ==0) System.out.print(i+ " ");
            }
            System.out.println();

        }
        
    }
}
