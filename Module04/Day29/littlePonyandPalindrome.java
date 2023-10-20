public class Solution {
    public int solve(String A) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int n = A.length();
        for(int i=0; i<n; i++){
            char ch = A.charAt(i);
            if(hm.containsKey(ch)== false){
                hm.put(ch, 1);
            }else{
                int oldValue = hm.get(ch);
                int newValue = oldValue+1;
                hm.put(ch , newValue);
            }
        }
        //System.out.print(hm.toString());
        int except =0;
        for(Character ch : hm.keySet()){
            if(hm.get(ch)%2 !=0 && except ==1) return 0;
            if(hm.get(ch)%2 !=0 && except ==0){
                except++;
            }
            
        }
        return 1;
    }
}
