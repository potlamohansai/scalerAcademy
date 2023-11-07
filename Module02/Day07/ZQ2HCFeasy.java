/*
Problem Description
Write a program to input two integers A & B from user and print their HCF.

Definition Of HCF: The HCF(Highest Common Factor) or the GCD(greatest common divisor) of two positive integers happens to be the largest positive integer that divides the numbers without leaving a remainder.



Problem Constraints
1 <= A,B <= 100000
  */

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf =1;

        for(int i=1; i<=Math.min(a,b); i++){
            if(a%i==0 && b%i==0){
                hcf =i;
            }
        }
        System.out.println(hcf);
    }
}
