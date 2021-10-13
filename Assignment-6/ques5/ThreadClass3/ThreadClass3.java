package ThreadClass3;

public class ThreadClass3 extends Thread {
    public ThreadClass3(ThreadGroup t, String name) {
        super(t, name);
    }
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running...");
    }
}
