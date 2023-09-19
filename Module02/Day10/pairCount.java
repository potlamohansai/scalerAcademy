public class Solution {
  // Do not write code to include libraries, main() function or accept any input from the console.
  // Initialization code is already written and hidden from you. Do not write code for it again.
  public int solve(int[] A, int B) {
      // Just write your code below to complete the function. Required input is available to you as the function arguments.
      // Do not print the result or any output. Just return the result via this function.
      int len = A.length;
      int count =0;
      for(int i=0; i<len-1; i++){
          for(int j=i+1; j<len; j++){
            int sum = A[i]+A[j];
            if(sum == B) count++;
          }
          
      }
      return count;
  }
}
