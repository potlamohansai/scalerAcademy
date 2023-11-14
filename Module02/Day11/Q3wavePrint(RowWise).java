/*
Problem Description
You are given an integer matrix mat and you have to print the elements of the matrix in wave form (row wise)

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
        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            if(i%2 ==0){
                for(int j=0; j<n; j++){
                    System.out.print(arr[i][j]+ " ");
                }
            }else{
                for(int j=n-1; j>=0; j--){
                    System.out.print(arr[i][j]+ " ");
                }
            }
        }
    }
}
