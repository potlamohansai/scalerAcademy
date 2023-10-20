public class Solution {
    public int solve(ArrayList<Integer> A, int B, int C) {
        int n = A.size();
        int k = B;
        ArrayList<Long> pf = new ArrayList<>();
        
        pf.add((long)A.get(0));
        for(int i=1; i<n; i++){
            pf.add(pf.get(i-1)+A.get(i));
        }
        
        
        for(int i=0; i<n-k+1; i++){
            long sum =0;
            int avg =0;
            int j = i+k-1;
            sum = pf.get(j) - pf.get(i);
            avg = (int)Math.floor(sum/k);
            if(avg <= C) return 1;
        }
        return 0;
    }
}
