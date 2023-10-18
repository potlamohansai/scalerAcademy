public class Solution {
    public String addBinary(String A, String B) {
        int i = A.length()-1;
        int j = B.length()-1;
        int carry =0;
        StringBuilder ans = new StringBuilder();

        while(i>=0 || j>=0 || carry>0) {
            int sum = carry;
            if(i>=0){
                sum += A.charAt(i) -'0';
            }
            if(j>=0){
                sum += B.charAt(j) -'0';
            }
            ans.append(sum%2);
            carry = sum/2;
            i--;j--;
        }

        ans.reverse();
        if(ans.charAt(0) == '0'){
            ans.substring(1);
            return ans.toString();
        }

        return ans.toString();

    }
}
