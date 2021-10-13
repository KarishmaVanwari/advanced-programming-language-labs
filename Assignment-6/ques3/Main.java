class Serena implements Runnable {
    public void run() {

        System.out.println("State of thread Serena is -> RUNNING");

        try {
            System.out.println("Serena will now sleep for 300ms...");
            Thread.sleep(300);
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Maria implements Runnable {
    public void run() {
        System.out.println("State of thread Marina is -> RUNNING");

        try {
            System.out.println("Maria will now sleep for 200ms...");
            Thread.sleep(200);
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Sania implements Runnable {
    public void run() {
        System.out.println("State of thread Sania is -> RUNNING");
        try {
            System.out.println("Sania will now sleep for 100ms...");
            Thread.sleep(100);
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread sania = new Thread(new Sania());
        Thread maria = new Thread(new Maria());
        Thread serena = new Thread(new Serena());
        sania.setPriority(3);
        maria.setPriority(3);
        serena.setPriority(3);
        System.out.println("Calling method run() on threads Sania, Maria and Serena");
        System.out.println("Calling run() on a thread makes it run in the same stack in which run is called, instead of a new one. It halts execution in this stack until it finishes running");
        sania.run();
        maria.run();
        serena.run();
        System.out.println("Calling method start() on threads Sania, Maria and Serena");
        sania.start();
        maria.start();
        serena.start();
        // System.out.println("Priority of Sania : " + sania.getPriority() + ", Maria : " + maria.getPriority()
        //         + "and Serena : " + serena.getPriority());
        System.out.println("Priority of Sania = " + sania.getPriority());
        System.out.println("Priority of Maria = " + maria.getPriority());
        System.out.println("Priority of Serena = " + serena.getPriority());
    }
}
