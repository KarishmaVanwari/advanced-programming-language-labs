// Question 6 

public class Operators {
    public static void main(String args[]){
        int z = 8;
        int a = z++ + ++z;
        System.out.println("a = (z++ + ++z) = " + a);
        int b = z-- + --z;
        System.out.println("b = (z-- + --z) = " + b);
        int c = z++;
        System.out.println("c = (z++) = " + c);
        int d = ++z;
        System.out.println("d = (++z) = " + d);
        int e = z--;
        System.out.println("e = (z--) = " + e);
        int f =  --z;
        System.out.println("f = (--z) = " + f);


    }
}
