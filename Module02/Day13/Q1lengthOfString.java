/*Problem Description
Write a program to input an integer T and then each of T lines will have a string (S).

You have to print T lines each containing length of input string.



Problem Constraints
1 <= T <= 100

1 <= S.size() <= 1000
  */


import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            String s = sc.next();
            System.out.println(s.length());
        }
        
    }
}
