public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        int row = A.size();
        int col = A.get(0).size();

// for making rows -1 by checking Zero in rows
        for(int i=0; i<row; i++){
            int flag=0;
            for(int j=0; j<col; j++){
                if(A.get(i).get(j) == 0){
                    flag=1;
                    break;
                }
                
            }
            if(flag ==1){
                for(int j=0; j<col; j++){
                    if(A.get(i).get(j) !=0){
                        A.get(i).set(j,-1);
                    }
                } 
            }
              
        }

// for making columns -1 by checking Zero in columns
        for(int j=0; j<col; j++){
            int flag=0;
            for(int i=0; i<row; i++){
                if(A.get(i).get(j) == 0){
                    flag=1;
                    break;
                }
            }
            if(flag ==1){
                for(int i=0; i<row; i++){
                    if(A.get(i).get(j) !=0){
                        A.get(i).set(j,-1);
                    }
                }
            }
            
        }

//for making all -1s to Zeros to get final ans
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(A.get(i).get(j) == -1){
                    A.get(i).set(j,0);
                }
            }
        }
        return A;
    }
}
