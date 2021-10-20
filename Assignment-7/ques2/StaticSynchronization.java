class Table {
    synchronized static void printTable(int n) {
        System.out.print("Table of " + n + " -> ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(n * i + " ");
            try {
                Thread.sleep(400);
            } catch (Exception e) {
            }
        }
        System.out.println();
    }
}

class Thread1 extends Thread {
    public void run() {
        Table.printTable(1);
    }
}

class Thread2 extends Thread {
    public void run() {
        Table.printTable(10);
    }
}

class Thread3 extends Thread {
    public void run() {
        Table.printTable(100);
    }
}


public class StaticSynchronization {
    public static void main(String t[]) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        t1.start();
        t2.start();
        t3.start();
    }
}