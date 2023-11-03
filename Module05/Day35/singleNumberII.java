/*Given an array of integers, every element appears thrice except for one, which occurs once.

Find that element that does not appear thrice.

NOTE: Your algorithm should have a linear runtime complexity.

Could you implement it without using extra memory? */


public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {
        int n = A.length;
        int ans =0;

        for(int i =0; i<32; i++){
            int count=0;
            for(int j=0; j<n; j++){
                if((A[j]&(1<<i)) >0) count++;
            }
            if(count%3 ==1){
                ans |= (1<<i);
            }
        }

        return ans;
    }
}
