
interface Brand{
    void giveBrand();
}

interface Price{
    void givePrice();
}


class Mobile implements Brand, Price{
    public void giveBrand(){
        System.out.println("The mobile is of the brand Samsung.");
    }
    public void givePrice(){
        System.out.println("The price of the mobile is Rs. 49,999.");
    }
}
public class Part1 {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.giveBrand();
        mobile.givePrice();
    }
}
