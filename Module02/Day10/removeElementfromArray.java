import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        int[] ans = new int[n-1];

        for(int i=0,j=0; i<n; i++){
            if(i != x-1){
                ans[j] = arr[i];
                j++;
            }
        }
        for(int i: ans){
            System.out.print(i+" ");
        }
        
        
    }
}
