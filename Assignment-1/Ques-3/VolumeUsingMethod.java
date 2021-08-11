import java.util.Scanner;

public class VolumeUsingMethod {
    float volume;
    void findVolume(float h, float w, float d){
        volume = h*w*d;
    }
    void displayVolume(){
        System.out.println("Volume of the box is "+ volume + " cubic units.");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float h, w, d;
        System.out.println("Enter height: ");
        h = sc.nextFloat();
        System.out.println("Enter width: ");
        w = sc.nextFloat();
        System.out.println("Enter depth: ");
        d = sc.nextFloat();

        VolumeUsingMethod box = new VolumeUsingMethod();
        box.findVolume(h, w, d);
        box.displayVolume();
        sc.close();
    }
    
}
