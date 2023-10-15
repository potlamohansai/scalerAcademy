public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int kthsmallest(final List<Integer> A, int B) {
        List<Integer> a = new ArrayList<Integer>(A);
        int n = a.size();
        for(int i=0; i<B; i++){
            for(int j=i+1; j<n; j++){
                if(a.get(j) < a.get(i)){
                    int temp = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, temp);
                }
            }
        }
        return a.get(B-1);
    }
}
