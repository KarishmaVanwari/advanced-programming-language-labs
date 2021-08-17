import java.util.Scanner;

public class WriteOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text to set: ");
        String str = sc.nextLine();
        Text t = new Text();
        t.setText(str);
        System.out.println("Text set successfully!");

        sc.close();
    }

}

class Text {
    private String msg;

    public void setText(String s) {
        msg = s;
    }
}