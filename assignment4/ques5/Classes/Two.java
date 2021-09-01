package Classes;

public class Two {
    private class PrivateClass {
        PrivateClass() {
            System.out.println("Constructor of PrivateClass");
        }

        void method3() {
            System.out.println("Method of PrivateClass");
        }
    }

    public Two() {
        System.out.println("Constructor of PublicClass2");
    }

    public void method2() {
        System.out.println("Method of PublicClass1");
    }

    public void useprivateClass() {
        PrivateClass priv = new PrivateClass();
        priv.method3();
    }
}
