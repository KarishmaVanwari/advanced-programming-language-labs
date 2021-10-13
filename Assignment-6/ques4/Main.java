class ThreadA implements Runnable {
    public void run() {
        System.out.println("ThreadA is RUNNING...");
    }
}

class ThreadB implements Runnable {
    public void run() {
        System.out.println("ThreadB is RUNNING...");
    }
}

class ThreadC implements Runnable {
    public void run() {
        System.out.println("ThreadC is RUNNING...");
        int temp = 0;
        while (true) {
            System.out.println(temp);
            temp++;
        }

    }
}

public class Main {
    public static void main(String[] args) {
        Thread a = new Thread(new ThreadA());
        Thread b = new Thread(new ThreadB());
        Thread c = new Thread(new ThreadC());

        c.setDaemon(true);
        a.start();
        b.start();
        c.start();

    }
}