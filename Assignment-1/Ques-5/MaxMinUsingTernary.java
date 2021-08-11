// Question 5 - Part 2

import java.util.Scanner;

public class MaxMinUsingTernary {
    public static void main(String args[]) {
        System.out.println("Enter four numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int max, min;
        max = (a > b && a > c && a > d) ? a : (b > c && b > d) ? b : (c > d) ? c : d;
        System.out.println("Maximum number is " + max);
        min = (a < b && a < c && a < d) ? a : (b < c && b < d) ? b : (c < d) ? c : d;
        System.out.println("Minimum number is " + min);

        sc.close();

    }

}
