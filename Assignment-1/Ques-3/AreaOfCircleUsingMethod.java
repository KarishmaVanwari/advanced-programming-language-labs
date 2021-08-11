import java.util.Scanner;

public class AreaOfCircleUsingMethod {
    double  area;
    void findArea(float r){
        area = Math.PI * r * r;

    }

    void displayArea(){
        System.out.println("The area of circle is " + area + " square units.");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float r;
        System.out.println("Enter radius of circle: ");
        r = sc.nextFloat();

        AreaOfCircleUsingMethod areaOfCircle = new AreaOfCircleUsingMethod();
        areaOfCircle.findArea(r);
        areaOfCircle.displayArea();
        sc.close();

        
    }
    
}
