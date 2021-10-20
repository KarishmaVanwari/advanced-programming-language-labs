public class Main {

  public static void main(String[] args) throws InterruptedException {
    Object obj = new Object();
    Thread t1 = new Thread() {
      public void run() {
        System.out.println(
          Thread.currentThread().getName() + ": Going to sleep for 100ms"
        );
        try {
          sleep(100);
        } catch (InterruptedException e) {
          System.out.println(
            Thread.currentThread().getName() +
            ": Sleep interrupted! Handle this exception"
          );
        }
      }
    };
    Thread t2 = new Thread() {
      public void run() {
        System.out.println(
          Thread.currentThread().getName() + ": Wait for 200ms"
        );
        try {
          obj.wait(200);
        } catch (Exception e) {
          System.out.println(
            Thread.currentThread().getName() +
            ": Wait interrupted! Handle this exception"
          );
        }
      }
    };
    Thread t3 = new Thread() {
      public void run() {
        System.out.println(
          Thread.currentThread().getName() +
          ": Interrupted yet? " +
          Thread.interrupted() +
          " ... Reset interruption status"
        );
        System.out.println(
          Thread.currentThread().getName() + ": No sleep or wait"
        );
      }
    };
    Thread t4 = new Thread() {
      public void run() throws RuntimeException {
        System.out.println(
          Thread.currentThread().getName() +
          ": Going to sleep for 300ms... Do not disturb!"
        );
        try {
          sleep(300);
        } catch (InterruptedException e) {
          System.out.println(
            Thread.currentThread().getName() +
            ": Sleep was interrupted! NOT handle this exception!"
          );
          throw new RuntimeException("Thread interrupted in sleep");
        }
      }
    };
    t1.start();
    t1.interrupt();
    t2.start();
    t2.interrupt();
    t3.start();
    t3.interrupt();
    System.out.println(
      t3.getName() + " interruption status: " + t3.isInterrupted()
    );
    t4.start();
    try {
      t4.interrupt();
    } catch (RuntimeException e) {}
  }
}
