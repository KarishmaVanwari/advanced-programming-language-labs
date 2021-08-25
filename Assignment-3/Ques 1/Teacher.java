
import java.util.Scanner;

public class Teacher extends Student {
    Scanner sc = new Scanner(System.in);
    private String name, areaOfTeaching;

    void inputData() {
        System.out.print("Enter the name of teacher: ");
        name = sc.nextLine();
        System.out.print("Enter the area of teaching: ");
        areaOfTeaching = sc.nextLine();

    }

    void displayData() {
        System.out.println("The name of teacher is " + name);
        System.out.println("The area of teaching is " + areaOfTeaching);

    }

    class Science {
        int num;

        public void getNum(){
            System.out.print("Enter the no of students in Science stream: ");
            num = sc.nextInt();

        }

        public void displayNum(){
            System.out.println("The number of students in science stream is "  + num);
        }



        

    }

    class Arts {
        int num;

        public void getNum(){
            System.out.print("Enter the no of students in Arts stream: ");
            num = sc.nextInt();

        }

        public void displayNum(){
            System.out.println("The number of students in arts stream is "  + num);
        }



        

    }

    class Commerce {
        int num;

        public void getNum(){
            System.out.print("Enter the no of students in commerce stream: ");
            num = sc.nextInt();

        }

        public void displayNum(){
            System.out.println("The number of students in commerce stream is "  + num);
        }



        

    }



    

}
