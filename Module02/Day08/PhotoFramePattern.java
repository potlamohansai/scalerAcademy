import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i=1; i<=n-2; i++){
            System.out.print("*");
            for(int k=1; k<=(n-2); k++){
                System.out.print(" ");
            }
            System.out.print("*\n");
        }
        for(int i=1; i<=n; i++){
            System.out.print("*");
        }

    }
}
