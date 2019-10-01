import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day2{

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
                double tip = meal_cost *((double)tip_percent/100);
                 
                double  tax = meal_cost * ((double)tax_percent/100);
               
                float tot = (float)meal_cost + (float)tip +(float) tax;
                System.out.println("The total meal cost is " +Math.round(tot)+ " dollars.");

    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = sc.nextDouble();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        sc.close();
    }
}
