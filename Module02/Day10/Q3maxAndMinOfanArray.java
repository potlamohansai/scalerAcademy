/*
Problem Description

Take input an array A of size N and write a program to print maximum and minimum elements of the input. The only line of the input would contain a single integer N that represents the length of the array followed by the N elements of the input array A.

Problem constraints

1 <= N <= 1000

1 <= A <= 1000
  */

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int A[] = new int[n];
    

    for(int i=0; i<n; i++){
        A[i] = sc.nextInt();
    }
    int min = A[0];
    int max = A[0];
    for(int i=0; i<n; i++){
        if(A[i] < min){
            min = A[i];
        }
        if(A[i]> max){
            max = A[i];
        }
    }
    System.out.println(max+ " " +min);
    }
}
