import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(hcf(a,b));
    }
    public static int hcf(int a, int b){
        int gtr = a>b?a:b;
        int lsr = a<b?a:b;
        int rem =1;
        while(rem!=0){
            rem = gtr%lsr;
            gtr = lsr;
            lsr = rem;
        }
        return gtr;
    }
}
