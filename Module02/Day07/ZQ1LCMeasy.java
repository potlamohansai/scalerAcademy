/*
Problem Description
Implement a program that takes two positive integers A and B in the input and prints their LCM.

Definition of LCM : The Least Common Multiple or LCM of two numbers say A and B, is denoted as LCM (A,B). And the LCM is the smallest or least positive integer that is divisible by both A and B.



Problem Constraints
1 <= A,B <= 200
  */

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=1; i<=a*b; i++){
            if(i%a==0 && i%b==0){
                System.out.println(i);
            }
        }
    }
}
