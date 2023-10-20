public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int majorityElement(final List<Integer> A) {
        int n = A.size();
        int maj = A.get(0);
        int freq = 1;

        for(int i=1; i<n; i++){
            if(freq==0){
                maj = A.get(i);
                freq++;
            }else if(maj != A.get(i)){
                freq--;
            }else{
                freq++;
            }
        }

        int count =1;
        for(int i=0; i<n; i++){
            if(A.get(i).equals(maj)) count++;
        }

        if(count>n/2) return maj;
        return -1;
    }
}
