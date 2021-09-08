import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int diff = a - b;

        try {
            int x = sum / diff;
            System.out.println("Answer = (a+b)/(a-b) = " + x);
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Division by zero not possible...");
        } finally {
            try {
                int y = sum % diff;
                System.out.println("Remainder = (a+b) % (a-b) = " + y);
            } catch (ArithmeticException e) {
                System.out.println(e);
                System.out.println("Division by zero not possible...");
            } finally {
                System.out.println("Hey, I'm from finally block!");
            }
        }
    }
}
