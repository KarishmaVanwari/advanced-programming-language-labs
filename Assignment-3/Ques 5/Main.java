


class Sport{
    public void play(){
        System.out.println("Playing sport...");
    }
}


class Basketball extends Sport{
    @java.lang.Override
    public void play() {
        System.out.println("Playing basketball...");
    }

    public void play(int a , int b){
        System.out.println("Playing basketball with score " + a + " - " + b + ".");
    }
}




public class Main {
    public static void main(String[] args){
        Basketball basketball = new Basketball();
        basketball.play();        // overriding
        basketball.play(12,10);     // overloading
    }
}
