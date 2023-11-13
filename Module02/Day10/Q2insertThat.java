/*
Problem Description

Write a program to input N numbers array, a number X and a number Y from user and insert an element Y in it at specified position X. X is based on 1-based indexing

Note: When an element is inserted at position X, all elements that were already present at position >= X, gets shifted to one position right, not replaced.

Problem Constraints

1 <= N <= 100

1 <= A[i] <= 1000

1 <= X <= N

1 <= Y <= 1000
  */

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
    
        for(int i=0; i<n; i++){
            A[i]= sc.nextInt();
        }
    
        int x = sc.nextInt();
        int y = sc.nextInt();
    
        int m = n+1;
        int B[] = new int[m];
    
        for(int i=0; i<x; i++){
            B[i] = A[i];
        }
        B[x-1] = y;
        for(int i=x; i<m; i++){
            B[i]=A[i-1];
        }
    
        for(int i=0; i<m; i++){
            System.out.print(B[i]+" ");
        }
    }
}
