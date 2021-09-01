import java.util.Scanner;

class Sort {
    // int arr[] = { 4, 7, 1, 2, 3, 8, 9, 0, 5, 6 };

    public void sort(int[]arr) {
        try {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9 - i ; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        } catch (Exception e) {
            System.out.print("Exception detected");
        }
    }

    public void display(int[]arr) {
        System.out.print("Sorted numbers are: ");

        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class Divide {
    // int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150 };

    public void division(int[]arr, int n) {
        try {
            for (int i = 0; i < 15; i++) {
                arr[i] = arr[i] / n;
            }
        } catch (Exception e) {
            System.out.print("Integer number cannot be divided by 0");
        }
    }

    public void display(int[]arr) {
        System.out.print("New array is: ");

        for (int i = 0; i < 15; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class Main {
    public static void main(String args[]) {
        System.out.println("Enter the array of 10 numbers to sort: ");
        Scanner sc = new Scanner(System.in);
        int[] arrToSort= new int[10];

        for(int i =0;i<10;i++){
            arrToSort[i] = sc.nextInt();
        }
        Sort s = new Sort();
        
        s.sort(arrToSort);
        s.display(arrToSort);

        System.err.println();
        
        System.out.println("Enter the array of 15 numbers to divide: ");
        int[] arrToDivide= new int[15];

        for(int i =0;i<15;i++){
            arrToDivide[i] = sc.nextInt();
        }

        System.out.print("Enter the number to divide with: ");
        int num = sc.nextInt();
        
        Divide d = new Divide();
        d.division(arrToDivide, num);

        System.out.println();

        // d.division(10);
        d.display(arrToDivide);
    }
}