public class Cat {
    boolean hungry;

    Cat(boolean hungry) {
        this.hungry = hungry;
    }

    synchronized void eat() {
        System.out.println("Cat is now going to eat...");
        hungry = false;
        System.out.println("Cat has finished eating.");
        notifyAll();
    }

    synchronized void sleep() {
        System.out.println("Cat is tired and is going to sleep...");
        System.out.println("Cat is now sleeping...");
        notify();
    }

    synchronized void play() {
        System.out.println("Cat is now going to play...");
        if (hungry) {
            System.out.println("Cat is hungry...");
            try {
                wait();
            } catch (Exception e) {

            }
        }
        System.out.println("Cat has finished playing...");
    }

}