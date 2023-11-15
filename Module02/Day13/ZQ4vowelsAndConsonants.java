/*
Problem Description
Write a program to input T strings (S) from user and print count of vowels and consonants in it.



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
            int vowels = 0;
            int consonents =0;
            int n = s.length();

            for(int i=0; i<n; i++){
                char ch = s.charAt(i);
                if(ch == 'a' || ch =='e'|| ch == 'i' || ch=='o'|| ch=='u') vowels++;
                else consonents++; 
            }
            System.out.println(vowels+" "+consonents);
        }
        
    }
}
