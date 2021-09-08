
import vaccination.Citizen;
import vaccination.*;

public class Main {
    public static void main(String[] args) {
        Citizen adult = new Vaccine("Rohan", "987456311", "7410258", 28);
        try {
            adult.verifyAge();
        } catch (Exception e) {
            System.out.println(e);
        }
        Citizen child = new Vaccine("Divya", "963002530", "1010101", 15);
        try {
            child.verifyAge();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
