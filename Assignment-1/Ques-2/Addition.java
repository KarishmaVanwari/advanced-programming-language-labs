// Question 2

import java.util.Scanner;

class AddTwoOperands {
    int num1;
    int num2;

    AddTwoOperands(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void sum() {
        System.out.println("Sum = " + num1 + " + " + num2 + " = " + (num1 + num2));
    }
}

class AddThreeOperands {
    int num1;
    int num2;
    int num3;

    AddThreeOperands(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    void sum() {
        System.out.println("Sum = " + num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3));
    }
}

class AddFourOperands {
    int num1;
    int num2;
    int num3;
    int num4;

    AddFourOperands(int num1, int num2, int num3, int num4) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }

    void sum() {
        System.out.println(
                "Sum = " + num1 + " + " + num2 + " + " + num3 + " + " + num4 + " = " + (num1 + num2 + num3 + num4));

    }
}

public class Addition {
    public static void main(String args[]) {
        System.out.println("1. Add two operands");
        System.out.println("2. Add three operands");
        System.out.println("3. Add four operands");
        System.out.println("Choose your option: ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("Enter first number: ");
                int a = sc.nextInt();
                System.out.println("Enter second number: ");
                int b = sc.nextInt();
                AddTwoOperands add2 = new AddTwoOperands(a, b);
                add2.sum();
                break;

            case 2:
                System.out.println("Enter first number: ");
                int c = sc.nextInt();
                System.out.println("Enter second number: ");
                int d = sc.nextInt();
                System.out.println("Enter third number: ");
                int e = sc.nextInt();
                AddThreeOperands add3 = new AddThreeOperands(c, d, e);
                add3.sum();
                break;
            case 3:
                System.out.println("Enter first number: ");
                int f = sc.nextInt();
                System.out.println("Enter second number: ");
                int g = sc.nextInt();
                System.out.println("Enter third number: ");
                int h = sc.nextInt();
                System.out.println("Enter fourth number: ");
                int i = sc.nextInt();
                AddFourOperands add4 = new AddFourOperands(f, g, h, i);
                add4.sum();
                break;
        }

        sc.close();
    }

}
