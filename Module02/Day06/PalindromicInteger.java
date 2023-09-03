import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        int temp =A;
        int result =0;

        while(temp >0){
            int digit = temp%10;
            result = result*10 +digit;
            temp /=10;
        }

        if(result == A){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
