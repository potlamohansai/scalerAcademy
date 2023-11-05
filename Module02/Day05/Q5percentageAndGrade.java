/*
Write a program to calculate the percentage (according to marks of a student) and grade (according to the percentage of a student). Five numbers(A, B, C, D & E) represent the marks of a student in 5 subjects which are out of 100. Print the percentage and the grade of the student.

If percentage >= 90% : Grade A
If percentage >= 80% but <90 : Grade B
If percentage >= 70% but <80: Grade C
If percentage >= 60% but <70: Grade D
If percentage >= 40% but <60: Grade E
If percentage < 40%: Grade F


NOTE: You have to take the lowest integer of the percentage. E.g. 90.8% will be treated as 90%
*/

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
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int percentage = ((a+b+c+d+e)/5);

        System.out.println(percentage);

        if(percentage >=90) {
            System.out.println("A");
        }else if (percentage >=80 && percentage <90){
            System.out.println("B");
        }else if (percentage >=70 && percentage <80){
            System.out.println("C");
        }else if (percentage >=60 && percentage <70){
            System.out.println("D");
        }else if (percentage >=40 && percentage <60){
            System.out.println("E");
        }else{
            System.out.println("F");
        }
    }
}
