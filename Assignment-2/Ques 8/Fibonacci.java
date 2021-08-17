public class Fibonacci {
    public static void main(String[] args) {
        int a =0;
        int b = 1;

        for(int c=0;c<100;c=a+b){
            System.out.println(c) ;
            a=b;
            b=c;

        }
    }
    
}
