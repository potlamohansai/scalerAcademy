public class Solution {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        int m = A.size();
        int n = A.get(0).size();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

//Printing diagonals upto all columns
        for(int j=0; j<m; j++){
            ArrayList<Integer> coldia = new ArrayList<Integer>();
            int r = 0, c=j;
            while(r<n && c>=0){
                coldia.add(A.get(r).get(c));
                r++;c--;
            }
            while(coldia.size()<n){              // for adding zeros to make the answer matrix as size n
                coldia.add(0);
            }
            ans.add(coldia);
        }
      
//Printing diagonals upto all rows so that total diagonals can be printed
        for(int i=1; i<n; i++){
            ArrayList<Integer> rowdia = new ArrayList<Integer>();
            int r=i, c=m-1;
            while(r<n && c>=0){
                rowdia.add(A.get(r).get(c));
                r++;c--;
            }
            while(rowdia.size()<n){                 // for adding zeros to make the answer matrix as size n
                rowdia.add(0);
            }
            ans.add(rowdia);
        }
        return ans;

    }
}
