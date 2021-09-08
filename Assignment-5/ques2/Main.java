import java.io.*;
import list.*;
import java.util.*;

public class Main {
    public static void main(String args[])throws IOException
    {
        // InputStreamReader imp=new InputStreamReader(System.in);
        // BufferedReader br=new BufferedReader(imp);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        // int n=Integer.parseInt(br.readLine());
        int n = sc.nextInt();
        System.out.println("Enter elements of array: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            // arr[i] = Integer.parseInt(br.readLine());
            arr[i] = sc.nextInt();
        }

        Sum s = new Sum();
        Minimum mi = new Minimum();
        try {
            int m = mi.min_is(arr, n);
            int s1 = s.array_sum(arr, n);
            int result=s1/m;
            System.out.println("Answer = sum(arr)/min(arr) = "+result);

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Rest of the code.......");





    }
}
