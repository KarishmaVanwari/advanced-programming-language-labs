package ThreadClass1;

public class ThreadClass1 extends Thread {
    public ThreadClass1(ThreadGroup t, String name) {
        super(t, name);
    }
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running...");
    }
}