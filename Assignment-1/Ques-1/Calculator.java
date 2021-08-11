// Question 1

import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) {

        Scanner op = new Scanner(System.in);
        System.out.println("Enter operation (+,-,*,/,&,|,~): ");
        String operation = op.nextLine();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        int b;
        if (!operation.equals("~")) {

            System.out.println("Enter second number : ");
            b = sc.nextInt();
            if (operation.equals("+")) {
                System.out.println(a + " + " + b + " = " + (a + b));
            }
    
            if (operation.equals("-")) {
                System.out.println(a + " - " + b + " = " + (a - b));
            }
    
            if (operation.equals("*")) {
                System.out.println(a + " * " + b + " = " + (a * b));
            }
    
            if (operation.equals("/")) {
                double c =b;
                double ans = a/c;
                System.out.println(a + " / " + b + " = " + ans);
            }
    
            if (operation.equals("&")) {
                System.out.println(a + " & " + b + " = " + (a & b));
            }
    
            if (operation.equals("|")) {
                System.out.println(a + " | " + b + " = " + (a | b));
            }
        }
        

        else  {
            System.out.println("~ " + a + " = " + (~a));
        }

        op.close();
        sc.close();

    }
}
