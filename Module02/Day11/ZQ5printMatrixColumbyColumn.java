/*
Problem Description
Given a matrix of N rows and M columns, print it column by column. Firstly print 0th column, then 1st column, 2nd column and so on.


Problem Constraints
1 <= N <= 100
1 <= M <= 100
1 <= mat[i][j] <= 10000
  */


import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] A = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                A[i][j] = sc.nextInt();
            }
        }

        for(int j=0; j<m; j++){
            for(int i=0; i<n; i++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
