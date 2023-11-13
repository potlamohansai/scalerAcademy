/*
Problem Description

You are given a function that takes an integer argument A. Return 1 if A is a perfect square otherwise return 0.

A perfect square is an integer that is the square of an integer. For example 16 is perfect square as it is the square of an integer 4 (42 = 16)


Problem Constraints

1 <= A <= 108
  */

public class Solution {
    public int solve(int A) {
        int num =(int) Math.sqrt(A);
        if(num*num == A) return 1;
        return 0;
    }
}
