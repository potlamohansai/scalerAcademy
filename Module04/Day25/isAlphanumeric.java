public class Solution {
    public int solve(ArrayList<Character> A) {
        int n = A.size();
        for(int i=0; i<n; i++){
            char ch = A.get(i);
            if(!((ch >='A'&& ch <='Z')||(ch >='a'&& ch<='z'|| ch>='0'&& ch<='9'))){
                return 0;
            }
        }
        return 1;
    }
}
