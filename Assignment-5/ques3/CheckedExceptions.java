class CheckedExceptionsClass {

    public void first() {
        int i = 25;
        int j = 0;
        try {
            int d = i / j;
            System.out.println(d);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        System.out.println("First method executes...");
    }

    public void second() {
        try {
            int a[] = { 1, 2, 3, 4, 5 };
            System.out.println(a[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("Second method executes...");

    }

    public void third() {
        String s = null;
        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        System.out.println("Third method executes...");
    }
}

class CheckedExceptions {
    public static void main(String args[]) {
        CheckedExceptionsClass c = new CheckedExceptionsClass();
        c.first();
        c.second();
        c.third();
    }
}
