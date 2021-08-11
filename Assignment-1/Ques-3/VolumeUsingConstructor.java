import java.util.Scanner;

public class VolumeUsingConstructor {

    float volume;

    VolumeUsingConstructor(float h, float w, float d) {
        volume = h * w * d;
    }

    void displayVolume() {
        System.out.println("Volume of the box is " + volume + " cubic units.");
    }

    public static void main(String args[]) {
        float h, w, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height: ");
        h = sc.nextFloat();
        System.out.println("Enter width: ");
        w = sc.nextFloat();
        System.out.println("Enter depth: ");
        d = sc.nextFloat();

        VolumeUsingConstructor box = new VolumeUsingConstructor(h, w, d);
        box.displayVolume();

        sc.close();

    }

}
