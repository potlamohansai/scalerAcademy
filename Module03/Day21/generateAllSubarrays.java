public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        int len = A.size();
        for(int i=0; i<len; i++){                                    //this loop for starting 
            for(int j=i; j<len; j++){                                //this loop for ending
                ArrayList<Integer> sub = new ArrayList<Integer>();
                for(int k=i; k<=j; k++){                             //this loop for printing subarrays from i to j
                    sub.add(A.get(k));
                }
                ans.add(sub);
            }
        }
        return ans;
    }
}
