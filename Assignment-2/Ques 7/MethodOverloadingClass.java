import java.util.Scanner;

public class MethodOverloadingClass {
    static int multiply(int a, int b) {
        return a * b;
    }

    static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to multiply? (2 / 3)");
        int choose = sc.nextInt();
        System.out.println("Enter the numbers: ");
        switch(choose){
            case 2:
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Product = " + a + " * " + b  + " = " + multiply(a, b));
                break;
                case 3:
                int c = sc.nextInt();
                int d = sc.nextInt();
                int e = sc.nextInt();
                System.out.println("Product = " + c + " * " + d + " * " + e  + " = " + multiply(c, d, e));
                break;

        }
        sc.close();
    }
}