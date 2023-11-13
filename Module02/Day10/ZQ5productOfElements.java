/*
Problem Description:

Write a program that returns the product of all elements present in the array.

Constraints:

1 <= |A| <= 100
1 <= A <= 100
Note: It is guaranteed that the resultant product will be <= 1015
  */

public static long solve(int[] arr) {
    // Complete the function template here
    int len = arr.length;
    long ans = 1;
    for(int i=0; i<len; i++){
        ans *=arr[i];
    }
    return ans;
}
