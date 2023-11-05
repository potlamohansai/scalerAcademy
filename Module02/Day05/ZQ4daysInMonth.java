/*
You are given an integer A.

You have to tell how many days are there in the month denoted by A in a non-leap year.

Months are denoted as follows:

January : 1
February : 2
March : 3
April : 4
May : 5
June : 6
July : 7
August : 8
September : 9
October : 10
November : 11
December : 12
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

        int month = sc.nextInt();

        if(month ==2){
            System.out.println(28);
        }else if(month == 1 || month ==3|| month ==5|| month ==7||month ==8 ||month ==10||month ==12){
            System.out.println(31);
        }else{
            System.out.println(30);
        }
    }
}
