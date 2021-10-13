public class Main {
    public static void main(String[] args) {
        Thread sania = new Thread() {
            public void run() {
                System.out.println("State of thread Sania is -> RUNNING");
                try {
                    System.out.println("Sania will now sleep for 100ms...");
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread maria = new Thread() {
            public void run() {
                System.out.println("State of thread Maria is -> RUNNING");
                try {
                    System.out.println("Maria will now sleep for 200ms...");
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread serena = new  Thread() {
            public void run() {
                System.out.println("State of thread Serena is -> RUNNING");
                try {
                    System.out.println("Serena will now sleep for 300ms...");
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Calling yield() method on Serena");
                Thread.yield();
                System.out.println();
            }
        };
        sania.setName("Sania");
        maria.setName("Maria");
        serena.setName("Serena");
        sania.setPriority(3);
        maria.setPriority(7);
        serena.setPriority(5);
        System.out.println("Calling method run() on thread Sania, Maria and Serena");
        sania.run();
        maria.run();
        serena.run();
        System.out.println("Calling method start() on Sania, Maria and Serena");
        sania.start();
        maria.start();
        serena.start();
        System.out.println("Priority of Sania : " + sania.getPriority());
        System.out.println("Priority of Maria : " + maria.getPriority());
        System.out.println("Priority of Serena : " + serena.getPriority());
        
        System.out.println("Calling method suspend() on Sania");
        sania.suspend();
        try {
            System.out.println("Calling join() on Maria");
            maria.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Calling method resume() on Sania");
        sania.resume();
    }
}
