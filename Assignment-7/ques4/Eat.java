public class Eat extends Thread {
    Cat cat;

    Eat(Cat cat) {
        this.cat = cat;
    }

    public void run() {
        synchronized (cat) {
            System.out.println("Cat is now going to eat...");
            cat.hungry = false;
            System.out.println("Cat has finished eating...");
            cat.notifyAll();
        }
    }
}
