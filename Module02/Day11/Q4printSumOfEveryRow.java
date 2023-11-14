/*Problem Description

Write a program to input an N X M matrix A from user and print sum of every row.


Problem Constraints

1 <= N <= 100
1 <= M <= 100
1 <= A[i][j] <= 10000
  */

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            int sum =0;
            for(int j=0; j<m; j++){
                sum += arr[i][j];
            }
            System.out.print(sum+ " ");
        }
    }
}
