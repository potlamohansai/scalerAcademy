/*Problem Description
Given an Array of integers B, and a target sum A.
Check if there exists a pair (i,j) such that Bi + Bj = A and i!=j.


Problem Constraints
1<= Length of array B <= 103
0<= Bi <=109
0<= A <=109
  */

public class Solution {
    public int solve(int A, ArrayList<Integer> B) {
        int n = B.size();
        HashSet<Integer> hm = new HashSet<>();
    
        for(int i=0; i<n; i++){
            int K = A- B.get(i);
            if(hm.contains(K)){
                return 1;
            }else{
                hm.add(B.get(i));
            }
        }
        return 0;

    }
}
