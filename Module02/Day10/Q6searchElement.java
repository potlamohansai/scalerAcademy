/*
Problem Description

You are given an integer T (number of test cases). You are given array A and an integer B for each test case. You have to tell whether B is present in array A or not.

Problem Constraints

1 <= T <= 10
1 <= A <= 105
1 <= A[i], B <= 109
  */

import java.lang.*;
import java.util.*;

public class Main {
    public static int findValue(int arr[],int n,int B){
        for(int i=0; i<n; i++){
                if(arr[i] == B){
                    return 1;
                }
        }
        return 0;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int len = sc.nextInt();
            int A[] = new int[len];

            for(int i=0; i<len; i++){
                A[i] = sc.nextInt();
            }
          
            int B = sc.nextInt();
            System.out.println(findValue(A,len,B));
        }
    }
}
