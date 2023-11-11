/*Take an integer N as input, print the corresponding pattern for N.

For example if N = 5 then pattern will be like:

1
1_
1_3
1_3_
1_3_5
Note : Here '_' represents space for explanation purpose only. You have to print space in your code.


Problem Constraints
1 <= N <= 100
  */

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int row=1; row<=n; row++){
            for(int col=1; col <=row; col++){
                if(col%2==1){
                    System.out.print(col);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
