
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("New student creation...");

        student.inputData();
        System.out.println();

        System.out.println("Displaying student data...");
        student.displayData();
        System.out.println();

        Teacher teacher = new Teacher();
        System.out.println("New teacher creation...");
        teacher.inputData();
        System.out.println();

        System.out.println("Displaying teacher data...");
        teacher.displayData();
        System.out.println();
        Staff staff = new Staff();
        System.out.println("New staff creation...");
        staff.inputData();
        System.out.println();

        System.out.println("Displaying staff data...");
        staff.displayData();
        System.out.println();

        Teacher.Science science = teacher.new Science();
        System.out.println("New science group...");
        science.getNum();
        System.out.println();

        System.out.println("Displaying science group details...");
        science.displayNum();
        System.out.println();

        Teacher.Arts arts = teacher.new Arts();
        System.out.println("New Arts group...");
        arts.getNum();
        System.out.println();

        System.out.println("Displaying arts group details...");
        arts.displayNum();
        System.out.println();

        Teacher.Commerce commerce = teacher.new Commerce();
        System.out.println("New Commerce group...");
        commerce.getNum();
        System.out.println();

        System.out.println("Displaying commerce group details...");
        commerce.displayNum();
        System.out.println();
    }
}
