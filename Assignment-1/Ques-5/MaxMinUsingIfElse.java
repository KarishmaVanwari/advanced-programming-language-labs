// Question 5 - Part 1 

import java.util.Scanner;

public class MaxMinUsingIfElse {
    public static void main(String args[]) {
        System.out.println("Enter four numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if ((a > b) && (a > c) && (a > d)) {
            System.out.println("Maximum number is " + a);
        } 

        else if ((b > a) && (b > c) && (b > d)) {
            System.out.println("Maximum number is " + b);
        } 

        else if ((c > a) && (c > b) && (c > d)) {
            System.out.println("Maximum number is " + c);
        }

        else if ((d > a) && (d > b) && (d > c)) {
            System.out.println("Maximum number is " + d);
        }




        if ((a < b) && (a < c) && (a < d)) {
            System.out.println("Minimum number is " + a);
        } 
        
        else if ((b < a) && (b < c) && (b < d)) {
            System.out.println("Minimum number is " + b);
        } 

        else if ((c < a) && (c < b) && (c < d)) {
            System.out.println("Minimum number is " + c);
        }

        else if ((d < a) && (d < b) && (d < c)) {
            System.out.println("Minimum number is " + d);
        }
        sc.close();
    }

}
