import java.util.Scanner;

public class AreaOfShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the corresponding number of the shape to find it's area: ");
        System.out.println("1. Circle");
        System.out.println("2. Pentagon");
        System.out.println("3. Triangle");
        System.out.println("4. Square");
        System.out.println("5. Rectangle");
        System.out.print("Choose number: ");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.print("Enter the radius of circle: ");
                double r = sc.nextDouble();
                System.out.println("The area of circle is " + (Math.PI * r * r) + " square units. ");
                break;
            case 2:
                System.out.print("Enter the side length of pentagon: ");
                double s = sc.nextDouble();
                System.out.println("The area of pentagon is " + ((s * s * Math.sqrt(5 * (5 + 2 * Math.sqrt(5)))) / 4)
                        + " square units. ");
                break;

            case 3:
                System.out.print("Enter the height of triangle: ");
                double h = sc.nextDouble();
                System.out.print("Enter the breadth of triangle: ");
                double b = sc.nextDouble();
                System.out.println("The area of triangle is " + (b * h / 2) + " square units. ");
                break;

            case 4:
                System.out.print("Enter the side length of square: ");
                double a = sc.nextDouble();
                System.out.println("The area of square is " + (a * a) + " square units. ");
                break;

            case 5:
                System.out.print("Enter the length of rectangle: ");
                double l = sc.nextDouble();
                System.out.print("Enter the breadth of rectangle: ");
                double m = sc.nextDouble();
                System.out.println("The area of rectangle is " + (l * m) + " square units. ");
                break;


        }

        sc.close();

    }

}
