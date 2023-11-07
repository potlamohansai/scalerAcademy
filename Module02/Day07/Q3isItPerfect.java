/*
Given the Number of Test Cases as T,
For each test case, take an integer N as input, you have to tell whether it is a perfect number or not.

A perfect number is a positive integer that is equal to the sum of its proper positive divisors (excluding the number itself). 
A positive proper divisor divides a number without leaving any remainder.
  */

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
      
        while(t>0){
            int n = sc.nextInt();
            int sum =0;
            for(int i=1; i<n; i++){
                if(n%i==0){
                    sum =sum+i;
                }
            }

            if(sum == n){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
