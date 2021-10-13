import ThreadClass1.ThreadClass1;
import ThreadClass2.ThreadClass2;
import ThreadClass3.ThreadClass3;

public class Main {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("Thread Group 1");
        Thread t1 = new ThreadClass1(threadGroup, "Thread1");
        Thread t2 = new ThreadClass2(threadGroup, "Thread2");
        Thread t3 = new ThreadClass3(threadGroup, "Thread3");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("The number of active thread(s) in the thread group are : " + threadGroup.activeCount());
        System.out.println("Name of the thread group : " + threadGroup.getName());
        threadGroup.setMaxPriority(5);
        System.out.println("Maximun priority : " + threadGroup.getMaxPriority());
        System.out.println("Is the thread group Daemon ? " + threadGroup.isDaemon());
        threadGroup.list();
        System.out.println("String equivalent of the thread group : " + threadGroup.toString());
        threadGroup.destroy();
        System.out.println("Is the thread group destroyed ? " + threadGroup.isDestroyed());
    }
}