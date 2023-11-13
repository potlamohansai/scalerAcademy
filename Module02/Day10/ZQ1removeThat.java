/*
Problem Description
Write a program to input N numbers array, A from the user and an integer X and print the array by deleting element at specified position X.

Note: The first element is located at position 1, the second element is located at position 2, and so on.


Problem Constraints
2 <= N <= 100
1 <= A[i] <= 1000
1 <= X <= N
  */

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        int[] ans = new int[n-1];

        for(int i=0,j=0; i<n; i++){
            if(i != x-1){
                ans[j] = arr[i];
                j++;
            }
        }
        for(int i: ans){
            System.out.print(i+" ");
        }
        
        
    }
}
