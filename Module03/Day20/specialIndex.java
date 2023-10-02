public class Solution {
    public int solve(int[] A) {
        int len = A.length;
        long[] pfe = new long[len];
        long[] pfo = new long[len];
      
      //prefixsum array for even indices
        pfe[0] = A[0];
        for(int i=1; i<len; i++){
            if(i%2 ==0){
                pfe[i] = pfe[i-1]+A[i];
            }else{
                pfe[i] = pfe[i-1];
            }
        }

      //prefixsum array for odd indices
        pfo[0] = 0;
        for(int i=1; i<len; i++){
            if(i%2 ==0){
                pfo[i] = pfo[i-1];
            }else{
                pfo[i] = pfo[i-1]+A[i];
            }
        }

        int count =0;
        for(int i=0; i<len; i++){
            long sumofeven = 0;
            long sumofodd = 0;
            if(i==0){
                sumofeven = pfo[len-1]-pfo[i];
                sumofodd = pfe[len-1]-pfe[i];
            }else{
                sumofeven = pfe[i-1]+pfo[len-1]-pfo[i];
                sumofodd = pfo[i-1]+pfe[len-1]-pfe[i];
            }
            if(sumofeven == sumofodd) count++;
        }
        return count;
    }
}
