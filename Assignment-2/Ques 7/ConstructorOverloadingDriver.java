import java.util.Scanner;

public class ConstructorOverloadingDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to multiply? (2 / 3)");
        int choose = sc.nextInt();
        System.out.println("Enter the numbers: ");
        switch(choose){
            case 2:
                int a = sc.nextInt();
                int b = sc.nextInt();
                ConstructorOverloading product1 = new ConstructorOverloading(a, b);
                break;
                case 3:
                int c = sc.nextInt();
                int d = sc.nextInt();
                int e = sc.nextInt();
                ConstructorOverloading product2 = new ConstructorOverloading(c, d, e);
                break;

        }
        sc.close();
        
    }
    
}
