import java.util.Scanner;

public class AreaOfRectangleMethod {
    float area;
    void findArea(float l, float b){
        area = l*b;
    }
    void displayArea(){
        System.out.println("The area of rectangle is " + area + " square units.");
    }
    public static void main(String[] args) {
        float l, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        l = sc.nextFloat();
        System.out.println("Enter the breadth of rectangle: ");
        b = sc.nextFloat();
        AreaOfRectangleMethod areaOfRectangle = new AreaOfRectangleMethod();
        areaOfRectangle.findArea(l, b);
        areaOfRectangle.displayArea();
        sc.close();


    }
    
}
