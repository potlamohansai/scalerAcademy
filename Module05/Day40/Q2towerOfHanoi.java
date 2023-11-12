public class Solution {

    public static void toh(int n, int A, int B, int C, ArrayList<ArrayList<Integer>> ans){
        if(n==0) return;
        toh(n-1, A, C, B,ans);
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(n);
        temp.add(A);
        temp.add(C);
        ans.add(temp);
        toh(n-1, B, A, C,ans);
    }

    public ArrayList<ArrayList<Integer>> towerOfHanoi(int A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

        toh(A, 1, 2, 3, ans);

        return ans;
        
    }
}
