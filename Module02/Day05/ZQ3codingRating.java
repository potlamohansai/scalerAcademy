/*
Write a program to input from user an integer(n) representing the rating of a person on a platform.

You have to print the category of that person.

If the rating is greater than or equal to 2100 then that person is "grand master".
If the rating is greater than or equal to 1900 then that person is "candidate master".
If the rating is greater than or equal to 1600 then that person is "expert".
If the rating is greater than or equal to 1400 then that person is "pupil".
If the rating is smaller than 1400 then that person is "newbie".
NOTE: Print all the chars of the category of the person in lowercase if rating is odd otherwise print in UPPERCASE
  */

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);

        int rating = sc.nextInt();
        String result;
        if(rating >= 2100){
            result = "grand master";
        }
        else if(rating >= 1900){
            result = "candidate master";
        }
        else if(rating >= 1600){
            result = "expert";
        }
        else if(rating >= 1400){
            result = "pupil";
        }else{
            result = "newbie";
        }

        if(rating % 2 ==0){
            System.out.println(result.toUpperCase());
        }else {
            System.out.println(result);
        }
    }
}
