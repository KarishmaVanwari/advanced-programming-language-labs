package t1;

interface t1 {
    void start();
    void pause();
    void stop();
}
public class toy1 implements t1
{
    public void start()
    {
        System.out.println("Start playing with the toy");
    }


    public void pause() {
        System.out.println("Wait....for a while and take rest");
    }


    public void stop() {
        System.out.println("Time over!!.... stop playing with the toy");
    }
}
