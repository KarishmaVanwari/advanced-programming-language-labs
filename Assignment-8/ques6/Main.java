import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        DatagramPacket packet = new DatagramPacket("hello".getBytes(), 5, InetAddress.getByName("ping.online.net"), 4444);

        System.out.println("packet.getAddress() returns: " + packet.getAddress());
        System.out.println("packet.getData() returns: " + Arrays.toString(packet.getData()));
        System.out.println("packet.getLength() returns: " + packet.getLength());
        System.out.println("packet.getOffset() returns: " + packet.getOffset());
        System.out.println("packet.getSocketAddress() returns: " + packet.getSocketAddress());
        System.out.println("Setting packet port to 54544...");
        packet.setPort(54544);
        System.out.println("sending 'hello'...");
        socket.send(packet);
        socket.close();
    }
}
