/*
Problem Description
You are given an integer N you need to print all the Armstrong Numbers between 1 to N. (N inclusive).

If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.

For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ).

Note: All the test cases in this problem are limited to 3 digit numbers.



Problem Constraints
1 <= N <= 500

    */


import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            int temp =i;
            int sum =0;
            while(temp>0){
                int digit = temp%10;
                sum += (digit*digit*digit);
                temp /=10;
            }
            if(sum==i){
                System.out.println(i);
            }
        }
        
    }
}
