class DemoClass1 {
}

class DemoClass2 {
}

class DemoClass3 {
}

class DemoClass4 {
}

public class Deadlock {
    public static void main(String[] args) {
        DemoClass1 a = new DemoClass1();
        DemoClass2 b = new DemoClass2();
        DemoClass3 c = new DemoClass3();
        DemoClass4 d = new DemoClass4();
        Thread t1 = new Thread() {
            public void run() {
                synchronized (a) {
                    System.out.println("Locked A and waiting for B to get unlocked...");
                    try {
                        sleep(150);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (b) {

                    }
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                synchronized (b) {
                    System.out.println("Locked B and waiting for C to get unlocked...");
                    try {
                        sleep(150);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (c) {

                    }
                }
            }
        };
        Thread t3 = new Thread() {
            public void run() {
                synchronized (c) {
                    System.out.println("Locked C and waiting for D to get unlocked...");
                    try {
                        sleep(150);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (d) {

                    }
                }
            }
        };
        Thread t4 = new Thread() {
            public void run() {
                synchronized (d) {
                    System.out.println("Locked D and waiting for A to get unlocked...");
                    try {
                        sleep(150);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (a) {

                    }
                }
            }
        };
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}