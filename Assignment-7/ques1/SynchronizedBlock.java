class Squares {
    void findSquare(int x) {
        synchronized (this) {
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
}

public class SynchronizedBlock {
    public static void main(String[] args) {
        final Squares c = new Squares();
        Thread t1 = new Thread() {
            public void run() {
                c.findSquare(5);
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                c.findSquare(6);
            }
        };
        t1.start();
        t2.start();
    }
}
