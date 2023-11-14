/*
Problem Description
Write a program to input an integer N and a N*N matrix Mat from user and print the matrix in wave form (column wise)

See example for clarifications regarding wave print.


Problem Constraints
1 <= N <= 103

0 <= Mat[i][j] <= 109
  */

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int m = n;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int j=0; j<n; j++){
            if(j%2==0){
                for(int i=0; i<n; i++){
                    System.out.print(arr[i][j]+ " ");
                }
            }else{
                for(int i=n-1; i>=0; i--){
                    System.out.print(arr[i][j]+ " ");
                }
            }
        }
    }
}
