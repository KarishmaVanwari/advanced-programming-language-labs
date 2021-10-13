import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Runtime a = Runtime.getRuntime();
        a.addShutdownHook(new Thread() {
            public void run() {
                System.out.println("Shutdown Hook of thread 1 completed");
            }
        });
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        a.addShutdownHook(new Thread() {
            public void run() {
                System.out.println("Shutdown Hook of thread 2 completed");
            }
        });
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        a.addShutdownHook(new Thread() {
            public void run() {
                System.out.println("Shutdown Hook of thread 3 completed");
            }
        });
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
