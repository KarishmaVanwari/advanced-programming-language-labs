import t1.*;
import t2.*;
import t3.*;
import java.io.*;


public class Main
{
 public static void main(String args[])throws IOException {
 InputStreamReader imp = new InputStreamReader(System.in);
 BufferedReader br = new BufferedReader(imp);
 toy1 x=new toy1();
 toy2 y=new toy2();
 toy3 z= new toy3();
 System.out.print("Enter type of toy: ");
 String tt=br.readLine();
 System.out.print("Enter name of toy: ");
 String n=br.readLine();
 System.out.print("Enter cost of toy: ");
 double c=Double.parseDouble(br.readLine());
 z.setToytype(tt);
 z.getToytype();
 z.dis();
 y.setName(n);
 y.getName();
 y.setCost(c);
 y.getCost();
 y.display();
 System.out.println("\n");
 x.start();
 x.pause();
 x.stop();
 }
}