public class Main{
    public static void main(String[] args) {
        Mobile a = new Mobile("UserA", 999, "camera1");
        Mobile b = new Mobile("UserB", 1999, "camera2");
        Mobile c = new Mobile("UserA", 2999, "camera3");
        System.out.println("Details of User 1 - ");
        a.display();
        System.out.println();
        System.out.println("Details of User 2 - ");
        b.display();
        System.out.println();
        System.out.println("Details of User 3 - ");
        c.display();
    }

}