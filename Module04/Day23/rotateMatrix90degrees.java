//USING ARRAYS
public class Solution {
    public void solve(int[][] A) {
        int n = A.length;

//logic for transpose of a square matrix
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

// logic for reverse of matrix from first column to last column
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1-j ; j++){
                int temp = A[i][n-1-j];
                A[i][n-1-j] = A[i][j];
                A[i][j] = temp;
            }
        }
    }
}



//USING ARRAYLIST
public class Solution {
    public void solve(ArrayList<ArrayList<Integer>> A) {
        int n = A.size();

        for(int i=0; i<n; i++){
            for(int j= i+1; j<n; j++){
                int temp = A.get(i).get(j);
                A.get(i).set(j, A.get(j).get(i));
                A.get(j).set(i, temp);            }
        }

        for(int i=0 ; i<n; i++){
            for(int j=0; j<n-1-j; j++){
                int temp = A.get(i).get(n-1-j);
                A.get(i).set(n-1-j, A.get(i).get(j));
                A.get(i).set(j, temp);
            }
        }
    }
}

