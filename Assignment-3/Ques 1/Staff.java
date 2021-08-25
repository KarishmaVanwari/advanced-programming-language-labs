
import java.util.Scanner;

public class Staff extends Student {
    Scanner sc = new Scanner(System.in);
    private String name, work;

    void inputData() {
        System.out.print("Enter the name of staff: ");
        name = sc.nextLine();
        System.out.print("Enter the work: ");
        work = sc.nextLine();

    }

    void displayData() {
        System.out.println("The name of staff is " + name);
        System.out.println("The work of staff is " + work);

    }

}
