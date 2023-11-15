/*
Problem Description:

Write a program that returns the list of elements that are present in the given list and are divisible by 5 and 7.

Input Format:

The only argument is the given list of elements
Output Format:

Return a list consisiting of the elements that are divisible by 5 and 7 from the given list.
    */



public static ArrayList<Integer> solve(ArrayList<Integer> arr) {
    // Complete function template here
    ArrayList<Integer> ans = new ArrayList<Integer>();
    for(int i=0; i<arr.size(); i++){
        int n =arr.get(i);
        if(n%5 ==0 && n%7==0){
            ans.add(n);
        }
    }
    return ans;
}
