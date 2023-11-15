/*
Problem Description:

Write a program that returns the product of all elements present in the array.

Constraints:

1 <= |A| <= 100
1 <= A <= 100
Note: It is guaranteed that the resultant product will be <= 1015
  */


public static long solve(ArrayList<Integer> arr) {
    // Complete the function template here
    long res = 1;
        for(int num : arr){
            res *=num;
    }
    return res;
}
