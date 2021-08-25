import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    private String name;
    private long phoneNo;
    private int rollNo;

    void inputData() {
        System.out.print("Enter the name of student: ");
        name = sc.nextLine();
        System.out.print("Enter the roll number of student: ");
        rollNo = sc.nextInt();
        System.out.print("Enter the phone number of student: ");
        phoneNo = sc.nextLong();


    }

    void displayData(){
        System.out.println("Name of the student is " + name);
        System.out.println("Roll number of the student is " + rollNo);
        System.out.println("Phone number of the student is " + phoneNo);

    }

}