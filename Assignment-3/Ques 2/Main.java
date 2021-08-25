import java.util.Scanner;

abstract class Arithmetic {
    abstract public double addition(double a, double b);

    abstract public double subtraction(double a, double b);

    abstract public double division(double a, double b);

    abstract public double multiplication(double a, double b);
}

class Add extends Arithmetic {
    @Override
    public double addition(double a, double b) {
        return a + b;
    }

    @Override
    public double subtraction(double a, double b) {
        return 0;
    }

    @Override
    public double division(double a, double b) {
        return 0;
    }

    @Override
    public double multiplication(double a, double b) {
        return 0;
    }
}

class Sub extends Arithmetic {
    @Override
    public double addition(double a, double b) {
        return 0;
    }

    @Override
    public double subtraction(double a, double b) {
        return a - b;
    }

    @Override
    public double division(double a, double b) {
        return 0;
    }

    @Override
    public double multiplication(double a, double b) {
        return 0;
    }
}

class Multiply extends Arithmetic {
    @Override
    public double addition(double a, double b) {
        return 0;
    }

    @Override
    public double subtraction(double a, double b) {
        return 0;
    }

    @Override
    public double division(double a, double b) {
        return 0;
    }

    @Override
    public double multiplication(double a, double b) {
        return a * b;
    }
}

class Div extends Arithmetic {
    @Override
    public double addition(double a, double b) {
        return 0;
    }

    @Override
    public double subtraction(double a, double b) {
        return 0;
    }

    @Override
    public double division(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Denominator cannot be zero...");
            return 0;
        }
    }

    @Override
    public double multiplication(double a, double b) {
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                Add sum = new Add();
                // double ans = ;
                System.out.println("Result: " + sum.addition(a, b));
                break;

            case 2:
                Sub diff = new Sub();
                // double ans =;
                System.out.println("Result: " +  diff.subtraction(a, b));
                break;

            case 3:
                Multiply product = new Multiply();
                // double ans =;
                System.out.println("Result: " +  product.multiplication(a, b));
                break;

            case 4:
                Div quo = new Div();
                // double ans = ;
                System.out.println("Result: " + quo.division(a, b));
                break;


            default:
                System.out.println("Wrong choice....");
                break;


        }
        // if (choice == 1) {
        // Add obj = new Add();
        // double ans = obj.addition(a, b);
        // System.out.println("Result: " + ans);
        // } else if (choice == 2) {
        // Sub obj = new Sub();
        // double ans = obj.subtraction(a, b);
        // System.out.println("Result: " + ans);
        // } else if (choice == 3) {
        // Multiply obj = new Multiply();
        // double ans = obj.multiplication(a, b);
        // System.out.println("Result: " + ans);
        // }

        // else if (choice == 4) {
        // Div obj = new Div();
        // double ans = obj.division(a, b);
        // System.out.println("Result: " + ans);
        // } else {
        // System.out.println("Wrong choice....");
        // }
    }
}
