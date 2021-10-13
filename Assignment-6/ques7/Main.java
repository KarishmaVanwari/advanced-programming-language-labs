import java.io.IOException;

public class Main {
    public void finalize() {
        System.out.println("Garbage collected...");
    }

    public static void main(String[] args) throws IOException {
        Main a = new Main();
        a = null;
        System.gc();
        Runtime r = Runtime.getRuntime();
        r.exec("notepad");
        r.exec("touch mythread.java");
    }
}