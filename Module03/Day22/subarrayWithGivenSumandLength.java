public class Solution {
    public int solve(ArrayList<Integer> A, int B, int C) {
        // Using Prefix Sum Time Complexity:O(N) and Space Complexity:O(N) 
        // ArrayList<Integer> pf = new ArrayList<Integer>();
        // pf.add(A.get(0));
        // int n = A.size();
        // for(int i=1; i<n; i++){
        //     pf.add(pf.get(i-1)+A.get(i));
        // }

        // for(int i=0; i<n-B+1; i++){
        //     int j = i+B-1;
        //     int sum =0;
        //     if(i==0){
        //         sum = pf.get(j);
        //     }else{
        //         sum = pf.get(j) - pf.get(i-1);
        //     }

        //     if(sum == C && j-i+1 ==B ) return 1;
        // }
        // return 0;

        //Using Sliding window technique Time Complexity:O(N) and Space Complexity O(1)
        int sum =0;
        int n = A.size();
        for(int i=0; i<B; i++){
            sum += A.get(i);
        }
        if(sum == C) return 1;

        int i=1;
        int j=B;
        while(j<n){
            sum = sum - A.get(i-1) + A.get(j);
            if(sum == C) return 1;
            i++;
            j++;
        }
        return 0;
    }
}
