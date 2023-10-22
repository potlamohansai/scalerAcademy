public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxProfit(final int[] A) {
        int n = A.length;
        int least = Integer.MAX_VALUE;
        int max_profit =0;
        int profit =0;

        for(int i=0; i<n; i++){
            if(A[i]<least){
                least = A[i];
            }
            profit = A[i]-least;
            max_profit = Math.max(max_profit,profit);
        }
        return max_profit;
    }
}
