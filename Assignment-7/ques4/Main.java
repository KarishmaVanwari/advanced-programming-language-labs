public class Main {
    public static void main(String[] args) {
        Cat c = new Cat(true);
        Play play = new Play(c);
        Eat eat = new Eat(c);
        Sleep sleep = new Sleep(c);
        play.start();
        eat.start();
        sleep.start();
    }
}
