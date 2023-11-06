/*
You are given an integer A as input and you need to determine whether it is a palindrome or not.
A palindrome integer is one whose digits, when reversed, result in the same number.
For example, 121 is a palindrome because its reverse is also 121, but 123 is not a palindrome because its reverse is 321.

Note: The given integer will not have any leading zeros.
    */


import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        int temp =A;
        int result =0;

        while(temp >0){
            int digit = temp%10;
            result = result*10 +digit;
            temp /=10;
        }

        if(result == A){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
