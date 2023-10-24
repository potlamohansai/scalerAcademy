public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int n = A.size();
        ArrayList<Integer> ans = new ArrayList<>();
        
        int maxi =A.get(n-1);
        ans.add(maxi);

        for(int i=n-2; i>=0; i--){
            if(A.get(i)>maxi){
                ans.add(A.get(i));
                maxi = A.get(i);
            }
        }
        return ans;
    }
}
