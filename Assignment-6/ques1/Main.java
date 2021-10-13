class CustomThread implements Runnable {
    public void run() {
        System.out.println("State of thread " + Thread.currentThread().getName() + " is -> RUNNING");
        try {
            Thread.sleep(1400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        CustomThread customThread = new CustomThread();
        Thread sachin = new Thread(customThread, "Sachin");
        Thread virat = new Thread(customThread, "Virat");
        Thread sehwag = new Thread(customThread, "Sehwag");

        
        System.out.println("State of Sachin is -> " + sachin.getState());
        System.out.println("State of Virat is -> " + virat.getState());
        System.out.println("State of Sehwag is -> " + sehwag.getState());
        sachin.start();
        System.out.println("State of thread Sachin after invoking start method on it -> " + sachin.getState());
        virat.start();
        System.out.println("State of thread Virat after invoking start method on it -> " + virat.getState());
        sehwag.start();
        System.out.println("State of thread Sehwag after invoking start method on it -> " + sehwag.getState());
        System.out.println("Now, State of Sachin is -> " + sachin.getState());
        System.out.println("Now, State of Virat is -> " + virat.getState());
        System.out.println("Now, State of Sehwag is -> " + sehwag.getState());


        try {
            sehwag.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("State of thread Sachin when it completes it's execution is -> " + sachin.getState());
        System.out.println("State of thread Virat when it completes it's execution is -> " + virat.getState());
        System.out.println("State of thread Sehwag when it completes it's execution is -> " + sehwag.getState());

    }
}
