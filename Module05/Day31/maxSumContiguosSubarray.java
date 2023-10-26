//Kadane's Algorithm

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int n = A.size();
        int sum = 0;
        int max = A.get(0);

        for(int i=0; i<n; i++){
            sum += A.get(i);

            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum=0;
            }
        }
        return max;
    }
}
