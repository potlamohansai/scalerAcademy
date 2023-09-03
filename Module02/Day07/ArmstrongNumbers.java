import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            int temp =i;
            int sum =0;
            while(temp>0){
                int digit = temp%10;
                sum += (digit*digit*digit);
                temp /=10;
            }
            if(sum==i){
                System.out.println(i);
            }
        }
        
    }
}
