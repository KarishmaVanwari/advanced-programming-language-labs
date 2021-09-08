public class Main {
    public static void main(String[] args) {
        try {
            first();
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Division by 0 is not allowed");
        }
    }

    public static void first() throws ArithmeticException {
        second();
    }

    public static void second() throws ArithmeticException {
        third();
    }

    public static void third() throws ArithmeticException {
        fourth();
    }

    public static void fourth() throws ArithmeticException {
        int x = 101 / 0;
        System.out.println(x);
    }

}