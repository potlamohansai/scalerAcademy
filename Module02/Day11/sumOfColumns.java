public class Solution {
    public ArrayList<Integer> solve(int A, int B, ArrayList<ArrayList<Integer>> C) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int j =0; j<B; j++){
            int sum =0;
            for(int i=0; i<A; i++){
                sum += C.get(i).get(j);
            }
            ans.add(sum);
        }
        return ans;
    }
}
