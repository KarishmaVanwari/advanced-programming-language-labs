public class Play extends Thread {
    Cat cat;

    Play(Cat cat) {
        this.cat = cat;
    }

    public void run() {
        synchronized (cat) {
            System.out.println("Cat is now going to play...");
            if (cat.hungry) {
                System.out.println("Cat is hungry, it will first eat and then play...");
                try {
                    cat.wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Cat has finished playing...");
            cat.notify();
        }
    }
}
