public class Sleep extends Thread {
    Cat cat;

    Sleep(Cat cat) {
        this.cat = cat;
    }

    public void run() {
        synchronized (cat) {
            System.out.println("Cat is tired and is going to sleep..");
            if (cat.hungry) {
                System.out.println("Cat is hungry, it will eat first then sleep...");
                try {
                    cat.wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Cat is now sleeping...");
            cat.notify();
        }
    }
}
