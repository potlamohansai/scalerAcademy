/*Problem Description

Write a program to print all negative numbers from input array A of size N. Take integer N and N elements of the array as input from user.


Problem Constraints

1 <= N <= 1000

-1000 <= A <= 1000
  */

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];

        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            if(A[i]<0){
                System.out.print(A[i]+" ");
            }
        }
        
    }
}
