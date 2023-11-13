/*
Problem Description
Write a function to check if the given array A has consecutive duplicate elements or not.
Return True if there are consecutive duplicate elements in the list else return False.

Here by consecutive duplicates, we mean duplicates that are present at consecutive indices in the array


Problem Constraints
1 <= N <= 105
1 <= A[i] <= 109
    */

public static boolean solve(int arr[]) {
    // Complete the function here
    int len = arr.length;
    for(int i=0; i<len-1; i++){
        if(arr[i] == arr[i+1]) return true;
    }
    return false;
}
