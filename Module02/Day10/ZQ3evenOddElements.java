/*
Problem Description
You are given T(number of test cases) integer arrays. For each array A, you have to find the value of absolute difference between the counts of even and odd elements in the array.



Problem Constraints
1 <= T <= 10

1 <= |A| <= 105

1 <= A[i] <= 109
  */

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int odd =0;
            int even =0;
            int len = sc.nextInt();
            int[] A = new int[len];

            for(int i=0; i<len; i++){
                A[i] = sc.nextInt();
            }

            for(int i=0; i<len; i++){
                if(A[i]%2 ==0 ) even++;
                else odd++; 
            }
            System.out.println(Math.abs(even -odd));
        }
        
    }
}
