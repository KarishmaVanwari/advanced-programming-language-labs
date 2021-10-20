class Squares {
    synchronized void findSquares(int x) {
        System.out.println("Thread Name : " + Thread.currentThread().getName());
        for (int i = 1; i <= x; i++) {
            System.out.println("Square of " + i + " = " + (i * i));
            try {
                Thread.sleep(250);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

public class SynchronizedMethod {
    public static void main(String[] args) {
        final Squares c = new Squares();
        Thread t1 = new Thread() {
            public void run() {
                c.findSquares(6);
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                c.findSquares(8);
            }
        };
        t1.start();
        t2.start();
    }
}