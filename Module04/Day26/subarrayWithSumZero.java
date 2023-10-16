public class Solution {
  // Do not write code to include libraries, main() function or accept any input from the console.
  // Initialization code is already written and hidden from you. Do not write code for it again.
  public int solve(ArrayList<Integer> A) {
      // Just write your code below to complete the function. Required input is available to you as the function arguments.
      // Do not print the result or any output. Just return the result via this function.
      int n = A.size();
      ArrayList<Long> pf = new ArrayList<>();
      long sum =0;
      for(int i =0; i<n; i++){
          sum += A.get(i);
          pf.add(sum);
      }

      HashSet<Long> res = new HashSet<>();
      for(int i =0; i<n; i++){
          if(pf.get(i) == 0) return 1;
          res.add(pf.get(i));
      }

      if(res.size() < n) return 1;
      return 0;
  }
}
