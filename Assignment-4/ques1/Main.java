import MCA.Student;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		int total;
		float percentage;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = sc.nextLine();

		System.out.print("Enter your roll number: ");
		int rollNo = sc.nextInt();

		System.out.println();

		System.out.print("Enter your Physics marks: ");
		int phy = sc.nextInt();

		System.out.print("Enter your Chemistry marks: ");
		int chem = sc.nextInt();

		System.out.print("Enter your Mathematics marks: ");
		int maths = sc.nextInt();

		System.out.print("Enter your Biology marks: ");
		int bio = sc.nextInt();

		total = phy + chem + maths + bio;
		percentage = ((phy + chem + maths + bio) * 100) / 400;

		Student s = new Student(name, rollNo, phy, chem, maths, bio);
		System.out.println("");
		s.display(total, percentage);

	}
}
