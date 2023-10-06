public class Solution {
    public Long subarraySum(ArrayList<Integer> A) {
        long totalSum = 0;
        long len = A.size();
        for(int i=0; i<len; i++){
            long count = (i+1)*(len-i);
            long contrib = count*(long)A.get(i);
            totalSum +=contrib;
        }
        return totalSum;
    }
}
