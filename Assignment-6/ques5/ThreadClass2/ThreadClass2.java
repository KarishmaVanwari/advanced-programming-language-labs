package ThreadClass2;

public class ThreadClass2 extends Thread {
    public ThreadClass2(ThreadGroup t, String name) {
        super(t, name);
    }
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running...");
    }
}
