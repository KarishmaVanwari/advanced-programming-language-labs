import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8818);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream());

        System.out.println("Sending a message to server...");
        out.write("Hello Java!\n");
        out.flush();
        System.out.println("Message from Server: ");
        System.out.println(in.readLine());

        out.close();
        in.close();
        socket.close();
    }
}
