import java.util.Scanner;

public class Main {
    long binaryToDecimal(long n, long pos) {
        if (n == 0)
            return 0;
        if (n % 10 == 1) {

            return (int) (Math.pow(2, pos)) + binaryToDecimal(n / 10, pos + 1);
        } else {
            return binaryToDecimal(n / 10, pos + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Binary to Decimal Converter");
        System.out.print("Enter the binary number: ");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        Main obj = new Main();
        long ans = obj.binaryToDecimal(n, 0);
        System.out.println("Decimal equivalent of " + n + " is " + ans);

        sc.close();
    }
}
