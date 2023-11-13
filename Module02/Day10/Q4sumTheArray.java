/*
Problem Description

Write a program to print sum of elements of the input array A of size N.

Note: the size element is removed from the list passed as input to the function main, that is only elements are present. User is supposed to add them up and return the result


Problem Constraints

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
        int sum =0;

        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
            sum +=A[i];
        }

        System.out.println(sum);

    }
}
