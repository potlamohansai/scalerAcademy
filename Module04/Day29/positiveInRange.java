public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        int alen = A.size();
        int blen = B.size();
        
        ArrayList<Integer> pf = new ArrayList<>();
        int c =0;
        for(int i=0; i<alen; i++){
            if(A.get(i)>=0){
                c++;
                pf.add(c);
            }else{
                pf.add(c);
            }
        }
        
        for(int i=0; i<blen; i++){
            int s = B.get(i).get(0), e=B.get(i).get(1);
            int num =0;
            if(s>0){
                num = pf.get(e) -pf.get(s-1);
            }else{
                num = pf.get(e);
            }
            ans.add(num);
        }
        
        // for(int i=0; i<blen; i++){
        //     int s = B.get(i).get(0), e=B.get(i).get(1);
        //     int num =0;
        //     for(int j=s; j<=e; j++){
        //         if(A.get(j)>=0) num++;
        //     }
        //     ans.add(num);
        // }
        return ans;
    }
}
