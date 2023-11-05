/*
Mr. T got the Electricity bill of his house. He felt that the bill amount was too much. He come to you to understand the relation between amount and number of units with Electricity bill.


Instructions are give on Electricity biil that :
1. For first 50 units Rs. 0.50/unit.
2. For next 100 units Rs. 0.75/unit.
3. For next 100 units Rs. 1.20/unit.
4. For above 250 units Rs. 1.50/unit.
5. An additional surcharge of 20% is added to the bill.

NOTE: As the electricity bill can have any real value (floating point), you have to tell the Integral value of the bill. For eg. Integral value of 2.91 is 2.

To avoid manual calculation again and again, You have to write a code which take number of Unit (suppose N) from user and print the amount.
    */



import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int units = sc.nextInt();
        double total =0;

        if(units <= 50) {
            total = units*0.5;
            System.out.println((int) (total + 0.2*total));
        }
        else if (units >50 && units <= 150){
            total = 50*0.5 + (units-50)*0.75;
            System.out.println((int) (total + 0.2*total));
        }
        else if (units >150 && units <=250){
            total = 50*0.5 + 100*0.75 + (units-150)*1.20;
            System.out.println((int) (total + 0.2*total));
        }
        else if(units >250){
            total = 50*0.5 + 100*0.75 + 100*1.20 + (units-250)*1.5;
            System.out.println((int) (total + 0.2*total));
        }
    }
}
