class UncheckedExceptionsClass {
    public void first() {
        int i = 25;
        int j = 0;
        int d = i / j;
        System.out.println(d);
    }

    public void second() {
        int a[] = { 1, 2, 3, 4, 5 };
        System.out.println(a[10]);

    }
}

class UncheckedExceptions {
    public static void main(String args[]) {
        UncheckedExceptionsClass uc = new UncheckedExceptionsClass();
        uc.first();
        uc.second();
    }

}
